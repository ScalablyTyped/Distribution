package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONRPCResponsePayload extends StObject {
  
  var id: Double
  
  var jsonrpc: String
  
  var result: Any
}
object JSONRPCResponsePayload {
  
  inline def apply(id: Double, jsonrpc: String, result: Any): JSONRPCResponsePayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONRPCResponsePayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSONRPCResponsePayload] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
