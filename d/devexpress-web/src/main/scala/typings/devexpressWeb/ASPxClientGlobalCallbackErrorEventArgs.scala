package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGlobalEvents.CallbackError event.
  */
trait ASPxClientGlobalCallbackErrorEventArgs
  extends StObject
     with ASPxClientCallbackErrorEventArgs {
  
  /**
    * Gets an object that initiated a callback.
    */
  var control: ASPxClientControl
}
object ASPxClientGlobalCallbackErrorEventArgs {
  
  inline def apply(control: ASPxClientControl, handled: Boolean, message: String): ASPxClientGlobalCallbackErrorEventArgs = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGlobalCallbackErrorEventArgs]
  }
  
  extension [Self <: ASPxClientGlobalCallbackErrorEventArgs](x: Self) {
    
    inline def setControl(value: ASPxClientControl): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
  }
}
