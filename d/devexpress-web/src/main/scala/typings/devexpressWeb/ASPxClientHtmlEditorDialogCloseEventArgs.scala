package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the event that fires when the HTML Editor dialogs are closed or are going to be closed.
  */
trait ASPxClientHtmlEditorDialogCloseEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the dialog object related to the event.
    */
  var dialog: ASPxClientHtmlEditorDialogBase
  
  /**
    * Gets the dialog name related to the event.
    */
  var dialogName: String
  
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    */
  var parameter: Any
}
object ASPxClientHtmlEditorDialogCloseEventArgs {
  
  inline def apply(dialog: ASPxClientHtmlEditorDialogBase, dialogName: String, parameter: Any): ASPxClientHtmlEditorDialogCloseEventArgs = {
    val __obj = js.Dynamic.literal(dialog = dialog.asInstanceOf[js.Any], dialogName = dialogName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogCloseEventArgs]
  }
  
  extension [Self <: ASPxClientHtmlEditorDialogCloseEventArgs](x: Self) {
    
    inline def setDialog(value: ASPxClientHtmlEditorDialogBase): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    inline def setDialogName(value: String): Self = StObject.set(x, "dialogName", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: Any): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
  }
}
