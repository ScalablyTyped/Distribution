package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.processLikeMod.ProcessLike
import typings.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc", JSImport.Namespace)
@js.native
object rpcIpcMod extends js.Object {
  def createRpcIpcForkedProcessMessagePort(filePath: String): RpcMessagePort = js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: js.UndefOr[scala.Nothing], autoRecreate: Boolean): RpcMessagePort = js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Double): RpcMessagePort = js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Double, autoRecreate: Boolean): RpcMessagePort = js.native
  def createRpcIpcMessageChannel(servicePath: String): RpcMessageChannel = js.native
  def createRpcIpcMessageChannel(servicePath: String, memoryLimit: Double): RpcMessageChannel = js.native
  def createRpcIpcMessagePort(process: ProcessLike): RpcMessagePort = js.native
}

