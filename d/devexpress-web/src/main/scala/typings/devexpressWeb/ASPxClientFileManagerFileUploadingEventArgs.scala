package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FileUploading event.
  */
trait ASPxClientFileManagerFileUploadingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
  /**
    * Gets the name of a file selected for upload.
    */
  var fileName: String
  /**
    * Gets the path to the folder where a file is being uploaded.
    */
  var folder: String
}

object ASPxClientFileManagerFileUploadingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, fileName: String, folder: String): ASPxClientFileManagerFileUploadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileUploadingEventArgs]
  }
}

