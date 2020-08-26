package typings.forkTsCheckerWebpackPlugin.rpcClientMod

import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcClient", "createRpcClient")
@js.native
object createRpcClient extends js.Object {
  def apply(port: RpcMessagePort): RpcClient = js.native
}

