package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Placeholder dialog within the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorPlaceholderDialog extends ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the ASPxListBox client object that lists placeholder names in the Html Editor's Placeholder dialog.
    */
  def GetPlaceholderNameListBox(): ASPxClientListBox = js.native
}
object ASPxClientHtmlEditorPlaceholderDialog {
  
  @scala.inline
  def apply(
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetOkButton: () => ASPxClientButton,
    GetPlaceholderNameListBox: () => ASPxClientListBox
  ): ASPxClientHtmlEditorPlaceholderDialog = {
    val __obj = js.Dynamic.literal(GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetOkButton = js.Any.fromFunction0(GetOkButton), GetPlaceholderNameListBox = js.Any.fromFunction0(GetPlaceholderNameListBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorPlaceholderDialog]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorPlaceholderDialogOps[Self <: ASPxClientHtmlEditorPlaceholderDialog] (val x: Self) extends AnyVal {
    
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
    def setGetPlaceholderNameListBox(value: () => ASPxClientListBox): Self = this.set("GetPlaceholderNameListBox", js.Any.fromFunction0(value))
  }
}
