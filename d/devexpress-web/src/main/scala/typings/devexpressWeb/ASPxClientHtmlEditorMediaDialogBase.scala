package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the media dialogs within the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorMediaDialogBase extends ASPxClientHtmlEditorEditElementDialog {
  
  /**
    * Provides access to the client object of the "Height" spin editor in the Html Editor's Audio/Video/Flash dialogs.
    */
  def GetHeightSpinEdit(): ASPxClientSpinEdit = js.native
  
  /**
    * Provides access to the client object of the media file selector that allows you to insert/change media files in the Html Editor's Audio/Video/Flash dialogs.
    */
  def GetMediaFileSelector(): ASPxClientMediaFileSelector = js.native
  
  /**
    * Provides access to the client object of the "More options" check box in the Html Editor's Audio/Video/Flash/Image dialogs.
    */
  def GetMoreOptionsCheckBox(): ASPxClientCheckBox = js.native
  
  /**
    * Provides access to the client object of the "Position" combo box in the Html Editor's Audio/Video/Flash/Image dialogs.
    */
  def GetPositionComboBox(): ASPxClientComboBox = js.native
  
  /**
    * Provides access to the client object of the "Width" spin editor in the Html Editor's Audio/Video/Flash dialogs.
    */
  def GetWidthSpinEdit(): ASPxClientSpinEdit = js.native
}
object ASPxClientHtmlEditorMediaDialogBase {
  
  @scala.inline
  def apply(
    GetBorderColorColorEdit: () => ASPxClientColorEdit,
    GetBorderStyleComboBox: () => ASPxClientComboBox,
    GetBorderWidthSpinEdit: () => ASPxClientSpinEdit,
    GetBottomMarginTextBox: () => ASPxClientTextBox,
    GetCancelButton: () => ASPxClientButton,
    GetCssClassNameComboBox: () => ASPxClientComboBox,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHeightSpinEdit: () => ASPxClientSpinEdit,
    GetLeftMarginTextBox: () => ASPxClientTextBox,
    GetMediaFileSelector: () => ASPxClientMediaFileSelector,
    GetMoreOptionsCheckBox: () => ASPxClientCheckBox,
    GetOkButton: () => ASPxClientButton,
    GetPositionComboBox: () => ASPxClientComboBox,
    GetRightMarginTextBox: () => ASPxClientTextBox,
    GetTopMarginTextBox: () => ASPxClientTextBox,
    GetWidthSpinEdit: () => ASPxClientSpinEdit
  ): ASPxClientHtmlEditorMediaDialogBase = {
    val __obj = js.Dynamic.literal(GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderStyleComboBox = js.Any.fromFunction0(GetBorderStyleComboBox), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetBottomMarginTextBox = js.Any.fromFunction0(GetBottomMarginTextBox), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetCssClassNameComboBox = js.Any.fromFunction0(GetCssClassNameComboBox), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHeightSpinEdit = js.Any.fromFunction0(GetHeightSpinEdit), GetLeftMarginTextBox = js.Any.fromFunction0(GetLeftMarginTextBox), GetMediaFileSelector = js.Any.fromFunction0(GetMediaFileSelector), GetMoreOptionsCheckBox = js.Any.fromFunction0(GetMoreOptionsCheckBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetPositionComboBox = js.Any.fromFunction0(GetPositionComboBox), GetRightMarginTextBox = js.Any.fromFunction0(GetRightMarginTextBox), GetTopMarginTextBox = js.Any.fromFunction0(GetTopMarginTextBox), GetWidthSpinEdit = js.Any.fromFunction0(GetWidthSpinEdit))
    __obj.asInstanceOf[ASPxClientHtmlEditorMediaDialogBase]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorMediaDialogBaseMutableBuilder[Self <: ASPxClientHtmlEditorMediaDialogBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetHeightSpinEdit(value: () => ASPxClientSpinEdit): Self = StObject.set(x, "GetHeightSpinEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMediaFileSelector(value: () => ASPxClientMediaFileSelector): Self = StObject.set(x, "GetMediaFileSelector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMoreOptionsCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetMoreOptionsCheckBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPositionComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetPositionComboBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidthSpinEdit(value: () => ASPxClientSpinEdit): Self = StObject.set(x, "GetWidthSpinEdit", js.Any.fromFunction0(value))
  }
}
