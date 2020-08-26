package typings.forkTsCheckerWebpackPlugin.rpcMessageMod

import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "createRpcMessage")
@js.native
object createRpcMessage extends js.Object {
  def apply[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */, TPayload](procedure: TProcedure, id: Double, `type`: TType, payload: TPayload): RpcMessage[TType, TProcedure, TPayload] = js.native
  def apply[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */, TPayload](procedure: TProcedure, id: Double, `type`: TType, payload: TPayload, source: String): RpcMessage[TType, TProcedure, TPayload] = js.native
}

