package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.DialogClosing event.
  */
@js.native
trait ASPxClientHtmlEditorDialogClosingEventArgs extends ASPxClientHtmlEditorDialogCloseEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
}
object ASPxClientHtmlEditorDialogClosingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, dialog: ASPxClientHtmlEditorDialogBase, dialogName: String, parameter: js.Any): ASPxClientHtmlEditorDialogClosingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], dialogName = dialogName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogClosingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorDialogClosingEventArgsMutableBuilder[Self <: ASPxClientHtmlEditorDialogClosingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
