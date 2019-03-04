package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ValidationErrorOccurred event.
  */
trait ASPxClientUploadControlValidationErrorOccurredEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets the error text.
    * Value: A string value that represents the error text.
    */
  var errorText: java.lang.String
  /**
    * Returns an array of invalid files.
    * Value: An array of the ASPxClientUploadControlInvalidFileInfo objects.
    */
  var invalidFiles: js.Array[ASPxClientUploadControlInvalidFileInfo]
  /**
    * Gets or sets a value specifying whether an alert message is displayed when the ValidationErrorOccurred event fires.
    * Value: true, to display an alert message; otherwise, false.
    */
  var showAlert: scala.Boolean
  /**
    * Gets the validation settings for the selected files.
    * Value: An ASPxClientUploadControlValidationSettings object that provides validation settings.
    */
  var validationSettings: ASPxClientUploadControlValidationSettings
}

object ASPxClientUploadControlValidationErrorOccurredEventArgs {
  @scala.inline
  def apply(
    errorText: java.lang.String,
    invalidFiles: js.Array[ASPxClientUploadControlInvalidFileInfo],
    showAlert: scala.Boolean,
    validationSettings: ASPxClientUploadControlValidationSettings
  ): ASPxClientUploadControlValidationErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText, invalidFiles = invalidFiles, showAlert = showAlert, validationSettings = validationSettings)
  
    __obj.asInstanceOf[ASPxClientUploadControlValidationErrorOccurredEventArgs]
  }
}

