package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Image dialog within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorImageDialog extends ASPxClientHtmlEditorMediaDialogBase {
  /**
    * Provides access to the client object of the "Create thumbnail" check box in the Html Editor's Image dialog.
    */
  def GetCreateThumbnailCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Description" text box in the Html Editor's Image dialog.
    */
  def GetDescriptionTextBox(): ASPxClientTextBox
  /**
    * Provides access to the client object of the "Size" combo box in the Html Editor's Image dialog.
    */
  def GetSizeComboBox(): ASPxClientComboBox
  /**
    * Provides access to the client object of the "New image name" text box in the Html Editor's Image dialog.
    */
  def GetThumbnailNameTextBox(): ASPxClientTextBox
  /**
    * Provides access to the client object of the "Wrap text around image" check box in the Html Editor's Image dialog.
    */
  def GetWrapTextCheckBox(): ASPxClientCheckBox
}

object ASPxClientHtmlEditorImageDialog {
  @scala.inline
  def apply(
    GetBorderColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetBorderStyleComboBox: js.Function0[ASPxClientComboBox],
    GetBorderWidthSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetBottomMarginTextBox: js.Function0[ASPxClientTextBox],
    GetCancelButton: js.Function0[ASPxClientButton],
    GetCreateThumbnailCheckBox: js.Function0[ASPxClientCheckBox],
    GetCssClassNameComboBox: js.Function0[ASPxClientComboBox],
    GetDescriptionTextBox: js.Function0[ASPxClientTextBox],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetHeightSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetLeftMarginTextBox: js.Function0[ASPxClientTextBox],
    GetMediaFileSelector: js.Function0[ASPxClientMediaFileSelector],
    GetMoreOptionsCheckBox: js.Function0[ASPxClientCheckBox],
    GetOkButton: js.Function0[ASPxClientButton],
    GetPositionComboBox: js.Function0[ASPxClientComboBox],
    GetRightMarginTextBox: js.Function0[ASPxClientTextBox],
    GetSizeComboBox: js.Function0[ASPxClientComboBox],
    GetThumbnailNameTextBox: js.Function0[ASPxClientTextBox],
    GetTopMarginTextBox: js.Function0[ASPxClientTextBox],
    GetWidthSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetWrapTextCheckBox: js.Function0[ASPxClientCheckBox]
  ): ASPxClientHtmlEditorImageDialog = {
    val __obj = js.Dynamic.literal(GetBorderColorColorEdit = GetBorderColorColorEdit, GetBorderStyleComboBox = GetBorderStyleComboBox, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit, GetBottomMarginTextBox = GetBottomMarginTextBox, GetCancelButton = GetCancelButton, GetCreateThumbnailCheckBox = GetCreateThumbnailCheckBox, GetCssClassNameComboBox = GetCssClassNameComboBox, GetDescriptionTextBox = GetDescriptionTextBox, GetFormLayout = GetFormLayout, GetHeightSpinEdit = GetHeightSpinEdit, GetLeftMarginTextBox = GetLeftMarginTextBox, GetMediaFileSelector = GetMediaFileSelector, GetMoreOptionsCheckBox = GetMoreOptionsCheckBox, GetOkButton = GetOkButton, GetPositionComboBox = GetPositionComboBox, GetRightMarginTextBox = GetRightMarginTextBox, GetSizeComboBox = GetSizeComboBox, GetThumbnailNameTextBox = GetThumbnailNameTextBox, GetTopMarginTextBox = GetTopMarginTextBox, GetWidthSpinEdit = GetWidthSpinEdit, GetWrapTextCheckBox = GetWrapTextCheckBox)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorImageDialog]
  }
}

