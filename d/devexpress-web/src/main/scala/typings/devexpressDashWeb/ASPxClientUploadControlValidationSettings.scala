package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that relate to the ASPxClientUploadControl.ValidationErrorOccurred client event.
  */
@JSGlobal("ASPxClientUploadControlValidationSettings")
@js.native
class ASPxClientUploadControlValidationSettings () extends js.Object {
  /**
    * Gets the allowed file extensions.
    */
  var allowedFileExtensions: js.Array[String] = js.native
  /**
    * Gets which characters in a file name are not allowed.
    */
  var invalidFileNameCharacters: js.Array[String] = js.native
  /**
    * Gets the maximum count of files that can be selected for uploading at once.
    */
  var maxFileCount: Double = js.native
  /**
    * Gets the maximum file size.
    */
  var maxFileSize: Double = js.native
}

