package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FilesUploading event.
  */
trait ASPxClientFileManagerFilesUploadingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: Boolean
  /**
    * Gets the names of files selected for upload.
    * Value: An array of string values that are the file names.
    */
  var fileNames: js.Array[String]
  /**
    * Gets the path to the folder where files are being uploaded.
    * Value: A string value specifying the folder path.
    */
  var folder: String
}

object ASPxClientFileManagerFilesUploadingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, fileNames: js.Array[String], folder: String): ASPxClientFileManagerFilesUploadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, fileNames = fileNames, folder = folder)
  
    __obj.asInstanceOf[ASPxClientFileManagerFilesUploadingEventArgs]
  }
}

