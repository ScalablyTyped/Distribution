package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONRPCRequestPayload extends js.Object {
  var id: Double
  var jsonrpc: String
  var method: String
  var params: js.Array[_]
}

object JSONRPCRequestPayload {
  @scala.inline
  def apply(id: Double, jsonrpc: String, method: String, params: js.Array[_]): JSONRPCRequestPayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSONRPCRequestPayload]
  }
}

