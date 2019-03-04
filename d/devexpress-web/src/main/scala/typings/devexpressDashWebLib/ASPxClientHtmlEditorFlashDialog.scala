package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Flash dialog within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorFlashDialog extends ASPxClientHtmlEditorMediaDialogBase {
  /**
    * Provides access to the client object of the "Allow fullscreen" check box in the Html Editor's Flash dialog.
    */
  def GetAllowFullscreenCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Auto play" check box in the Html Editor's Flash dialog.
    */
  def GetAutoPlayCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Enable flash menu" check box in the Html Editor's Flash dialog.
    */
  def GetEnableFlashMenuCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Loop" check box in the Html Editor's Flash dialog.
    */
  def GetLoopCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Quality" combo box in the Html Editor's Flash dialog.
    */
  def GetQualityComboBox(): ASPxClientComboBox
}

object ASPxClientHtmlEditorFlashDialog {
  @scala.inline
  def apply(
    GetAllowFullscreenCheckBox: js.Function0[ASPxClientCheckBox],
    GetAutoPlayCheckBox: js.Function0[ASPxClientCheckBox],
    GetBorderColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetBorderStyleComboBox: js.Function0[ASPxClientComboBox],
    GetBorderWidthSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetBottomMarginTextBox: js.Function0[ASPxClientTextBox],
    GetCancelButton: js.Function0[ASPxClientButton],
    GetCssClassNameComboBox: js.Function0[ASPxClientComboBox],
    GetEnableFlashMenuCheckBox: js.Function0[ASPxClientCheckBox],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetHeightSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetLeftMarginTextBox: js.Function0[ASPxClientTextBox],
    GetLoopCheckBox: js.Function0[ASPxClientCheckBox],
    GetMediaFileSelector: js.Function0[ASPxClientMediaFileSelector],
    GetMoreOptionsCheckBox: js.Function0[ASPxClientCheckBox],
    GetOkButton: js.Function0[ASPxClientButton],
    GetPositionComboBox: js.Function0[ASPxClientComboBox],
    GetQualityComboBox: js.Function0[ASPxClientComboBox],
    GetRightMarginTextBox: js.Function0[ASPxClientTextBox],
    GetTopMarginTextBox: js.Function0[ASPxClientTextBox],
    GetWidthSpinEdit: js.Function0[ASPxClientSpinEdit]
  ): ASPxClientHtmlEditorFlashDialog = {
    val __obj = js.Dynamic.literal(GetAllowFullscreenCheckBox = GetAllowFullscreenCheckBox, GetAutoPlayCheckBox = GetAutoPlayCheckBox, GetBorderColorColorEdit = GetBorderColorColorEdit, GetBorderStyleComboBox = GetBorderStyleComboBox, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit, GetBottomMarginTextBox = GetBottomMarginTextBox, GetCancelButton = GetCancelButton, GetCssClassNameComboBox = GetCssClassNameComboBox, GetEnableFlashMenuCheckBox = GetEnableFlashMenuCheckBox, GetFormLayout = GetFormLayout, GetHeightSpinEdit = GetHeightSpinEdit, GetLeftMarginTextBox = GetLeftMarginTextBox, GetLoopCheckBox = GetLoopCheckBox, GetMediaFileSelector = GetMediaFileSelector, GetMoreOptionsCheckBox = GetMoreOptionsCheckBox, GetOkButton = GetOkButton, GetPositionComboBox = GetPositionComboBox, GetQualityComboBox = GetQualityComboBox, GetRightMarginTextBox = GetRightMarginTextBox, GetTopMarginTextBox = GetTopMarginTextBox, GetWidthSpinEdit = GetWidthSpinEdit)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorFlashDialog]
  }
}

