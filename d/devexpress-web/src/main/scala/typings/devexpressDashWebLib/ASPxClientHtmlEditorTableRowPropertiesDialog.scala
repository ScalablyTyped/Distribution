package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Row Properties dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableRowPropertiesDialog extends ASPxClientHtmlEditorTableElementPropertiesDialog {
  /**
    * Provides access to the client object of the "Height" combo box in the Html Editor's "Row Properties" dialog.
    */
  def GetHeightTypeComboBox(): ASPxClientComboBox
  /**
    * Provides access to the client ASPxSpinEdit object that allows you to specify the row height in the Html Editor's "Row Properties" dialog.
    */
  def GetHeightValueSpinEdit(): ASPxClientSpinEdit
  /**
    * Provides access to the client ASPxComboBox object that allows you to specify the row height measurement unit in the Html Editor's "Row Properties" dialog.
    */
  def GetHeightValueTypeComboBox(): ASPxClientComboBox
}

object ASPxClientHtmlEditorTableRowPropertiesDialog {
  @scala.inline
  def apply(
    GetBackgroundColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetCancelButton: js.Function0[ASPxClientButton],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetHeightTypeComboBox: js.Function0[ASPxClientComboBox],
    GetHeightValueSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetHeightValueTypeComboBox: js.Function0[ASPxClientComboBox],
    GetHorizontalAlignmentComboBox: js.Function0[ASPxClientComboBox],
    GetOkButton: js.Function0[ASPxClientButton],
    GetVerticalAlignmentComboBox: js.Function0[ASPxClientComboBox]
  ): ASPxClientHtmlEditorTableRowPropertiesDialog = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = GetBackgroundColorColorEdit, GetCancelButton = GetCancelButton, GetFormLayout = GetFormLayout, GetHeightTypeComboBox = GetHeightTypeComboBox, GetHeightValueSpinEdit = GetHeightValueSpinEdit, GetHeightValueTypeComboBox = GetHeightValueTypeComboBox, GetHorizontalAlignmentComboBox = GetHorizontalAlignmentComboBox, GetOkButton = GetOkButton, GetVerticalAlignmentComboBox = GetVerticalAlignmentComboBox)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorTableRowPropertiesDialog]
  }
}

