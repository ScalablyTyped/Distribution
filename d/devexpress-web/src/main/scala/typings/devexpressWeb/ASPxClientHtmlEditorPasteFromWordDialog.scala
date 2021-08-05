package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Paste From Word dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorPasteFromWordDialog
  extends StObject
     with ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the client object of the "Remove font family" check box in the Html Editor's Flash dialog.
    */
  def GetRemoveFontFamilyCheckBox(): ASPxClientCheckBox
}
object ASPxClientHtmlEditorPasteFromWordDialog {
  
  inline def apply(
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetOkButton: () => ASPxClientButton,
    GetRemoveFontFamilyCheckBox: () => ASPxClientCheckBox
  ): ASPxClientHtmlEditorPasteFromWordDialog = {
    val __obj = js.Dynamic.literal(GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetOkButton = js.Any.fromFunction0(GetOkButton), GetRemoveFontFamilyCheckBox = js.Any.fromFunction0(GetRemoveFontFamilyCheckBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorPasteFromWordDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorPasteFromWordDialog](x: Self) {
    
    inline def setGetRemoveFontFamilyCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetRemoveFontFamilyCheckBox", js.Any.fromFunction0(value))
  }
}
