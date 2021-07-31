package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Cell Properties dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableCellPropertiesDialog
  extends StObject
     with ASPxClientHtmlEditorTableElementPropertiesDialog {
  
  /**
    * Provides access to the client object of the "Apply to all cells in the table" check box in the Html Editor's Cell Properties dialog.
    */
  def GetApplyToAllCellsCheckBox(): ASPxClientCheckBox
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
  implicit class ASPxClientHtmlEditorTableCellPropertiesDialogMutableBuilder[Self <: ASPxClientHtmlEditorTableCellPropertiesDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetApplyToAllCellsCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetApplyToAllCellsCheckBox", js.Any.fromFunction0(value))
  }
}
