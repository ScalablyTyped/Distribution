package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Audio dialog within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorAudioDialog extends ASPxClientHtmlEditorMediaDialogBase {
  /**
    * Provides access to the client object of the "Auto play" check box in the Html Editor's Audio dialogs.
    */
  def GetAutoPlayCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Loop" check box in the Html Editor's Audio dialogs.
    */
  def GetLoopCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Preload mode" combo box in the Html Editor's Audio dialogs.
    */
  def GetPreloadModeComboBox(): ASPxClientComboBox
  /**
    * Provides access to the client object of the "Show player controls" check box in the Html Editor's Audio dialogs.
    */
  def GetShowPlayerControlsCheckBox(): ASPxClientCheckBox
}

object ASPxClientHtmlEditorAudioDialog {
  @scala.inline
  def apply(
    GetAutoPlayCheckBox: js.Function0[ASPxClientCheckBox],
    GetBorderColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetBorderStyleComboBox: js.Function0[ASPxClientComboBox],
    GetBorderWidthSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetBottomMarginTextBox: js.Function0[ASPxClientTextBox],
    GetCancelButton: js.Function0[ASPxClientButton],
    GetCssClassNameComboBox: js.Function0[ASPxClientComboBox],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetHeightSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetLeftMarginTextBox: js.Function0[ASPxClientTextBox],
    GetLoopCheckBox: js.Function0[ASPxClientCheckBox],
    GetMediaFileSelector: js.Function0[ASPxClientMediaFileSelector],
    GetMoreOptionsCheckBox: js.Function0[ASPxClientCheckBox],
    GetOkButton: js.Function0[ASPxClientButton],
    GetPositionComboBox: js.Function0[ASPxClientComboBox],
    GetPreloadModeComboBox: js.Function0[ASPxClientComboBox],
    GetRightMarginTextBox: js.Function0[ASPxClientTextBox],
    GetShowPlayerControlsCheckBox: js.Function0[ASPxClientCheckBox],
    GetTopMarginTextBox: js.Function0[ASPxClientTextBox],
    GetWidthSpinEdit: js.Function0[ASPxClientSpinEdit]
  ): ASPxClientHtmlEditorAudioDialog = {
    val __obj = js.Dynamic.literal(GetAutoPlayCheckBox = GetAutoPlayCheckBox, GetBorderColorColorEdit = GetBorderColorColorEdit, GetBorderStyleComboBox = GetBorderStyleComboBox, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit, GetBottomMarginTextBox = GetBottomMarginTextBox, GetCancelButton = GetCancelButton, GetCssClassNameComboBox = GetCssClassNameComboBox, GetFormLayout = GetFormLayout, GetHeightSpinEdit = GetHeightSpinEdit, GetLeftMarginTextBox = GetLeftMarginTextBox, GetLoopCheckBox = GetLoopCheckBox, GetMediaFileSelector = GetMediaFileSelector, GetMoreOptionsCheckBox = GetMoreOptionsCheckBox, GetOkButton = GetOkButton, GetPositionComboBox = GetPositionComboBox, GetPreloadModeComboBox = GetPreloadModeComboBox, GetRightMarginTextBox = GetRightMarginTextBox, GetShowPlayerControlsCheckBox = GetShowPlayerControlsCheckBox, GetTopMarginTextBox = GetTopMarginTextBox, GetWidthSpinEdit = GetWidthSpinEdit)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorAudioDialog]
  }
}

