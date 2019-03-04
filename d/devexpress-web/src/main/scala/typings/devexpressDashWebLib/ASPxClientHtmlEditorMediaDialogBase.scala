package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the media dialogs within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorMediaDialogBase extends ASPxClientHtmlEditorEditElementDialog {
  /**
    * Provides access to the client object of the "Height" spin editor in the Html Editor's Audio/Video/Flash dialogs.
    */
  def GetHeightSpinEdit(): ASPxClientSpinEdit
  /**
    * Provides access to the client object of the media file selector that allows you to insert/change media files in the Html Editor's Audio/Video/Flash dialogs.
    */
  def GetMediaFileSelector(): ASPxClientMediaFileSelector
  /**
    * Provides access to the client object of the "More options" check box in the Html Editor's Audio/Video/Flash/Image dialogs.
    */
  def GetMoreOptionsCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Position" combo box in the Html Editor's Audio/Video/Flash/Image dialogs.
    */
  def GetPositionComboBox(): ASPxClientComboBox
  /**
    * Provides access to the client object of the "Width" spin editor in the Html Editor's Audio/Video/Flash dialogs.
    */
  def GetWidthSpinEdit(): ASPxClientSpinEdit
}

object ASPxClientHtmlEditorMediaDialogBase {
  @scala.inline
  def apply(
    GetBorderColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetBorderStyleComboBox: js.Function0[ASPxClientComboBox],
    GetBorderWidthSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetBottomMarginTextBox: js.Function0[ASPxClientTextBox],
    GetCancelButton: js.Function0[ASPxClientButton],
    GetCssClassNameComboBox: js.Function0[ASPxClientComboBox],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetHeightSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetLeftMarginTextBox: js.Function0[ASPxClientTextBox],
    GetMediaFileSelector: js.Function0[ASPxClientMediaFileSelector],
    GetMoreOptionsCheckBox: js.Function0[ASPxClientCheckBox],
    GetOkButton: js.Function0[ASPxClientButton],
    GetPositionComboBox: js.Function0[ASPxClientComboBox],
    GetRightMarginTextBox: js.Function0[ASPxClientTextBox],
    GetTopMarginTextBox: js.Function0[ASPxClientTextBox],
    GetWidthSpinEdit: js.Function0[ASPxClientSpinEdit]
  ): ASPxClientHtmlEditorMediaDialogBase = {
    val __obj = js.Dynamic.literal(GetBorderColorColorEdit = GetBorderColorColorEdit, GetBorderStyleComboBox = GetBorderStyleComboBox, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit, GetBottomMarginTextBox = GetBottomMarginTextBox, GetCancelButton = GetCancelButton, GetCssClassNameComboBox = GetCssClassNameComboBox, GetFormLayout = GetFormLayout, GetHeightSpinEdit = GetHeightSpinEdit, GetLeftMarginTextBox = GetLeftMarginTextBox, GetMediaFileSelector = GetMediaFileSelector, GetMoreOptionsCheckBox = GetMoreOptionsCheckBox, GetOkButton = GetOkButton, GetPositionComboBox = GetPositionComboBox, GetRightMarginTextBox = GetRightMarginTextBox, GetTopMarginTextBox = GetTopMarginTextBox, GetWidthSpinEdit = GetWidthSpinEdit)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorMediaDialogBase]
  }
}

