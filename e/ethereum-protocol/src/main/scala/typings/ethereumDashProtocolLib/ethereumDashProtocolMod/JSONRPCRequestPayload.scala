package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONRPCRequestPayload extends js.Object {
  var id: scala.Double
  var jsonrpc: java.lang.String
  var method: java.lang.String
  var params: js.Array[_]
}

object JSONRPCRequestPayload {
  @scala.inline
  def apply(id: scala.Double, jsonrpc: java.lang.String, method: java.lang.String, params: js.Array[_]): JSONRPCRequestPayload = {
    val __obj = js.Dynamic.literal(id = id, jsonrpc = jsonrpc, method = method, params = params)
  
    __obj.asInstanceOf[JSONRPCRequestPayload]
  }
}

