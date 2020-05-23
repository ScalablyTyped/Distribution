package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that relate to the ASPxClientUploadControl.ValidationErrorOccurred client event.
  */
@JSGlobal("ASPxClientUploadControlValidationSettings")
@js.native
class ASPxClientUploadControlValidationSettings ()
  extends typings.devexpressWeb.ASPxClientUploadControlValidationSettings {
  /**
    * Gets the allowed file extensions.
    */
  /* CompleteClass */
  override var allowedFileExtensions: js.Array[String] = js.native
  /**
    * Gets which characters in a file name are not allowed.
    */
  /* CompleteClass */
  override var invalidFileNameCharacters: js.Array[String] = js.native
  /**
    * Gets the maximum count of files that can be selected for uploading at once.
    */
  /* CompleteClass */
  override var maxFileCount: Double = js.native
  /**
    * Gets the maximum file size.
    */
  /* CompleteClass */
  override var maxFileSize: Double = js.native
}

