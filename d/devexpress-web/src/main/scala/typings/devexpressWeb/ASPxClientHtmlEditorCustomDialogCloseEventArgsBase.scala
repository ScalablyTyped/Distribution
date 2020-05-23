package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events that relate to closing a custom dialog.
  */
trait ASPxClientHtmlEditorCustomDialogCloseEventArgsBase extends ASPxClientHtmlEditorCustomDialogEventArgs {
  /**
    * Gets the status of the closed custom dialog.
    */
  var status: js.Any
}

object ASPxClientHtmlEditorCustomDialogCloseEventArgsBase {
  @scala.inline
  def apply(name: String, status: js.Any): ASPxClientHtmlEditorCustomDialogCloseEventArgsBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogCloseEventArgsBase]
  }
}

