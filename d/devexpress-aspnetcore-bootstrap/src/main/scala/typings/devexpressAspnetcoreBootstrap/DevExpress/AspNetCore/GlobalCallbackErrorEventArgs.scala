package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalCallbackErrorEventArgs
  extends StObject
     with CallbackErrorEventArgs {
  
  val control: Control
}
object GlobalCallbackErrorEventArgs {
  
  inline def apply(control: Control, handled: Boolean, message: String, sender: Control): GlobalCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalCallbackErrorEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalCallbackErrorEventArgs] (val x: Self) extends AnyVal {
    
    inline def setControl(value: Control): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
  }
}
