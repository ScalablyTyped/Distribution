package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FileDownloading event.
  */
trait ASPxClientFileManagerFileDownloadingEventArgs extends ASPxClientFileManagerFileEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event, should be canceled.
    */
  var cancel: Boolean
}

object ASPxClientFileManagerFileDownloadingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, file: ASPxClientFileManagerFile): ASPxClientFileManagerFileDownloadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileDownloadingEventArgs]
  }
}

