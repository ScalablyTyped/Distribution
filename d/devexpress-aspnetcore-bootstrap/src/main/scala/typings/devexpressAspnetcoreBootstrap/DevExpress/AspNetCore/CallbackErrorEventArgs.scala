package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackErrorEventArgs
  extends StObject
     with EventArgs {
  
  var handled: Boolean
  
  var message: String
}
object CallbackErrorEventArgs {
  
  @scala.inline
  def apply(handled: Boolean, message: String, sender: Control): CallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackErrorEventArgs]
  }
  
  @scala.inline
  implicit class CallbackErrorEventArgsMutableBuilder[Self <: CallbackErrorEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
