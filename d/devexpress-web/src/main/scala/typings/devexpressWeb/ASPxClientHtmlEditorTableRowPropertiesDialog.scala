package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Row Properties dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableRowPropertiesDialog
  extends StObject
     with ASPxClientHtmlEditorTableElementPropertiesDialog {
  
  /**
    * Provides access to the client object of the "Height" combo box in the Html Editor's "Row Properties" dialog.
    */
  def GetHeightTypeComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client ASPxSpinEdit object that allows you to specify the row height in the Html Editor's "Row Properties" dialog.
    */
  def GetHeightValueSpinEdit(): ASPxClientSpinEdit
  
  /**
    * Provides access to the client ASPxComboBox object that allows you to specify the row height measurement unit in the Html Editor's "Row Properties" dialog.
    */
  def GetHeightValueTypeComboBox(): ASPxClientComboBox
}
object ASPxClientHtmlEditorTableRowPropertiesDialog {
  
  inline def apply(
    GetBackgroundColorColorEdit: () => ASPxClientColorEdit,
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHeightTypeComboBox: () => ASPxClientComboBox,
    GetHeightValueSpinEdit: () => ASPxClientSpinEdit,
    GetHeightValueTypeComboBox: () => ASPxClientComboBox,
    GetHorizontalAlignmentComboBox: () => ASPxClientComboBox,
    GetOkButton: () => ASPxClientButton,
    GetVerticalAlignmentComboBox: () => ASPxClientComboBox
  ): ASPxClientHtmlEditorTableRowPropertiesDialog = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = js.Any.fromFunction0(GetBackgroundColorColorEdit), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHeightTypeComboBox = js.Any.fromFunction0(GetHeightTypeComboBox), GetHeightValueSpinEdit = js.Any.fromFunction0(GetHeightValueSpinEdit), GetHeightValueTypeComboBox = js.Any.fromFunction0(GetHeightValueTypeComboBox), GetHorizontalAlignmentComboBox = js.Any.fromFunction0(GetHorizontalAlignmentComboBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetVerticalAlignmentComboBox = js.Any.fromFunction0(GetVerticalAlignmentComboBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorTableRowPropertiesDialog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientHtmlEditorTableRowPropertiesDialog] (val x: Self) extends AnyVal {
    
    inline def setGetHeightTypeComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetHeightTypeComboBox", js.Any.fromFunction0(value))
    
    inline def setGetHeightValueSpinEdit(value: () => ASPxClientSpinEdit): Self = StObject.set(x, "GetHeightValueSpinEdit", js.Any.fromFunction0(value))
    
    inline def setGetHeightValueTypeComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetHeightValueTypeComboBox", js.Any.fromFunction0(value))
  }
}
