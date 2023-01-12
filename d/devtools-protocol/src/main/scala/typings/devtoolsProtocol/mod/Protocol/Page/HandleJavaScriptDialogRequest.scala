package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleJavaScriptDialogRequest extends StObject {
  
  /**
    * Whether to accept or dismiss the dialog.
    */
  var accept: Boolean
  
  /**
    * The text to enter into the dialog prompt before accepting. Used only if this is a prompt
    * dialog.
    */
  var promptText: js.UndefOr[String] = js.undefined
}
object HandleJavaScriptDialogRequest {
  
  inline def apply(accept: Boolean): HandleJavaScriptDialogRequest = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleJavaScriptDialogRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandleJavaScriptDialogRequest] (val x: Self) extends AnyVal {
    
    inline def setAccept(value: Boolean): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setPromptText(value: String): Self = StObject.set(x, "promptText", value.asInstanceOf[js.Any])
    
    inline def setPromptTextUndefined: Self = StObject.set(x, "promptText", js.undefined)
  }
}
