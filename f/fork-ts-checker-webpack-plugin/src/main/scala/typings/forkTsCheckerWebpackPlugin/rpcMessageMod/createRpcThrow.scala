package typings.forkTsCheckerWebpackPlugin.rpcMessageMod

import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "createRpcThrow")
@js.native
object createRpcThrow extends js.Object {
  def apply[TProcedure /* <: RpcProcedure[_, _] */, TError](procedure: TProcedure, index: Double, payload: RpcRemoteError): RpcThrow[TProcedure] = js.native
}

