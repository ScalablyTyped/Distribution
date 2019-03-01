package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FilesUploadComplete client event, which enables you to perform specific actions after all selected files have been uploaded.
  */
trait ASPxClientUploadControlFilesUploadCompleteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that contains specific information (if any) passed from the server side for further client processing.
    * Value: A string value that is the callback data passed from the server.
    */
  var callbackData: java.lang.String
  /**
    * Gets the error text to be displayed within the upload control's error frame.
    * Value: A string value that is the error text.
    */
  var errorText: java.lang.String
}

object ASPxClientUploadControlFilesUploadCompleteEventArgs {
  @scala.inline
  def apply(callbackData: java.lang.String, errorText: java.lang.String): ASPxClientUploadControlFilesUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbackData")(callbackData)
    __obj.updateDynamic("errorText")(errorText)
    __obj.asInstanceOf[ASPxClientUploadControlFilesUploadCompleteEventArgs]
  }
}

