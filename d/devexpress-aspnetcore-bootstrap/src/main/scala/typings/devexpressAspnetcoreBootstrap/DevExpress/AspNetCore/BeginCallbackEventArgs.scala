package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginCallbackEventArgs extends EventArgs {
  
  val command: String = js.native
}
object BeginCallbackEventArgs {
  
  @scala.inline
  def apply(command: String, sender: Control): BeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginCallbackEventArgs]
  }
  
  @scala.inline
  implicit class BeginCallbackEventArgsMutableBuilder[Self <: BeginCallbackEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
