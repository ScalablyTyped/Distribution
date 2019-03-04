package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Column Properties dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableColumnPropertiesDialog extends ASPxClientHtmlEditorTableElementPropertiesDialog {
  /**
    * Provides access to the client object of the "Width" combo box in the Html Editor's "Column Properties" dialog.
    */
  def GetWidthTypeComboBox(): ASPxClientComboBox
  /**
    * Provides access to the client object of the spin editor that allows you to set the column width value in the Html Editor's "Column Properties" dialog.
    */
  def GetWidthValueSpinEdit(): ASPxClientSpinEdit
  /**
    * Provides access to the client object of the combo box that allows you to specify the column width measurement unit in the Html Editor's "Column Properties" dialog.
    */
  def GetWidthValueTypeComboBox(): ASPxClientComboBox
}

object ASPxClientHtmlEditorTableColumnPropertiesDialog {
  @scala.inline
  def apply(
    GetBackgroundColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetCancelButton: js.Function0[ASPxClientButton],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetHorizontalAlignmentComboBox: js.Function0[ASPxClientComboBox],
    GetOkButton: js.Function0[ASPxClientButton],
    GetVerticalAlignmentComboBox: js.Function0[ASPxClientComboBox],
    GetWidthTypeComboBox: js.Function0[ASPxClientComboBox],
    GetWidthValueSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetWidthValueTypeComboBox: js.Function0[ASPxClientComboBox]
  ): ASPxClientHtmlEditorTableColumnPropertiesDialog = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = GetBackgroundColorColorEdit, GetCancelButton = GetCancelButton, GetFormLayout = GetFormLayout, GetHorizontalAlignmentComboBox = GetHorizontalAlignmentComboBox, GetOkButton = GetOkButton, GetVerticalAlignmentComboBox = GetVerticalAlignmentComboBox, GetWidthTypeComboBox = GetWidthTypeComboBox, GetWidthValueSpinEdit = GetWidthValueSpinEdit, GetWidthValueTypeComboBox = GetWidthValueTypeComboBox)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorTableColumnPropertiesDialog]
  }
}

