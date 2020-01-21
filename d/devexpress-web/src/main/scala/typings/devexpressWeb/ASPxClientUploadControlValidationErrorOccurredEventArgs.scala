package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.ValidationErrorOccurred event.
  */
@JSGlobal("ASPxClientUploadControlValidationErrorOccurredEventArgs")
@js.native
class ASPxClientUploadControlValidationErrorOccurredEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientUploadControlValidationErrorOccurredEventArgs class with specified settings.
    * @param errorText A string that is the error text.
    * @param invalidFiles An array of the ASPxClientUploadControlInvalidFileInfo objects that are invalid files.
    */
  def this(errorText: String, invalidFiles: js.Array[ASPxClientUploadControlInvalidFileInfo]) = this()
  /**
    * Gets or sets the error text.
    */
  var errorText: String = js.native
  /**
    * Returns an array of invalid files.
    */
  var invalidFiles: js.Array[ASPxClientUploadControlInvalidFileInfo] = js.native
  /**
    * Gets or sets a value specifying whether an alert message is displayed when the ASPxClientUploadControl.ValidationErrorOccurred event fires.
    */
  var showAlert: Boolean = js.native
  /**
    * Gets the validation settings for the selected files.
    */
  var validationSettings: ASPxClientUploadControlValidationSettings = js.native
}

