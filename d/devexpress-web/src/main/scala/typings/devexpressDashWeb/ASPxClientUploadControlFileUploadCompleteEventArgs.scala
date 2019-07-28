package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FileUploadComplete event.
  */
trait ASPxClientUploadControlFileUploadCompleteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that contains specific information (if any) passed from the server side for further client processing.
    * Value: A string value representing callback data passed from the server.
    */
  var callbackData: String
  /**
    * Gets the error text to be displayed within the ASPxUploadControl's error frame.
    * Value: A string value that represents the error text.
    */
  var errorText: String
  /**
    * Gets the index of a file input element within the ASPxUploadControl.
    * Value: An integer value that specifies the file input element's index.
    */
  var inputIndex: Double
  /**
    * Gets or sets a value indicating whether the uploaded file passes validation.
    * Value: true if the file is valid; otherwise, false.
    */
  var isValid: Boolean
}

object ASPxClientUploadControlFileUploadCompleteEventArgs {
  @scala.inline
  def apply(callbackData: String, errorText: String, inputIndex: Double, isValid: Boolean): ASPxClientUploadControlFileUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData, errorText = errorText, inputIndex = inputIndex, isValid = isValid)
  
    __obj.asInstanceOf[ASPxClientUploadControlFileUploadCompleteEventArgs]
  }
}

