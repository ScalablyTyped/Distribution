package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the MVCxClientGlobalEvents.BeginCallback event.
  */
trait MVCxClientGlobalBeginCallbackEventArgs
  extends StObject
     with ASPxClientGlobalBeginCallbackEventArgs {
  
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    */
  var customArgs: Any
}
object MVCxClientGlobalBeginCallbackEventArgs {
  
  inline def apply(command: String, control: ASPxClientControl, customArgs: Any): MVCxClientGlobalBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], customArgs = customArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientGlobalBeginCallbackEventArgs]
  }
  
  extension [Self <: MVCxClientGlobalBeginCallbackEventArgs](x: Self) {
    
    inline def setCustomArgs(value: Any): Self = StObject.set(x, "customArgs", value.asInstanceOf[js.Any])
  }
}
