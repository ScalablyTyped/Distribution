package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that relate to the ASPxClientUploadControl.ValidationErrorOccurred client event.
  */
trait ASPxClientUploadControlValidationSettings extends js.Object {
  /**
    * Gets the allowed file extensions.
    */
  var allowedFileExtensions: js.Array[String]
  /**
    * Gets which characters in a file name are not allowed.
    */
  var invalidFileNameCharacters: js.Array[String]
  /**
    * Gets the maximum count of files that can be selected for uploading at once.
    */
  var maxFileCount: Double
  /**
    * Gets the maximum file size.
    */
  var maxFileSize: Double
}

object ASPxClientUploadControlValidationSettings {
  @scala.inline
  def apply(
    allowedFileExtensions: js.Array[String],
    invalidFileNameCharacters: js.Array[String],
    maxFileCount: Double,
    maxFileSize: Double
  ): ASPxClientUploadControlValidationSettings = {
    val __obj = js.Dynamic.literal(allowedFileExtensions = allowedFileExtensions.asInstanceOf[js.Any], invalidFileNameCharacters = invalidFileNameCharacters.asInstanceOf[js.Any], maxFileCount = maxFileCount.asInstanceOf[js.Any], maxFileSize = maxFileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlValidationSettings]
  }
}

