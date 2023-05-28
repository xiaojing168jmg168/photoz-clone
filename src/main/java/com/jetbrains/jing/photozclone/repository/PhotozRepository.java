package com.jetbrains.jing.photozclone.repository;

import com.jetbrains.jing.photozclone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {

}
