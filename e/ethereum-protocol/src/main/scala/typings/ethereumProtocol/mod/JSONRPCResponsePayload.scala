package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONRPCResponsePayload extends StObject {
  
  var id: Double = js.native
  
  var jsonrpc: String = js.native
  
  var result: js.Any = js.native
}
object JSONRPCResponsePayload {
  
  @scala.inline
  def apply(id: Double, jsonrpc: String, result: js.Any): JSONRPCResponsePayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONRPCResponsePayload]
  }
  
  @scala.inline
  implicit class JSONRPCResponsePayloadMutableBuilder[Self <: JSONRPCResponsePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
