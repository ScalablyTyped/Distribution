package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.DialogInitialized client event.
  */
@js.native
trait ASPxClientHtmlEditorDialogInitializedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a dialog object related to the event.
    */
  var dialog: ASPxClientHtmlEditorDialogBase = js.native
  
  /**
    * Gets the name of the dialog that has been initialized.
    */
  var dialogName: String = js.native
}
object ASPxClientHtmlEditorDialogInitializedEventArgs {
  
  @scala.inline
  def apply(dialog: ASPxClientHtmlEditorDialogBase, dialogName: String): ASPxClientHtmlEditorDialogInitializedEventArgs = {
    val __obj = js.Dynamic.literal(dialog = dialog.asInstanceOf[js.Any], dialogName = dialogName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogInitializedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorDialogInitializedEventArgsMutableBuilder[Self <: ASPxClientHtmlEditorDialogInitializedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialog(value: ASPxClientHtmlEditorDialogBase): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogName(value: String): Self = StObject.set(x, "dialogName", value.asInstanceOf[js.Any])
  }
}
