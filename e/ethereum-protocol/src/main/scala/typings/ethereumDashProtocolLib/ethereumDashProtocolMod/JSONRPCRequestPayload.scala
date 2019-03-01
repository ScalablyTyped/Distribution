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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("jsonrpc")(jsonrpc)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[JSONRPCRequestPayload]
  }
}

