package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FileUploading event.
  */
trait ASPxClientFileManagerFileUploadingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: Boolean
  /**
    * Gets the name of a file selected for upload.
    * Value: A string value that specifies the file name.
    */
  var fileName: String
  /**
    * Gets the path to the folder where a file is being uploaded.
    * Value: A string value specifying the path where a file is being uploaded.
    */
  var folder: String
}

object ASPxClientFileManagerFileUploadingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, fileName: String, folder: String): ASPxClientFileManagerFileUploadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, fileName = fileName, folder = folder)
  
    __obj.asInstanceOf[ASPxClientFileManagerFileUploadingEventArgs]
  }
}

