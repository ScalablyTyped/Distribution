package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Insert Table dialog within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorInsertTableDialog extends ASPxClientHtmlEditorTableDialog {
  /**
    * Provides access to the client object of the "Columns" spin editor in the Html Editor's Table dialogs.
    */
  def GetColumnCountSpinEdit(): ASPxClientSpinEdit
  /**
    * Provides access to the client object of the "Equal column widths" check box in the Html Editor's Table dialogs.
    */
  def GetEqualWidthCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Rows" spin editor in the Html Editor's Table dialogs.
    */
  def GetRowCountSpinEdit(): ASPxClientSpinEdit
}

object ASPxClientHtmlEditorInsertTableDialog {
  @scala.inline
  def apply(
    GetAccessibilityCheckBox: js.Function0[ASPxClientCheckBox],
    GetAlignmentComboBox: js.Function0[ASPxClientComboBox],
    GetBackgroundColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetBorderColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetBorderWidthSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetCancelButton: js.Function0[ASPxClientButton],
    GetCaptionTextBox: js.Function0[ASPxClientTextBox],
    GetCellPaddingSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetCellSpacingSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetColumnCountSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetEqualWidthCheckBox: js.Function0[ASPxClientCheckBox],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetHeadersComboBox: js.Function0[ASPxClientComboBox],
    GetHeightTypeComboBox: js.Function0[ASPxClientComboBox],
    GetHeightValueSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetHeightValueTypeComboBox: js.Function0[ASPxClientComboBox],
    GetOkButton: js.Function0[ASPxClientButton],
    GetRowCountSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetSummaryTextBox: js.Function0[ASPxClientTextBox],
    GetWidthTypeComboBox: js.Function0[ASPxClientComboBox],
    GetWidthValueSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetWidthValueTypeComboBox: js.Function0[ASPxClientComboBox]
  ): ASPxClientHtmlEditorInsertTableDialog = {
    val __obj = js.Dynamic.literal(GetAccessibilityCheckBox = GetAccessibilityCheckBox, GetAlignmentComboBox = GetAlignmentComboBox, GetBackgroundColorColorEdit = GetBackgroundColorColorEdit, GetBorderColorColorEdit = GetBorderColorColorEdit, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit, GetCancelButton = GetCancelButton, GetCaptionTextBox = GetCaptionTextBox, GetCellPaddingSpinEdit = GetCellPaddingSpinEdit, GetCellSpacingSpinEdit = GetCellSpacingSpinEdit, GetColumnCountSpinEdit = GetColumnCountSpinEdit, GetEqualWidthCheckBox = GetEqualWidthCheckBox, GetFormLayout = GetFormLayout, GetHeadersComboBox = GetHeadersComboBox, GetHeightTypeComboBox = GetHeightTypeComboBox, GetHeightValueSpinEdit = GetHeightValueSpinEdit, GetHeightValueTypeComboBox = GetHeightValueTypeComboBox, GetOkButton = GetOkButton, GetRowCountSpinEdit = GetRowCountSpinEdit, GetSummaryTextBox = GetSummaryTextBox, GetWidthTypeComboBox = GetWidthTypeComboBox, GetWidthValueSpinEdit = GetWidthValueSpinEdit, GetWidthValueTypeComboBox = GetWidthValueTypeComboBox)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertTableDialog]
  }
}

