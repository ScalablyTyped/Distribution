package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.FilesUploadComplete client event, which enables you to perform specific actions after all selected files have been uploaded.
  */
trait ASPxClientUploadControlFilesUploadCompleteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that contains specific information (if any) passed from the server side for further client processing.
    */
  var callbackData: String
  /**
    * Gets the error text to be displayed within the upload control's error frame.
    */
  var errorText: String
}

object ASPxClientUploadControlFilesUploadCompleteEventArgs {
  @scala.inline
  def apply(callbackData: String, errorText: String): ASPxClientUploadControlFilesUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFilesUploadCompleteEventArgs]
  }
}

