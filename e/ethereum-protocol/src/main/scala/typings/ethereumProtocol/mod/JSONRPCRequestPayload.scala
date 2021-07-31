package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONRPCRequestPayload extends StObject {
  
  var id: Double
  
  var jsonrpc: String
  
  var method: String
  
  var params: js.Array[js.Any]
}
object JSONRPCRequestPayload {
  
  @scala.inline
  def apply(id: Double, jsonrpc: String, method: String, params: js.Array[js.Any]): JSONRPCRequestPayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONRPCRequestPayload]
  }
  
  @scala.inline
  implicit class JSONRPCRequestPayloadMutableBuilder[Self <: JSONRPCRequestPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Array[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
  }
}
