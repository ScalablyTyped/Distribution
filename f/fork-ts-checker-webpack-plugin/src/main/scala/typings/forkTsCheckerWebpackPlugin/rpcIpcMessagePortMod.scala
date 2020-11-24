package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.processLikeMod.ProcessLike
import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc/RpcIpcMessagePort", JSImport.Namespace)
@js.native
object rpcIpcMessagePortMod extends js.Object {
  
  def createRpcIpcForkedProcessMessagePort(filePath: String): RpcMessagePort = js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: js.UndefOr[scala.Nothing], autoRecreate: Boolean): RpcMessagePort = js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Double): RpcMessagePort = js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Double, autoRecreate: Boolean): RpcMessagePort = js.native
  
  def createRpcIpcMessagePort(process: ProcessLike): RpcMessagePort = js.native
}
