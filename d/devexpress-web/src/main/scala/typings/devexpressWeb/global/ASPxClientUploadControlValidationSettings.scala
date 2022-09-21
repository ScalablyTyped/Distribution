package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that relate to the ASPxClientUploadControl.ValidationErrorOccurred client event.
  */
@JSGlobal("ASPxClientUploadControlValidationSettings")
@js.native
open class ASPxClientUploadControlValidationSettings ()
  extends StObject
     with typings.devexpressWeb.ASPxClientUploadControlValidationSettings {
  
  /**
    * Gets the allowed file extensions.
    */
  /* CompleteClass */
  var allowedFileExtensions: js.Array[String] = js.native
  
  /**
    * Gets which characters in a file name are not allowed.
    */
  /* CompleteClass */
  var invalidFileNameCharacters: js.Array[String] = js.native
  
  /**
    * Gets the maximum count of files that can be selected for uploading at once.
    */
  /* CompleteClass */
  var maxFileCount: Double = js.native
  
  /**
    * Gets the maximum file size.
    */
  /* CompleteClass */
  var maxFileSize: Double = js.native
}
