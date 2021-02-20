package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events that relate to closing a custom dialog.
  */
@js.native
trait ASPxClientHtmlEditorCustomDialogCloseEventArgsBase extends ASPxClientHtmlEditorCustomDialogEventArgs {
  
  /**
    * Gets the status of the closed custom dialog.
    */
  var status: js.Any = js.native
}
object ASPxClientHtmlEditorCustomDialogCloseEventArgsBase {
  
  @scala.inline
  def apply(name: String, status: js.Any): ASPxClientHtmlEditorCustomDialogCloseEventArgsBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogCloseEventArgsBase]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorCustomDialogCloseEventArgsBaseMutableBuilder[Self <: ASPxClientHtmlEditorCustomDialogCloseEventArgsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
