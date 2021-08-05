package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Placeholder dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorPlaceholderDialog
  extends StObject
     with ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the ASPxListBox client object that lists placeholder names in the Html Editor's Placeholder dialog.
    */
  def GetPlaceholderNameListBox(): ASPxClientListBox
}
object ASPxClientHtmlEditorPlaceholderDialog {
  
  inline def apply(
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetOkButton: () => ASPxClientButton,
    GetPlaceholderNameListBox: () => ASPxClientListBox
  ): ASPxClientHtmlEditorPlaceholderDialog = {
    val __obj = js.Dynamic.literal(GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetOkButton = js.Any.fromFunction0(GetOkButton), GetPlaceholderNameListBox = js.Any.fromFunction0(GetPlaceholderNameListBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorPlaceholderDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorPlaceholderDialog](x: Self) {
    
    inline def setGetPlaceholderNameListBox(value: () => ASPxClientListBox): Self = StObject.set(x, "GetPlaceholderNameListBox", js.Any.fromFunction0(value))
  }
}
