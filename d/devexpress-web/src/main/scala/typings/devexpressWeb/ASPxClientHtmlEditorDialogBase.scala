package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for dialogs within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorDialogBase extends StObject {
  
  /**
    * Provides access to the client object of the "Cancel" button in the Html Editor's dialogs.
    */
  def GetCancelButton(): ASPxClientButton
  
  /**
    * Provides access to the client ASPxFormLayout object that arranges all editors in the Html Editor's dialogs.
    */
  def GetFormLayout(): ASPxClientFormLayout
  
  /**
    * Provides access to the client object of the "OK" button in the Html Editor's dialogs.
    */
  def GetOkButton(): ASPxClientButton
}
object ASPxClientHtmlEditorDialogBase {
  
  inline def apply(
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetOkButton: () => ASPxClientButton
  ): ASPxClientHtmlEditorDialogBase = {
    val __obj = js.Dynamic.literal(GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetOkButton = js.Any.fromFunction0(GetOkButton))
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogBase]
  }
  
  extension [Self <: ASPxClientHtmlEditorDialogBase](x: Self) {
    
    inline def setGetCancelButton(value: () => ASPxClientButton): Self = StObject.set(x, "GetCancelButton", js.Any.fromFunction0(value))
    
    inline def setGetFormLayout(value: () => ASPxClientFormLayout): Self = StObject.set(x, "GetFormLayout", js.Any.fromFunction0(value))
    
    inline def setGetOkButton(value: () => ASPxClientButton): Self = StObject.set(x, "GetOkButton", js.Any.fromFunction0(value))
  }
}
