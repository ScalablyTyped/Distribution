package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FileDownloading event.
  */
@js.native
trait ASPxClientFileManagerFileDownloadingEventArgs extends ASPxClientFileManagerFileEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event, should be canceled.
    */
  var cancel: Boolean = js.native
}

object ASPxClientFileManagerFileDownloadingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, file: ASPxClientFileManagerFile): ASPxClientFileManagerFileDownloadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileDownloadingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFileManagerFileDownloadingEventArgsOps[Self <: ASPxClientFileManagerFileDownloadingEventArgs] (val x: Self) extends AnyVal {
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
  }
  
}

