package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.ValidationErrorOccurred event.
  */
trait ASPxClientUploadControlValidationErrorOccurredEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets the error text.
    */
  var errorText: String
  /**
    * Returns an array of invalid files.
    */
  var invalidFiles: js.Array[ASPxClientUploadControlInvalidFileInfo]
  /**
    * Gets or sets a value specifying whether an alert message is displayed when the ASPxClientUploadControl.ValidationErrorOccurred event fires.
    */
  var showAlert: Boolean
  /**
    * Gets the validation settings for the selected files.
    */
  var validationSettings: ASPxClientUploadControlValidationSettings
}

object ASPxClientUploadControlValidationErrorOccurredEventArgs {
  @scala.inline
  def apply(
    errorText: String,
    invalidFiles: js.Array[ASPxClientUploadControlInvalidFileInfo],
    showAlert: Boolean,
    validationSettings: ASPxClientUploadControlValidationSettings
  ): ASPxClientUploadControlValidationErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], invalidFiles = invalidFiles.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any], validationSettings = validationSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlValidationErrorOccurredEventArgs]
  }
}

