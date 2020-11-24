package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the YouTube Video dialog within the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorYouTubeDialog extends ASPxClientHtmlEditorEditElementDialog {
  
  /**
    * Provides access to the client object of the "Allow fullscreen" check box in the Html Editor's "Insert YouTube Video" dialog.
    */
  def GetAllowFullscreenCheckBox(): ASPxClientCheckBox = js.native
  
  /**
    * Provides access to the client object of the "Enable privacy-enhanced mode" check box in the Html Editor's YouTube Video dialog.
    */
  def GetConfidentModeCheckBox(): ASPxClientCheckBox = js.native
  
  /**
    * Provides access to the client object of the "Show player controls" check box in the Html Editor's YouTube Video dialog.
    */
  def GetShowPlayerControlsCheckBox(): ASPxClientCheckBox = js.native
  
  /**
    * Provides access to the client object of the "Show suggested videos when the video finishes" check box in the Html Editor's YouTube Video dialog.
    */
  def GetShowSameVideosCheckBox(): ASPxClientCheckBox = js.native
  
  /**
    * Provides access to the client object of the "Show video title and player actions" check box in the Html Editor's YouTube Video dialog.
    */
  def GetShowVideoNameCheckBox(): ASPxClientCheckBox = js.native
}
object ASPxClientHtmlEditorYouTubeDialog {
  
  @scala.inline
  def apply(
    GetAllowFullscreenCheckBox: () => ASPxClientCheckBox,
    GetBorderColorColorEdit: () => ASPxClientColorEdit,
    GetBorderStyleComboBox: () => ASPxClientComboBox,
    GetBorderWidthSpinEdit: () => ASPxClientSpinEdit,
    GetBottomMarginTextBox: () => ASPxClientTextBox,
    GetCancelButton: () => ASPxClientButton,
    GetConfidentModeCheckBox: () => ASPxClientCheckBox,
    GetCssClassNameComboBox: () => ASPxClientComboBox,
    GetFormLayout: () => ASPxClientFormLayout,
    GetLeftMarginTextBox: () => ASPxClientTextBox,
    GetOkButton: () => ASPxClientButton,
    GetRightMarginTextBox: () => ASPxClientTextBox,
    GetShowPlayerControlsCheckBox: () => ASPxClientCheckBox,
    GetShowSameVideosCheckBox: () => ASPxClientCheckBox,
    GetShowVideoNameCheckBox: () => ASPxClientCheckBox,
    GetTopMarginTextBox: () => ASPxClientTextBox
  ): ASPxClientHtmlEditorYouTubeDialog = {
    val __obj = js.Dynamic.literal(GetAllowFullscreenCheckBox = js.Any.fromFunction0(GetAllowFullscreenCheckBox), GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderStyleComboBox = js.Any.fromFunction0(GetBorderStyleComboBox), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetBottomMarginTextBox = js.Any.fromFunction0(GetBottomMarginTextBox), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetConfidentModeCheckBox = js.Any.fromFunction0(GetConfidentModeCheckBox), GetCssClassNameComboBox = js.Any.fromFunction0(GetCssClassNameComboBox), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetLeftMarginTextBox = js.Any.fromFunction0(GetLeftMarginTextBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetRightMarginTextBox = js.Any.fromFunction0(GetRightMarginTextBox), GetShowPlayerControlsCheckBox = js.Any.fromFunction0(GetShowPlayerControlsCheckBox), GetShowSameVideosCheckBox = js.Any.fromFunction0(GetShowSameVideosCheckBox), GetShowVideoNameCheckBox = js.Any.fromFunction0(GetShowVideoNameCheckBox), GetTopMarginTextBox = js.Any.fromFunction0(GetTopMarginTextBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorYouTubeDialog]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorYouTubeDialogOps[Self <: ASPxClientHtmlEditorYouTubeDialog] (val x: Self) extends AnyVal {
    
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
    def setGetAllowFullscreenCheckBox(value: () => ASPxClientCheckBox): Self = this.set("GetAllowFullscreenCheckBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetConfidentModeCheckBox(value: () => ASPxClientCheckBox): Self = this.set("GetConfidentModeCheckBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShowPlayerControlsCheckBox(value: () => ASPxClientCheckBox): Self = this.set("GetShowPlayerControlsCheckBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShowSameVideosCheckBox(value: () => ASPxClientCheckBox): Self = this.set("GetShowSameVideosCheckBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShowVideoNameCheckBox(value: () => ASPxClientCheckBox): Self = this.set("GetShowVideoNameCheckBox", js.Any.fromFunction0(value))
  }
}
