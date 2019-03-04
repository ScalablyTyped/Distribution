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
    val __obj = js.Dynamic.literal(GetAllowFullscreenCheckBox = GetAllowFullscreenCheckBox, GetBorderColorColorEdit = GetBorderColorColorEdit, GetBorderStyleComboBox = GetBorderStyleComboBox, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit, GetBottomMarginTextBox = GetBottomMarginTextBox, GetCancelButton = GetCancelButton, GetConfidentModeCheckBox = GetConfidentModeCheckBox, GetCssClassNameComboBox = GetCssClassNameComboBox, GetFormLayout = GetFormLayout, GetLeftMarginTextBox = GetLeftMarginTextBox, GetOkButton = GetOkButton, GetRightMarginTextBox = GetRightMarginTextBox, GetShowPlayerControlsCheckBox = GetShowPlayerControlsCheckBox, GetShowSameVideosCheckBox = GetShowSameVideosCheckBox, GetShowVideoNameCheckBox = GetShowVideoNameCheckBox, GetTopMarginTextBox = GetTopMarginTextBox)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorYouTubeDialog]
  }
}

