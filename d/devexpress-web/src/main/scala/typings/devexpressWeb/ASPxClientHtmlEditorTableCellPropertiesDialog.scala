package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Cell Properties dialog within the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorTableCellPropertiesDialog extends ASPxClientHtmlEditorTableElementPropertiesDialog {
  
  /**
    * Provides access to the client object of the "Apply to all cells in the table" check box in the Html Editor's Cell Properties dialog.
    */
  def GetApplyToAllCellsCheckBox(): ASPxClientCheckBox = js.native
}
object ASPxClientHtmlEditorTableCellPropertiesDialog {
  
  @scala.inline
  def apply(
    GetApplyToAllCellsCheckBox: () => ASPxClientCheckBox,
    GetBackgroundColorColorEdit: () => ASPxClientColorEdit,
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHorizontalAlignmentComboBox: () => ASPxClientComboBox,
    GetOkButton: () => ASPxClientButton,
    GetVerticalAlignmentComboBox: () => ASPxClientComboBox
  ): ASPxClientHtmlEditorTableCellPropertiesDialog = {
    val __obj = js.Dynamic.literal(GetApplyToAllCellsCheckBox = js.Any.fromFunction0(GetApplyToAllCellsCheckBox), GetBackgroundColorColorEdit = js.Any.fromFunction0(GetBackgroundColorColorEdit), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHorizontalAlignmentComboBox = js.Any.fromFunction0(GetHorizontalAlignmentComboBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetVerticalAlignmentComboBox = js.Any.fromFunction0(GetVerticalAlignmentComboBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorTableCellPropertiesDialog]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorTableCellPropertiesDialogOps[Self <: ASPxClientHtmlEditorTableCellPropertiesDialog] (val x: Self) extends AnyVal {
    
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
    def setGetApplyToAllCellsCheckBox(value: () => ASPxClientCheckBox): Self = this.set("GetApplyToAllCellsCheckBox", js.Any.fromFunction0(value))
  }
}
