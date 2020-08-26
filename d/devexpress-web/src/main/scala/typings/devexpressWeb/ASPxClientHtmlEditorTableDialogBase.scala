package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides base client functionality for the Table dialog within the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorTableDialogBase extends ASPxClientHtmlEditorDialogBase {
  /**
    * Provides access to the client object of the "Background color" color editor in the Html Editor's Table dialogs.
    */
  def GetBackgroundColorColorEdit(): ASPxClientColorEdit = js.native
}

object ASPxClientHtmlEditorTableDialogBase {
  @scala.inline
  def apply(
    GetBackgroundColorColorEdit: () => ASPxClientColorEdit,
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetOkButton: () => ASPxClientButton
  ): ASPxClientHtmlEditorTableDialogBase = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = js.Any.fromFunction0(GetBackgroundColorColorEdit), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetOkButton = js.Any.fromFunction0(GetOkButton))
    __obj.asInstanceOf[ASPxClientHtmlEditorTableDialogBase]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorTableDialogBaseOps[Self <: ASPxClientHtmlEditorTableDialogBase] (val x: Self) extends AnyVal {
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
    def setGetBackgroundColorColorEdit(value: () => ASPxClientColorEdit): Self = this.set("GetBackgroundColorColorEdit", js.Any.fromFunction0(value))
  }
  
}

