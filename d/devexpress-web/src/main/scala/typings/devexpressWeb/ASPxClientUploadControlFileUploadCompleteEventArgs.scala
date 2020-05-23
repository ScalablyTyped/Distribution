package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.FileUploadComplete event.
  */
trait ASPxClientUploadControlFileUploadCompleteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that contains specific information (if any) passed from the server side for further client processing.
    */
  var callbackData: String
  /**
    * Gets the error text to be displayed within the ASPxUploadControl's error frame.
    */
  var errorText: String
  /**
    * Gets the index of a <strong>file input element</strong> within the ASPxUploadControl.
    */
  var inputIndex: Double
  /**
    * Gets or sets a value indicating whether the uploaded file passes validation.
    */
  var isValid: Boolean
}

object ASPxClientUploadControlFileUploadCompleteEventArgs {
  @scala.inline
  def apply(callbackData: String, errorText: String, inputIndex: Double, isValid: Boolean): ASPxClientUploadControlFileUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFileUploadCompleteEventArgs]
  }
}

