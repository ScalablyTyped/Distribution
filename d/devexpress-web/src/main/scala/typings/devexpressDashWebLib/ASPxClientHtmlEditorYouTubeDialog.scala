package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the YouTube Video dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorYouTubeDialog extends ASPxClientHtmlEditorEditElementDialog {
  /**
    * Provides access to the client object of the "Allow fullscreen" check box in the Html Editor's "Insert YouTube Video" dialog.
    */
  def GetAllowFullscreenCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Enable privacy-enhanced mode" check box in the Html Editor's YouTube Video dialog.
    */
  def GetConfidentModeCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Show player controls" check box in the Html Editor's YouTube Video dialog.
    */
  def GetShowPlayerControlsCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Show suggested videos when the video finishes" check box in the Html Editor's YouTube Video dialog.
    */
  def GetShowSameVideosCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Show video title and player actions" check box in the Html Editor's YouTube Video dialog.
    */
  def GetShowVideoNameCheckBox(): ASPxClientCheckBox
}

object ASPxClientHtmlEditorYouTubeDialog {
  @scala.inline
  def apply(
    GetAllowFullscreenCheckBox: js.Function0[ASPxClientCheckBox],
    GetBorderColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetBorderStyleComboBox: js.Function0[ASPxClientComboBox],
    GetBorderWidthSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetBottomMarginTextBox: js.Function0[ASPxClientTextBox],
    GetCancelButton: js.Function0[ASPxClientButton],
    GetConfidentModeCheckBox: js.Function0[ASPxClientCheckBox],
    GetCssClassNameComboBox: js.Function0[ASPxClientComboBox],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetLeftMarginTextBox: js.Function0[ASPxClientTextBox],
    GetOkButton: js.Function0[ASPxClientButton],
    GetRightMarginTextBox: js.Function0[ASPxClientTextBox],
    GetShowPlayerControlsCheckBox: js.Function0[ASPxClientCheckBox],
    GetShowSameVideosCheckBox: js.Function0[ASPxClientCheckBox],
    GetShowVideoNameCheckBox: js.Function0[ASPxClientCheckBox],
    GetTopMarginTextBox: js.Function0[ASPxClientTextBox]
  ): ASPxClientHtmlEditorYouTubeDialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetAllowFullscreenCheckBox")(GetAllowFullscreenCheckBox)
    __obj.updateDynamic("GetBorderColorColorEdit")(GetBorderColorColorEdit)
    __obj.updateDynamic("GetBorderStyleComboBox")(GetBorderStyleComboBox)
    __obj.updateDynamic("GetBorderWidthSpinEdit")(GetBorderWidthSpinEdit)
    __obj.updateDynamic("GetBottomMarginTextBox")(GetBottomMarginTextBox)
    __obj.updateDynamic("GetCancelButton")(GetCancelButton)
    __obj.updateDynamic("GetConfidentModeCheckBox")(GetConfidentModeCheckBox)
    __obj.updateDynamic("GetCssClassNameComboBox")(GetCssClassNameComboBox)
    __obj.updateDynamic("GetFormLayout")(GetFormLayout)
    __obj.updateDynamic("GetLeftMarginTextBox")(GetLeftMarginTextBox)
    __obj.updateDynamic("GetOkButton")(GetOkButton)
    __obj.updateDynamic("GetRightMarginTextBox")(GetRightMarginTextBox)
    __obj.updateDynamic("GetShowPlayerControlsCheckBox")(GetShowPlayerControlsCheckBox)
    __obj.updateDynamic("GetShowSameVideosCheckBox")(GetShowSameVideosCheckBox)
    __obj.updateDynamic("GetShowVideoNameCheckBox")(GetShowVideoNameCheckBox)
    __obj.updateDynamic("GetTopMarginTextBox")(GetTopMarginTextBox)
    __obj.asInstanceOf[ASPxClientHtmlEditorYouTubeDialog]
  }
}

