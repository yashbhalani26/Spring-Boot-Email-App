package com.javahub.emailapp.entity;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class Contact {

	@NotNull(message = "Name can't be blank.")
	private String name;
	
	@NotNull(message = "Name can't be blank.")
	private String phone;
	
	@NotNull(message = "Email can't be blank.")
	private String email;
	
	@NotNull(message = "Subject can't be blank.")
	private String subject;
	
	@NotNull(message = "Comment can't be blank.")
	private String comment;
	
	private MultipartFile attachment;
	
	
}
