package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FileUploading event.
  */
@js.native
trait ASPxClientFileManagerFileUploadingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
  /**
    * Gets the name of a file selected for upload.
    */
  var fileName: String = js.native
  /**
    * Gets the path to the folder where a file is being uploaded.
    */
  var folder: String = js.native
}

object ASPxClientFileManagerFileUploadingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, fileName: String, folder: String): ASPxClientFileManagerFileUploadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileUploadingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerFileUploadingEventArgsOps[Self <: ASPxClientFileManagerFileUploadingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
  }
  
}

