package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONRPCResponsePayload extends js.Object {
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
  implicit class JSONRPCResponsePayloadOps[Self <: JSONRPCResponsePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsonrpc(value: String): Self = this.set("jsonrpc", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

