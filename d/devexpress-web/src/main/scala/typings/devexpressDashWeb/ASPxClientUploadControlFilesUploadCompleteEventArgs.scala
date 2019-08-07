package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.FilesUploadComplete client event, which enables you to perform specific actions after all selected files have been uploaded.
  */
@JSGlobal("ASPxClientUploadControlFilesUploadCompleteEventArgs")
@js.native
class ASPxClientUploadControlFilesUploadCompleteEventArgs protected () extends ASPxClientEventArgs {
  /**
    * For internal use only.
    */
  def this(errorText: String, callbackData: String) = this()
  /**
    * Gets a string that contains specific information (if any) passed from the server side for further client processing.
    */
  var callbackData: String = js.native
  /**
    * Gets the error text to be displayed within the upload control's error frame.
    */
  var errorText: String = js.native
}

