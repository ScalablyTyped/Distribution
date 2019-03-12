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
    GetAccessibilityCheckBox: () => ASPxClientCheckBox,
    GetAlignmentComboBox: () => ASPxClientComboBox,
    GetBackgroundColorColorEdit: () => ASPxClientColorEdit,
    GetBorderColorColorEdit: () => ASPxClientColorEdit,
    GetBorderWidthSpinEdit: () => ASPxClientSpinEdit,
    GetCancelButton: () => ASPxClientButton,
    GetCaptionTextBox: () => ASPxClientTextBox,
    GetCellPaddingSpinEdit: () => ASPxClientSpinEdit,
    GetCellSpacingSpinEdit: () => ASPxClientSpinEdit,
    GetColumnCountSpinEdit: () => ASPxClientSpinEdit,
    GetEqualWidthCheckBox: () => ASPxClientCheckBox,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHeadersComboBox: () => ASPxClientComboBox,
    GetHeightTypeComboBox: () => ASPxClientComboBox,
    GetHeightValueSpinEdit: () => ASPxClientSpinEdit,
    GetHeightValueTypeComboBox: () => ASPxClientComboBox,
    GetOkButton: () => ASPxClientButton,
    GetRowCountSpinEdit: () => ASPxClientSpinEdit,
    GetSummaryTextBox: () => ASPxClientTextBox,
    GetWidthTypeComboBox: () => ASPxClientComboBox,
    GetWidthValueSpinEdit: () => ASPxClientSpinEdit,
    GetWidthValueTypeComboBox: () => ASPxClientComboBox
  ): ASPxClientHtmlEditorInsertTableDialog = {
    val __obj = js.Dynamic.literal(GetAccessibilityCheckBox = js.Any.fromFunction0(GetAccessibilityCheckBox), GetAlignmentComboBox = js.Any.fromFunction0(GetAlignmentComboBox), GetBackgroundColorColorEdit = js.Any.fromFunction0(GetBackgroundColorColorEdit), GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetCaptionTextBox = js.Any.fromFunction0(GetCaptionTextBox), GetCellPaddingSpinEdit = js.Any.fromFunction0(GetCellPaddingSpinEdit), GetCellSpacingSpinEdit = js.Any.fromFunction0(GetCellSpacingSpinEdit), GetColumnCountSpinEdit = js.Any.fromFunction0(GetColumnCountSpinEdit), GetEqualWidthCheckBox = js.Any.fromFunction0(GetEqualWidthCheckBox), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHeadersComboBox = js.Any.fromFunction0(GetHeadersComboBox), GetHeightTypeComboBox = js.Any.fromFunction0(GetHeightTypeComboBox), GetHeightValueSpinEdit = js.Any.fromFunction0(GetHeightValueSpinEdit), GetHeightValueTypeComboBox = js.Any.fromFunction0(GetHeightValueTypeComboBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetRowCountSpinEdit = js.Any.fromFunction0(GetRowCountSpinEdit), GetSummaryTextBox = js.Any.fromFunction0(GetSummaryTextBox), GetWidthTypeComboBox = js.Any.fromFunction0(GetWidthTypeComboBox), GetWidthValueSpinEdit = js.Any.fromFunction0(GetWidthValueSpinEdit), GetWidthValueTypeComboBox = js.Any.fromFunction0(GetWidthValueTypeComboBox))
  
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertTableDialog]
  }
}

