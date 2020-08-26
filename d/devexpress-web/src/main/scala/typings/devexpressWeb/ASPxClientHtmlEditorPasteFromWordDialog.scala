package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Paste From Word dialog within the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorPasteFromWordDialog extends ASPxClientHtmlEditorDialogBase {
  /**
    * Provides access to the client object of the "Remove font family" check box in the Html Editor's Flash dialog.
    */
  def GetRemoveFontFamilyCheckBox(): ASPxClientCheckBox = js.native
}

object ASPxClientHtmlEditorPasteFromWordDialog {
  @scala.inline
  def apply(
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetOkButton: () => ASPxClientButton,
    GetRemoveFontFamilyCheckBox: () => ASPxClientCheckBox
  ): ASPxClientHtmlEditorPasteFromWordDialog = {
    val __obj = js.Dynamic.literal(GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetOkButton = js.Any.fromFunction0(GetOkButton), GetRemoveFontFamilyCheckBox = js.Any.fromFunction0(GetRemoveFontFamilyCheckBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorPasteFromWordDialog]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorPasteFromWordDialogOps[Self <: ASPxClientHtmlEditorPasteFromWordDialog] (val x: Self) extends AnyVal {
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
    def setGetRemoveFontFamilyCheckBox(value: () => ASPxClientCheckBox): Self = this.set("GetRemoveFontFamilyCheckBox", js.Any.fromFunction0(value))
  }
  
}

