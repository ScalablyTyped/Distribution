package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPausedInDebuggerMessageRequest extends StObject {
  
  /**
    * The message to display, also triggers resume and step over controls.
    */
  var message: js.UndefOr[String] = js.undefined
}
object SetPausedInDebuggerMessageRequest {
  
  inline def apply(): SetPausedInDebuggerMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetPausedInDebuggerMessageRequest]
  }
  
  extension [Self <: SetPausedInDebuggerMessageRequest](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
