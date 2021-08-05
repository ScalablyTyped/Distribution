package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client BeginCallback events.
  */
trait MVCxClientBeginCallbackEventArgs
  extends StObject
     with ASPxClientBeginCallbackEventArgs {
  
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    */
  var customArgs: js.Any
}
object MVCxClientBeginCallbackEventArgs {
  
  inline def apply(command: String, customArgs: js.Any): MVCxClientBeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], customArgs = customArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientBeginCallbackEventArgs]
  }
  
  extension [Self <: MVCxClientBeginCallbackEventArgs](x: Self) {
    
    inline def setCustomArgs(value: js.Any): Self = StObject.set(x, "customArgs", value.asInstanceOf[js.Any])
  }
}
