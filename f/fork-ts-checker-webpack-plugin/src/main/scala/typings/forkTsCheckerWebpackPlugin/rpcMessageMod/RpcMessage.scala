package typings.forkTsCheckerWebpackPlugin.rpcMessageMod

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */, TPayload] extends js.Object {
  var id: Double = js.native
  var payload: TPayload = js.native
  var procedure: TProcedure = js.native
  var rpc: `true` = js.native
  var source: js.UndefOr[String] = js.native
  var `type`: TType = js.native
}

object RpcMessage {
  @scala.inline
  def apply[/* <: java.lang.String */ TType, /* <: typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure[_, _] */ TProcedure, TPayload](id: Double, payload: TPayload, procedure: TProcedure, rpc: `true`, `type`: TType): RpcMessage[TType, TProcedure, TPayload] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any], rpc = rpc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RpcMessage[TType, TProcedure, TPayload]]
  }
  @scala.inline
  implicit class RpcMessageOps[Self <: RpcMessage[_, _, _], /* <: java.lang.String */ TType, /* <: typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure[_, _] */ TProcedure, TPayload] (val x: Self with (RpcMessage[TType, TProcedure, TPayload])) extends AnyVal {
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
    def setPayload(value: TPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcedure(value: TProcedure): Self = this.set("procedure", value.asInstanceOf[js.Any])
    @scala.inline
    def setRpc(value: `true`): Self = this.set("rpc", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

