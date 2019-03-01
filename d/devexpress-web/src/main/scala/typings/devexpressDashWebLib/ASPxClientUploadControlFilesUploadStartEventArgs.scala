package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FilesUploadStart event.
  */
trait ASPxClientUploadControlFilesUploadStartEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: scala.Boolean
}

object ASPxClientUploadControlFilesUploadStartEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean): ASPxClientUploadControlFilesUploadStartEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.asInstanceOf[ASPxClientUploadControlFilesUploadStartEventArgs]
  }
}

