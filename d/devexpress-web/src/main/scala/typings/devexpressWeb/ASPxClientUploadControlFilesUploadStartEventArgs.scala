package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.FilesUploadStart event.
  */
trait ASPxClientUploadControlFilesUploadStartEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
}

object ASPxClientUploadControlFilesUploadStartEventArgs {
  @scala.inline
  def apply(cancel: Boolean): ASPxClientUploadControlFilesUploadStartEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFilesUploadStartEventArgs]
  }
}

