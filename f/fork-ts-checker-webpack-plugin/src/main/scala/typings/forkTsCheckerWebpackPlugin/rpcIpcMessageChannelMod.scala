package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc/RpcIpcMessageChannel", JSImport.Namespace)
@js.native
object rpcIpcMessageChannelMod extends js.Object {
  
  def createRpcIpcMessageChannel(servicePath: String): RpcMessageChannel = js.native
  def createRpcIpcMessageChannel(servicePath: String, memoryLimit: Double): RpcMessageChannel = js.native
}
