package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.DialogInitialized client event.
  */
trait ASPxClientHtmlEditorDialogInitializedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a dialog object related to the event.
    */
  var dialog: ASPxClientHtmlEditorDialogBase
  
  /**
    * Gets the name of the dialog that has been initialized.
    */
  var dialogName: String
}
object ASPxClientHtmlEditorDialogInitializedEventArgs {
  
  inline def apply(dialog: ASPxClientHtmlEditorDialogBase, dialogName: String): ASPxClientHtmlEditorDialogInitializedEventArgs = {
    val __obj = js.Dynamic.literal(dialog = dialog.asInstanceOf[js.Any], dialogName = dialogName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogInitializedEventArgs]
  }
  
  extension [Self <: ASPxClientHtmlEditorDialogInitializedEventArgs](x: Self) {
    
    inline def setDialog(value: ASPxClientHtmlEditorDialogBase): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    inline def setDialogName(value: String): Self = StObject.set(x, "dialogName", value.asInstanceOf[js.Any])
  }
}
