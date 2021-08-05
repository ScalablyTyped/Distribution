package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.UniqueDebuggerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableResponse extends StObject {
  
  /**
    * Unique identifier of the debugger.
    */
  var debuggerId: UniqueDebuggerId
}
object EnableResponse {
  
  inline def apply(debuggerId: UniqueDebuggerId): EnableResponse = {
    val __obj = js.Dynamic.literal(debuggerId = debuggerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableResponse]
  }
  
  extension [Self <: EnableResponse](x: Self) {
    
    inline def setDebuggerId(value: UniqueDebuggerId): Self = StObject.set(x, "debuggerId", value.asInstanceOf[js.Any])
  }
}
