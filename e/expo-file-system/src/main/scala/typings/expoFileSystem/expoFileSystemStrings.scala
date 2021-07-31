package typings.expoFileSystem

import typings.expoFileSystem.fileSystemTypesMod.FileSystemAcceptedUploadHttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoFileSystemStrings {
  
  @js.native
  sealed trait ExponentFileSystem extends StObject
  @scala.inline
  def ExponentFileSystem: ExponentFileSystem = "ExponentFileSystem".asInstanceOf[ExponentFileSystem]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with FileSystemAcceptedUploadHttpMethod
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends StObject
       with FileSystemAcceptedUploadHttpMethod
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with FileSystemAcceptedUploadHttpMethod
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait base64 extends StObject
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait utf8 extends StObject
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}
