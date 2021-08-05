package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Flash dialog within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorFlashDialog
  extends StObject
     with ASPxClientHtmlEditorMediaDialogBase {
  
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
  
  inline def apply(
    GetAllowFullscreenCheckBox: () => ASPxClientCheckBox,
    GetAutoPlayCheckBox: () => ASPxClientCheckBox,
    GetBorderColorColorEdit: () => ASPxClientColorEdit,
    GetBorderStyleComboBox: () => ASPxClientComboBox,
    GetBorderWidthSpinEdit: () => ASPxClientSpinEdit,
    GetBottomMarginTextBox: () => ASPxClientTextBox,
    GetCancelButton: () => ASPxClientButton,
    GetCssClassNameComboBox: () => ASPxClientComboBox,
    GetEnableFlashMenuCheckBox: () => ASPxClientCheckBox,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHeightSpinEdit: () => ASPxClientSpinEdit,
    GetLeftMarginTextBox: () => ASPxClientTextBox,
    GetLoopCheckBox: () => ASPxClientCheckBox,
    GetMediaFileSelector: () => ASPxClientMediaFileSelector,
    GetMoreOptionsCheckBox: () => ASPxClientCheckBox,
    GetOkButton: () => ASPxClientButton,
    GetPositionComboBox: () => ASPxClientComboBox,
    GetQualityComboBox: () => ASPxClientComboBox,
    GetRightMarginTextBox: () => ASPxClientTextBox,
    GetTopMarginTextBox: () => ASPxClientTextBox,
    GetWidthSpinEdit: () => ASPxClientSpinEdit
  ): ASPxClientHtmlEditorFlashDialog = {
    val __obj = js.Dynamic.literal(GetAllowFullscreenCheckBox = js.Any.fromFunction0(GetAllowFullscreenCheckBox), GetAutoPlayCheckBox = js.Any.fromFunction0(GetAutoPlayCheckBox), GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderStyleComboBox = js.Any.fromFunction0(GetBorderStyleComboBox), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetBottomMarginTextBox = js.Any.fromFunction0(GetBottomMarginTextBox), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetCssClassNameComboBox = js.Any.fromFunction0(GetCssClassNameComboBox), GetEnableFlashMenuCheckBox = js.Any.fromFunction0(GetEnableFlashMenuCheckBox), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHeightSpinEdit = js.Any.fromFunction0(GetHeightSpinEdit), GetLeftMarginTextBox = js.Any.fromFunction0(GetLeftMarginTextBox), GetLoopCheckBox = js.Any.fromFunction0(GetLoopCheckBox), GetMediaFileSelector = js.Any.fromFunction0(GetMediaFileSelector), GetMoreOptionsCheckBox = js.Any.fromFunction0(GetMoreOptionsCheckBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetPositionComboBox = js.Any.fromFunction0(GetPositionComboBox), GetQualityComboBox = js.Any.fromFunction0(GetQualityComboBox), GetRightMarginTextBox = js.Any.fromFunction0(GetRightMarginTextBox), GetTopMarginTextBox = js.Any.fromFunction0(GetTopMarginTextBox), GetWidthSpinEdit = js.Any.fromFunction0(GetWidthSpinEdit))
    __obj.asInstanceOf[ASPxClientHtmlEditorFlashDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorFlashDialog](x: Self) {
    
    inline def setGetAllowFullscreenCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetAllowFullscreenCheckBox", js.Any.fromFunction0(value))
    
    inline def setGetAutoPlayCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetAutoPlayCheckBox", js.Any.fromFunction0(value))
    
    inline def setGetEnableFlashMenuCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetEnableFlashMenuCheckBox", js.Any.fromFunction0(value))
    
    inline def setGetLoopCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetLoopCheckBox", js.Any.fromFunction0(value))
    
    inline def setGetQualityComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetQualityComboBox", js.Any.fromFunction0(value))
  }
}
