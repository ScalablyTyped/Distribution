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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetAccessibilityCheckBox")(GetAccessibilityCheckBox)
    __obj.updateDynamic("GetAlignmentComboBox")(GetAlignmentComboBox)
    __obj.updateDynamic("GetBackgroundColorColorEdit")(GetBackgroundColorColorEdit)
    __obj.updateDynamic("GetBorderColorColorEdit")(GetBorderColorColorEdit)
    __obj.updateDynamic("GetBorderWidthSpinEdit")(GetBorderWidthSpinEdit)
    __obj.updateDynamic("GetCancelButton")(GetCancelButton)
    __obj.updateDynamic("GetCaptionTextBox")(GetCaptionTextBox)
    __obj.updateDynamic("GetCellPaddingSpinEdit")(GetCellPaddingSpinEdit)
    __obj.updateDynamic("GetCellSpacingSpinEdit")(GetCellSpacingSpinEdit)
    __obj.updateDynamic("GetColumnCountSpinEdit")(GetColumnCountSpinEdit)
    __obj.updateDynamic("GetEqualWidthCheckBox")(GetEqualWidthCheckBox)
    __obj.updateDynamic("GetFormLayout")(GetFormLayout)
    __obj.updateDynamic("GetHeadersComboBox")(GetHeadersComboBox)
    __obj.updateDynamic("GetHeightTypeComboBox")(GetHeightTypeComboBox)
    __obj.updateDynamic("GetHeightValueSpinEdit")(GetHeightValueSpinEdit)
    __obj.updateDynamic("GetHeightValueTypeComboBox")(GetHeightValueTypeComboBox)
    __obj.updateDynamic("GetOkButton")(GetOkButton)
    __obj.updateDynamic("GetRowCountSpinEdit")(GetRowCountSpinEdit)
    __obj.updateDynamic("GetSummaryTextBox")(GetSummaryTextBox)
    __obj.updateDynamic("GetWidthTypeComboBox")(GetWidthTypeComboBox)
    __obj.updateDynamic("GetWidthValueSpinEdit")(GetWidthValueSpinEdit)
    __obj.updateDynamic("GetWidthValueTypeComboBox")(GetWidthValueTypeComboBox)
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertTableDialog]
  }
}

