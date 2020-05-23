package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FilesUploading event.
  */
trait ASPxClientFileManagerFilesUploadingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
  /**
    * Gets the names of files selected for upload.
    */
  var fileNames: js.Array[String]
  /**
    * Gets the path to the folder where files are being uploaded.
    */
  var folder: String
}

object ASPxClientFileManagerFilesUploadingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, fileNames: js.Array[String], folder: String): ASPxClientFileManagerFilesUploadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFilesUploadingEventArgs]
  }
}

