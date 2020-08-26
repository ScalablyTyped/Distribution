package typings.forkTsCheckerWebpackPlugin.rpcMessageMod

import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedureResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "createRpcReturn")
@js.native
object createRpcReturn extends js.Object {
  def apply[TProcedure /* <: RpcProcedure[_, _] */](procedure: TProcedure, index: Double, payload: RpcProcedureResult[TProcedure]): RpcReturn[TProcedure] = js.native
}

