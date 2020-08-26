package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the event that fires when the HTML Editor dialogs are closed or are going to be closed.
  */
@js.native
trait ASPxClientHtmlEditorDialogCloseEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the dialog object related to the event.
    */
  var dialog: ASPxClientHtmlEditorDialogBase = js.native
  /**
    * Gets the dialog name related to the event.
    */
  var dialogName: String = js.native
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    */
  var parameter: js.Any = js.native
}

object ASPxClientHtmlEditorDialogCloseEventArgs {
  @scala.inline
  def apply(dialog: ASPxClientHtmlEditorDialogBase, dialogName: String, parameter: js.Any): ASPxClientHtmlEditorDialogCloseEventArgs = {
    val __obj = js.Dynamic.literal(dialog = dialog.asInstanceOf[js.Any], dialogName = dialogName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogCloseEventArgs]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorDialogCloseEventArgsOps[Self <: ASPxClientHtmlEditorDialogCloseEventArgs] (val x: Self) extends AnyVal {
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
    def setDialog(value: ASPxClientHtmlEditorDialogBase): Self = this.set("dialog", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialogName(value: String): Self = this.set("dialogName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameter(value: js.Any): Self = this.set("parameter", value.asInstanceOf[js.Any])
  }
  
}

