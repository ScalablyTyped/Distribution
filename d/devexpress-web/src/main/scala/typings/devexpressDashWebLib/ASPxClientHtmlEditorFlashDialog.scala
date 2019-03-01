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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetAllowFullscreenCheckBox")(GetAllowFullscreenCheckBox)
    __obj.updateDynamic("GetAutoPlayCheckBox")(GetAutoPlayCheckBox)
    __obj.updateDynamic("GetBorderColorColorEdit")(GetBorderColorColorEdit)
    __obj.updateDynamic("GetBorderStyleComboBox")(GetBorderStyleComboBox)
    __obj.updateDynamic("GetBorderWidthSpinEdit")(GetBorderWidthSpinEdit)
    __obj.updateDynamic("GetBottomMarginTextBox")(GetBottomMarginTextBox)
    __obj.updateDynamic("GetCancelButton")(GetCancelButton)
    __obj.updateDynamic("GetCssClassNameComboBox")(GetCssClassNameComboBox)
    __obj.updateDynamic("GetEnableFlashMenuCheckBox")(GetEnableFlashMenuCheckBox)
    __obj.updateDynamic("GetFormLayout")(GetFormLayout)
    __obj.updateDynamic("GetHeightSpinEdit")(GetHeightSpinEdit)
    __obj.updateDynamic("GetLeftMarginTextBox")(GetLeftMarginTextBox)
    __obj.updateDynamic("GetLoopCheckBox")(GetLoopCheckBox)
    __obj.updateDynamic("GetMediaFileSelector")(GetMediaFileSelector)
    __obj.updateDynamic("GetMoreOptionsCheckBox")(GetMoreOptionsCheckBox)
    __obj.updateDynamic("GetOkButton")(GetOkButton)
    __obj.updateDynamic("GetPositionComboBox")(GetPositionComboBox)
    __obj.updateDynamic("GetQualityComboBox")(GetQualityComboBox)
    __obj.updateDynamic("GetRightMarginTextBox")(GetRightMarginTextBox)
    __obj.updateDynamic("GetTopMarginTextBox")(GetTopMarginTextBox)
    __obj.updateDynamic("GetWidthSpinEdit")(GetWidthSpinEdit)
    __obj.asInstanceOf[ASPxClientHtmlEditorFlashDialog]
  }
}

