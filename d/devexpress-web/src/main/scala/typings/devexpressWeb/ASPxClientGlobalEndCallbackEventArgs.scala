package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGlobalEvents.EndCallback event.
  */
@js.native
trait ASPxClientGlobalEndCallbackEventArgs extends ASPxClientEndCallbackEventArgs {
  
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl = js.native
}
object ASPxClientGlobalEndCallbackEventArgs {
  
  @scala.inline
  def apply(command: String, control: ASPxClientControl): ASPxClientGlobalEndCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGlobalEndCallbackEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGlobalEndCallbackEventArgsMutableBuilder[Self <: ASPxClientGlobalEndCallbackEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl(value: ASPxClientControl): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
  }
}
