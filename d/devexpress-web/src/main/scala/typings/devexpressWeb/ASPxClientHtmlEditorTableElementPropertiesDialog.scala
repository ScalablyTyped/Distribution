package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for Table dialogs within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableElementPropertiesDialog
  extends StObject
     with ASPxClientHtmlEditorTableDialogBase {
  
  /**
    * Provides access to the client object of the "Horizontal" combo box in the Html Editor's Row/Column/Cell Properties dialog's Alignment group.
    */
  def GetHorizontalAlignmentComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "Vertical" combo box in the Html Editor's Row/Column/Cell Properties dialog's Alignment group.
    */
  def GetVerticalAlignmentComboBox(): ASPxClientComboBox
}
object ASPxClientHtmlEditorTableElementPropertiesDialog {
  
  inline def apply(
    GetBackgroundColorColorEdit: () => ASPxClientColorEdit,
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHorizontalAlignmentComboBox: () => ASPxClientComboBox,
    GetOkButton: () => ASPxClientButton,
    GetVerticalAlignmentComboBox: () => ASPxClientComboBox
  ): ASPxClientHtmlEditorTableElementPropertiesDialog = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = js.Any.fromFunction0(GetBackgroundColorColorEdit), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHorizontalAlignmentComboBox = js.Any.fromFunction0(GetHorizontalAlignmentComboBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetVerticalAlignmentComboBox = js.Any.fromFunction0(GetVerticalAlignmentComboBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorTableElementPropertiesDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorTableElementPropertiesDialog](x: Self) {
    
    inline def setGetHorizontalAlignmentComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetHorizontalAlignmentComboBox", js.Any.fromFunction0(value))
    
    inline def setGetVerticalAlignmentComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetVerticalAlignmentComboBox", js.Any.fromFunction0(value))
  }
}
