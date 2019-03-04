package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Cell Properties dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableCellPropertiesDialog extends ASPxClientHtmlEditorTableElementPropertiesDialog {
  /**
    * Provides access to the client object of the "Apply to all cells in the table" check box in the Html Editor's Cell Properties dialog.
    */
  def GetApplyToAllCellsCheckBox(): ASPxClientCheckBox
}

object ASPxClientHtmlEditorTableCellPropertiesDialog {
  @scala.inline
  def apply(
    GetApplyToAllCellsCheckBox: js.Function0[ASPxClientCheckBox],
    GetBackgroundColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetCancelButton: js.Function0[ASPxClientButton],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetHorizontalAlignmentComboBox: js.Function0[ASPxClientComboBox],
    GetOkButton: js.Function0[ASPxClientButton],
    GetVerticalAlignmentComboBox: js.Function0[ASPxClientComboBox]
  ): ASPxClientHtmlEditorTableCellPropertiesDialog = {
    val __obj = js.Dynamic.literal(GetApplyToAllCellsCheckBox = GetApplyToAllCellsCheckBox, GetBackgroundColorColorEdit = GetBackgroundColorColorEdit, GetCancelButton = GetCancelButton, GetFormLayout = GetFormLayout, GetHorizontalAlignmentComboBox = GetHorizontalAlignmentComboBox, GetOkButton = GetOkButton, GetVerticalAlignmentComboBox = GetVerticalAlignmentComboBox)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorTableCellPropertiesDialog]
  }
}

