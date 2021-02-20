package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGlobalEvents.BeginCallback event.
  */
@js.native
trait ASPxClientGlobalBeginCallbackEventArgs extends ASPxClientBeginCallbackEventArgs {
  
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl = js.native
}
object ASPxClientGlobalBeginCallbackEventArgs {
  
  @scala.inline
  def apply(command: String, control: ASPxClientControl): ASPxClientGlobalBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGlobalBeginCallbackEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGlobalBeginCallbackEventArgsMutableBuilder[Self <: ASPxClientGlobalBeginCallbackEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl(value: ASPxClientControl): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
  }
}
