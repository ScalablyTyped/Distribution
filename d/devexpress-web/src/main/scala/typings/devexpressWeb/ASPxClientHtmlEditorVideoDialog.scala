package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Video dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorVideoDialog
  extends StObject
     with ASPxClientHtmlEditorMediaDialogBase {
  
  /**
    * Provides access to the client object of the "Auto play" check box in the Html Editor's Video dialog.
    */
  def GetAutoPlayCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Loop" check box in the Html Editor's Video dialog.
    */
  def GetLoopCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Poster URL" text box in the Html Editor's Video dialog.
    */
  def GetPosterTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "Preload mode" combo box in the Html Editor's Video dialog.
    */
  def GetPreloadModeComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "Show player controls" check box in the Html Editor's Video dialog.
    */
  def GetShowPlayerControlsCheckBox(): ASPxClientCheckBox
}
object ASPxClientHtmlEditorVideoDialog {
  
  inline def apply(
    GetAutoPlayCheckBox: () => ASPxClientCheckBox,
    GetBorderColorColorEdit: () => ASPxClientColorEdit,
    GetBorderStyleComboBox: () => ASPxClientComboBox,
    GetBorderWidthSpinEdit: () => ASPxClientSpinEdit,
    GetBottomMarginTextBox: () => ASPxClientTextBox,
    GetCancelButton: () => ASPxClientButton,
    GetCssClassNameComboBox: () => ASPxClientComboBox,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHeightSpinEdit: () => ASPxClientSpinEdit,
    GetLeftMarginTextBox: () => ASPxClientTextBox,
    GetLoopCheckBox: () => ASPxClientCheckBox,
    GetMediaFileSelector: () => ASPxClientMediaFileSelector,
    GetMoreOptionsCheckBox: () => ASPxClientCheckBox,
    GetOkButton: () => ASPxClientButton,
    GetPositionComboBox: () => ASPxClientComboBox,
    GetPosterTextBox: () => ASPxClientTextBox,
    GetPreloadModeComboBox: () => ASPxClientComboBox,
    GetRightMarginTextBox: () => ASPxClientTextBox,
    GetShowPlayerControlsCheckBox: () => ASPxClientCheckBox,
    GetTopMarginTextBox: () => ASPxClientTextBox,
    GetWidthSpinEdit: () => ASPxClientSpinEdit
  ): ASPxClientHtmlEditorVideoDialog = {
    val __obj = js.Dynamic.literal(GetAutoPlayCheckBox = js.Any.fromFunction0(GetAutoPlayCheckBox), GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderStyleComboBox = js.Any.fromFunction0(GetBorderStyleComboBox), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetBottomMarginTextBox = js.Any.fromFunction0(GetBottomMarginTextBox), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetCssClassNameComboBox = js.Any.fromFunction0(GetCssClassNameComboBox), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHeightSpinEdit = js.Any.fromFunction0(GetHeightSpinEdit), GetLeftMarginTextBox = js.Any.fromFunction0(GetLeftMarginTextBox), GetLoopCheckBox = js.Any.fromFunction0(GetLoopCheckBox), GetMediaFileSelector = js.Any.fromFunction0(GetMediaFileSelector), GetMoreOptionsCheckBox = js.Any.fromFunction0(GetMoreOptionsCheckBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetPositionComboBox = js.Any.fromFunction0(GetPositionComboBox), GetPosterTextBox = js.Any.fromFunction0(GetPosterTextBox), GetPreloadModeComboBox = js.Any.fromFunction0(GetPreloadModeComboBox), GetRightMarginTextBox = js.Any.fromFunction0(GetRightMarginTextBox), GetShowPlayerControlsCheckBox = js.Any.fromFunction0(GetShowPlayerControlsCheckBox), GetTopMarginTextBox = js.Any.fromFunction0(GetTopMarginTextBox), GetWidthSpinEdit = js.Any.fromFunction0(GetWidthSpinEdit))
    __obj.asInstanceOf[ASPxClientHtmlEditorVideoDialog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientHtmlEditorVideoDialog] (val x: Self) extends AnyVal {
    
    inline def setGetAutoPlayCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetAutoPlayCheckBox", js.Any.fromFunction0(value))
    
    inline def setGetLoopCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetLoopCheckBox", js.Any.fromFunction0(value))
    
    inline def setGetPosterTextBox(value: () => ASPxClientTextBox): Self = StObject.set(x, "GetPosterTextBox", js.Any.fromFunction0(value))
    
    inline def setGetPreloadModeComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetPreloadModeComboBox", js.Any.fromFunction0(value))
    
    inline def setGetShowPlayerControlsCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetShowPlayerControlsCheckBox", js.Any.fromFunction0(value))
  }
}
