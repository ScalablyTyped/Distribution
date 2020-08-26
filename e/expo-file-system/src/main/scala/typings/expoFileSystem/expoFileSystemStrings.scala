package typings.expoFileSystem

import typings.expoFileSystem.fileSystemTypesMod.FileSystemAcceptedUploadHttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expoFileSystemStrings {
  @js.native
  sealed trait ExponentFileSystem extends js.Object
  
  @js.native
  sealed trait PATCH extends FileSystemAcceptedUploadHttpMethod
  
  @js.native
  sealed trait POST extends FileSystemAcceptedUploadHttpMethod
  
  @js.native
  sealed trait PUT extends FileSystemAcceptedUploadHttpMethod
  
  @js.native
  sealed trait base64 extends js.Object
  
  @js.native
  sealed trait utf8 extends js.Object
  
  @scala.inline
  def ExponentFileSystem: ExponentFileSystem = "ExponentFileSystem".asInstanceOf[ExponentFileSystem]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

