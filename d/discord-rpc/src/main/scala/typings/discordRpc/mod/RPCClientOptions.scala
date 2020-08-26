package typings.discordRpc.mod

import typings.discordRpc.discordRpcStrings.ipc
import typings.discordRpc.discordRpcStrings.websocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RPCClientOptions extends js.Object {
  var transport: ipc | websocket = js.native
}

object RPCClientOptions {
  @scala.inline
  def apply(transport: ipc | websocket): RPCClientOptions = {
    val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCClientOptions]
  }
  @scala.inline
  implicit class RPCClientOptionsOps[Self <: RPCClientOptions] (val x: Self) extends AnyVal {
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
    def setTransport(value: ipc | websocket): Self = this.set("transport", value.asInstanceOf[js.Any])
  }
  
}

