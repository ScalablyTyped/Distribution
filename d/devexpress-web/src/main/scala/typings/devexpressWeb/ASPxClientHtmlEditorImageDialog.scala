package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Image dialog within the  ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorImageDialog extends ASPxClientHtmlEditorMediaDialogBase {
  
  /**
    * Provides access to the client object of the "Create thumbnail" check box in the Html Editor's Image dialog.
    */
  def GetCreateThumbnailCheckBox(): ASPxClientCheckBox = js.native
  
  /**
    * Provides access to the client object of the "Description" text box in the Html Editor's Image dialog.
    */
  def GetDescriptionTextBox(): ASPxClientTextBox = js.native
  
  /**
    * Provides access to the client object of the "Size" combo box in the Html Editor's Image dialog.
    */
  def GetSizeComboBox(): ASPxClientComboBox = js.native
  
  /**
    * Provides access to the client object of the "New image name" text box in the Html Editor's Image dialog.
    */
  def GetThumbnailNameTextBox(): ASPxClientTextBox = js.native
  
  /**
    * Provides access to the client object of the "Wrap text around image" check box in the Html Editor's Image dialog.
    */
  def GetWrapTextCheckBox(): ASPxClientCheckBox = js.native
}
object ASPxClientHtmlEditorImageDialog {
  
  @scala.inline
  def apply(
    GetBorderColorColorEdit: () => ASPxClientColorEdit,
    GetBorderStyleComboBox: () => ASPxClientComboBox,
    GetBorderWidthSpinEdit: () => ASPxClientSpinEdit,
    GetBottomMarginTextBox: () => ASPxClientTextBox,
    GetCancelButton: () => ASPxClientButton,
    GetCreateThumbnailCheckBox: () => ASPxClientCheckBox,
    GetCssClassNameComboBox: () => ASPxClientComboBox,
    GetDescriptionTextBox: () => ASPxClientTextBox,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHeightSpinEdit: () => ASPxClientSpinEdit,
    GetLeftMarginTextBox: () => ASPxClientTextBox,
    GetMediaFileSelector: () => ASPxClientMediaFileSelector,
    GetMoreOptionsCheckBox: () => ASPxClientCheckBox,
    GetOkButton: () => ASPxClientButton,
    GetPositionComboBox: () => ASPxClientComboBox,
    GetRightMarginTextBox: () => ASPxClientTextBox,
    GetSizeComboBox: () => ASPxClientComboBox,
    GetThumbnailNameTextBox: () => ASPxClientTextBox,
    GetTopMarginTextBox: () => ASPxClientTextBox,
    GetWidthSpinEdit: () => ASPxClientSpinEdit,
    GetWrapTextCheckBox: () => ASPxClientCheckBox
  ): ASPxClientHtmlEditorImageDialog = {
    val __obj = js.Dynamic.literal(GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderStyleComboBox = js.Any.fromFunction0(GetBorderStyleComboBox), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetBottomMarginTextBox = js.Any.fromFunction0(GetBottomMarginTextBox), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetCreateThumbnailCheckBox = js.Any.fromFunction0(GetCreateThumbnailCheckBox), GetCssClassNameComboBox = js.Any.fromFunction0(GetCssClassNameComboBox), GetDescriptionTextBox = js.Any.fromFunction0(GetDescriptionTextBox), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHeightSpinEdit = js.Any.fromFunction0(GetHeightSpinEdit), GetLeftMarginTextBox = js.Any.fromFunction0(GetLeftMarginTextBox), GetMediaFileSelector = js.Any.fromFunction0(GetMediaFileSelector), GetMoreOptionsCheckBox = js.Any.fromFunction0(GetMoreOptionsCheckBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetPositionComboBox = js.Any.fromFunction0(GetPositionComboBox), GetRightMarginTextBox = js.Any.fromFunction0(GetRightMarginTextBox), GetSizeComboBox = js.Any.fromFunction0(GetSizeComboBox), GetThumbnailNameTextBox = js.Any.fromFunction0(GetThumbnailNameTextBox), GetTopMarginTextBox = js.Any.fromFunction0(GetTopMarginTextBox), GetWidthSpinEdit = js.Any.fromFunction0(GetWidthSpinEdit), GetWrapTextCheckBox = js.Any.fromFunction0(GetWrapTextCheckBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorImageDialog]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorImageDialogMutableBuilder[Self <: ASPxClientHtmlEditorImageDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCreateThumbnailCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetCreateThumbnailCheckBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDescriptionTextBox(value: () => ASPxClientTextBox): Self = StObject.set(x, "GetDescriptionTextBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSizeComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetSizeComboBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThumbnailNameTextBox(value: () => ASPxClientTextBox): Self = StObject.set(x, "GetThumbnailNameTextBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWrapTextCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetWrapTextCheckBox", js.Any.fromFunction0(value))
  }
}
