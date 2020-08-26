package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Table dialog within the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorTableDialog extends ASPxClientHtmlEditorTableDialogBase {
  /**
    * Provides access to the client object of the "Accessibility" check box related to the Html Editor's Table dialogs.
    */
  def GetAccessibilityCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Alignment" combo box in the Html Editor's Table dialogs.
    */
  def GetAlignmentComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Border Color" color editor in the Html Editor's Table dialogs.
    */
  def GetBorderColorColorEdit(): ASPxClientColorEdit = js.native
  /**
    * Provides access to the client object of the "Border size" spin editor in the Html Editor's Table dialogs.
    */
  def GetBorderWidthSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the "Caption" text box in the Html Editor's Table dialogs.
    */
  def GetCaptionTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "Cell padding" spin editor in the Html Editor's Table dialogs.
    */
  def GetCellPaddingSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the "Cell spacing" spin editor in the Html Editor's Table dialogs.
    */
  def GetCellSpacingSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the "Headers" combo box in the Html Editor's Table dialogs.
    */
  def GetHeadersComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Height" combo box in the Html Editor's Table dialogs.
    */
  def GetHeightTypeComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the spin editor in the Html Editor's Table dialogs that allows you specify the table height value.
    */
  def GetHeightValueSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the combo box in the Html Editor's Table dialogs that allows you to specify the table height measurement unit.
    */
  def GetHeightValueTypeComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Summary" text box in the Html Editor's Table dialogs.
    */
  def GetSummaryTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "Width" combo box in the Html Editor's Table dialogs.
    */
  def GetWidthTypeComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the spin editor in the Html Editor's Table dialogs that allows you to specify the table width value.
    */
  def GetWidthValueSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the combo box in the Html Editor's Table dialogs that allows you to specify the table width measurement unit.
    */
  def GetWidthValueTypeComboBox(): ASPxClientComboBox = js.native
}

object ASPxClientHtmlEditorTableDialog {
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
    GetFormLayout: () => ASPxClientFormLayout,
    GetHeadersComboBox: () => ASPxClientComboBox,
    GetHeightTypeComboBox: () => ASPxClientComboBox,
    GetHeightValueSpinEdit: () => ASPxClientSpinEdit,
    GetHeightValueTypeComboBox: () => ASPxClientComboBox,
    GetOkButton: () => ASPxClientButton,
    GetSummaryTextBox: () => ASPxClientTextBox,
    GetWidthTypeComboBox: () => ASPxClientComboBox,
    GetWidthValueSpinEdit: () => ASPxClientSpinEdit,
    GetWidthValueTypeComboBox: () => ASPxClientComboBox
  ): ASPxClientHtmlEditorTableDialog = {
    val __obj = js.Dynamic.literal(GetAccessibilityCheckBox = js.Any.fromFunction0(GetAccessibilityCheckBox), GetAlignmentComboBox = js.Any.fromFunction0(GetAlignmentComboBox), GetBackgroundColorColorEdit = js.Any.fromFunction0(GetBackgroundColorColorEdit), GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetCaptionTextBox = js.Any.fromFunction0(GetCaptionTextBox), GetCellPaddingSpinEdit = js.Any.fromFunction0(GetCellPaddingSpinEdit), GetCellSpacingSpinEdit = js.Any.fromFunction0(GetCellSpacingSpinEdit), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHeadersComboBox = js.Any.fromFunction0(GetHeadersComboBox), GetHeightTypeComboBox = js.Any.fromFunction0(GetHeightTypeComboBox), GetHeightValueSpinEdit = js.Any.fromFunction0(GetHeightValueSpinEdit), GetHeightValueTypeComboBox = js.Any.fromFunction0(GetHeightValueTypeComboBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetSummaryTextBox = js.Any.fromFunction0(GetSummaryTextBox), GetWidthTypeComboBox = js.Any.fromFunction0(GetWidthTypeComboBox), GetWidthValueSpinEdit = js.Any.fromFunction0(GetWidthValueSpinEdit), GetWidthValueTypeComboBox = js.Any.fromFunction0(GetWidthValueTypeComboBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorTableDialog]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorTableDialogOps[Self <: ASPxClientHtmlEditorTableDialog] (val x: Self) extends AnyVal {
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
    def setGetAccessibilityCheckBox(value: () => ASPxClientCheckBox): Self = this.set("GetAccessibilityCheckBox", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAlignmentComboBox(value: () => ASPxClientComboBox): Self = this.set("GetAlignmentComboBox", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBorderColorColorEdit(value: () => ASPxClientColorEdit): Self = this.set("GetBorderColorColorEdit", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBorderWidthSpinEdit(value: () => ASPxClientSpinEdit): Self = this.set("GetBorderWidthSpinEdit", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCaptionTextBox(value: () => ASPxClientTextBox): Self = this.set("GetCaptionTextBox", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCellPaddingSpinEdit(value: () => ASPxClientSpinEdit): Self = this.set("GetCellPaddingSpinEdit", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCellSpacingSpinEdit(value: () => ASPxClientSpinEdit): Self = this.set("GetCellSpacingSpinEdit", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeadersComboBox(value: () => ASPxClientComboBox): Self = this.set("GetHeadersComboBox", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeightTypeComboBox(value: () => ASPxClientComboBox): Self = this.set("GetHeightTypeComboBox", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeightValueSpinEdit(value: () => ASPxClientSpinEdit): Self = this.set("GetHeightValueSpinEdit", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeightValueTypeComboBox(value: () => ASPxClientComboBox): Self = this.set("GetHeightValueTypeComboBox", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSummaryTextBox(value: () => ASPxClientTextBox): Self = this.set("GetSummaryTextBox", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWidthTypeComboBox(value: () => ASPxClientComboBox): Self = this.set("GetWidthTypeComboBox", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWidthValueSpinEdit(value: () => ASPxClientSpinEdit): Self = this.set("GetWidthValueSpinEdit", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWidthValueTypeComboBox(value: () => ASPxClientComboBox): Self = this.set("GetWidthValueTypeComboBox", js.Any.fromFunction0(value))
  }
  
}

