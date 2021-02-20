package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalCallbackErrorEventArgs extends CallbackErrorEventArgs {
  
  val control: Control = js.native
}
object GlobalCallbackErrorEventArgs {
  
  @scala.inline
  def apply(control: Control, handled: Boolean, message: String, sender: Control): GlobalCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalCallbackErrorEventArgs]
  }
  
  @scala.inline
  implicit class GlobalCallbackErrorEventArgsMutableBuilder[Self <: GlobalCallbackErrorEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl(value: Control): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
  }
}
