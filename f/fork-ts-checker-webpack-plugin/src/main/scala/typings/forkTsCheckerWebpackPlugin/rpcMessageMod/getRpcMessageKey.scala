package typings.forkTsCheckerWebpackPlugin.rpcMessageMod

import typings.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "getRpcMessageKey")
@js.native
object getRpcMessageKey extends js.Object {
  def apply(message: RpcMessage[String, RpcProcedure[_, _], _]): String = js.native
}

