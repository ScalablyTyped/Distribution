package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONRPCResponsePayload extends js.Object {
  var id: scala.Double
  var jsonrpc: java.lang.String
  var result: js.Any
}

object JSONRPCResponsePayload {
  @scala.inline
  def apply(id: scala.Double, jsonrpc: java.lang.String, result: js.Any): JSONRPCResponsePayload = {
    val __obj = js.Dynamic.literal(id = id, jsonrpc = jsonrpc, result = result)
  
    __obj.asInstanceOf[JSONRPCResponsePayload]
  }
}

