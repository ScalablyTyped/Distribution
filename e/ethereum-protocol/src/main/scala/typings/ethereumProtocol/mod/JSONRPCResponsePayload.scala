package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONRPCResponsePayload extends js.Object {
  var id: Double
  var jsonrpc: String
  var result: js.Any
}

object JSONRPCResponsePayload {
  @scala.inline
  def apply(id: Double, jsonrpc: String, result: js.Any): JSONRPCResponsePayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONRPCResponsePayload]
  }
}

