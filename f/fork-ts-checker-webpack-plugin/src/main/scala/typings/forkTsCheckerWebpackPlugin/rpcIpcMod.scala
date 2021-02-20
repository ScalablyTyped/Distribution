package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.processLikeMod.ProcessLike
import typings.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcIpcMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc", "createRpcIpcForkedProcessMessagePort")
  @js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String): RpcMessagePort = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc", "createRpcIpcForkedProcessMessagePort")
  @js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: js.UndefOr[scala.Nothing], autoRecreate: Boolean): RpcMessagePort = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc", "createRpcIpcForkedProcessMessagePort")
  @js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Double): RpcMessagePort = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc", "createRpcIpcForkedProcessMessagePort")
  @js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Double, autoRecreate: Boolean): RpcMessagePort = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc", "createRpcIpcMessageChannel")
  @js.native
  def createRpcIpcMessageChannel(servicePath: String): RpcMessageChannel = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc", "createRpcIpcMessageChannel")
  @js.native
  def createRpcIpcMessageChannel(servicePath: String, memoryLimit: Double): RpcMessageChannel = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc", "createRpcIpcMessagePort")
  @js.native
  def createRpcIpcMessagePort(process: ProcessLike): RpcMessagePort = js.native
}
