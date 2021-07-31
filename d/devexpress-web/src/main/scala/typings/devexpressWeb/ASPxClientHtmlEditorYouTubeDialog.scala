package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the YouTube Video dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorYouTubeDialog
  extends StObject
     with ASPxClientHtmlEditorEditElementDialog {
  
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
  implicit class ASPxClientHtmlEditorYouTubeDialogMutableBuilder[Self <: ASPxClientHtmlEditorYouTubeDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAllowFullscreenCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetAllowFullscreenCheckBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetConfidentModeCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetConfidentModeCheckBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShowPlayerControlsCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetShowPlayerControlsCheckBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShowSameVideosCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetShowSameVideosCheckBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShowVideoNameCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetShowVideoNameCheckBox", js.Any.fromFunction0(value))
  }
}
