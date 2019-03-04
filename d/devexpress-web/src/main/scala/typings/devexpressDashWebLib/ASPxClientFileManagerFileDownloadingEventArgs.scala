package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FileDownloading event.
  */
trait ASPxClientFileManagerFileDownloadingEventArgs extends ASPxClientFileManagerFileEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event, should be canceled.
    * Value: true, if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: scala.Boolean
}

object ASPxClientFileManagerFileDownloadingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, file: ASPxClientFileManagerFile): ASPxClientFileManagerFileDownloadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, file = file)
  
    __obj.asInstanceOf[ASPxClientFileManagerFileDownloadingEventArgs]
  }
}

