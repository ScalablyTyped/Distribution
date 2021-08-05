package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  def sendAsync(payload: JSONRPCRequestPayload, callback: JSONRPCErrorCallback): scala.Unit
}
object Provider {
  
  inline def apply(sendAsync: (JSONRPCRequestPayload, JSONRPCErrorCallback) => scala.Unit): Provider = {
    val __obj = js.Dynamic.literal(sendAsync = js.Any.fromFunction2(sendAsync))
    __obj.asInstanceOf[Provider]
  }
  
  extension [Self <: Provider](x: Self) {
    
    inline def setSendAsync(value: (JSONRPCRequestPayload, JSONRPCErrorCallback) => scala.Unit): Self = StObject.set(x, "sendAsync", js.Any.fromFunction2(value))
  }
}
