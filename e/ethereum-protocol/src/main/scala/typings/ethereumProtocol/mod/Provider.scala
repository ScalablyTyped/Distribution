package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Provider extends js.Object {
  def sendAsync(payload: JSONRPCRequestPayload, callback: JSONRPCErrorCallback): scala.Unit = js.native
}

object Provider {
  @scala.inline
  def apply(sendAsync: (JSONRPCRequestPayload, JSONRPCErrorCallback) => scala.Unit): Provider = {
    val __obj = js.Dynamic.literal(sendAsync = js.Any.fromFunction2(sendAsync))
    __obj.asInstanceOf[Provider]
  }
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
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
    def setSendAsync(value: (JSONRPCRequestPayload, JSONRPCErrorCallback) => scala.Unit): Self = this.set("sendAsync", js.Any.fromFunction2(value))
  }
  
}

