package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.DialogInitialized client event.
  */
@js.native
trait ASPxClientHtmlEditorDialogInitializedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a dialog object related to the event.
    */
  var dialog: ASPxClientHtmlEditorDialogBase = js.native
  /**
    * Gets the name of the dialog that has been initialized.
    */
  var dialogName: String = js.native
}

object ASPxClientHtmlEditorDialogInitializedEventArgs {
  @scala.inline
  def apply(dialog: ASPxClientHtmlEditorDialogBase, dialogName: String): ASPxClientHtmlEditorDialogInitializedEventArgs = {
    val __obj = js.Dynamic.literal(dialog = dialog.asInstanceOf[js.Any], dialogName = dialogName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogInitializedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorDialogInitializedEventArgsOps[Self <: ASPxClientHtmlEditorDialogInitializedEventArgs] (val x: Self) extends AnyVal {
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
  }
  
}

