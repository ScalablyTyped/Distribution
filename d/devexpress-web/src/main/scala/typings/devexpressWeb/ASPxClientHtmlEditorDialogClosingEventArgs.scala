package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.DialogClosing event.
  */
trait ASPxClientHtmlEditorDialogClosingEventArgs extends ASPxClientHtmlEditorDialogCloseEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
}

object ASPxClientHtmlEditorDialogClosingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, dialog: ASPxClientHtmlEditorDialogBase, dialogName: String, parameter: js.Any): ASPxClientHtmlEditorDialogClosingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], dialogName = dialogName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogClosingEventArgs]
  }
}

