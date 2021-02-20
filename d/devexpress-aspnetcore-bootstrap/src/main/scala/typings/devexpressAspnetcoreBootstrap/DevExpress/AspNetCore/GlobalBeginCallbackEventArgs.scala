package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalBeginCallbackEventArgs extends BeginCallbackEventArgs {
  
  val control: Control = js.native
}
object GlobalBeginCallbackEventArgs {
  
  @scala.inline
  def apply(command: String, control: Control, sender: Control): GlobalBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalBeginCallbackEventArgs]
  }
  
  @scala.inline
  implicit class GlobalBeginCallbackEventArgsMutableBuilder[Self <: GlobalBeginCallbackEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl(value: Control): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
  }
}
