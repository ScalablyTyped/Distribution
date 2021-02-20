package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.processLikeMod.ProcessLike
import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcIpcMessagePortMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc/RpcIpcMessagePort", "createRpcIpcForkedProcessMessagePort")
  @js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String): RpcMessagePort = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc/RpcIpcMessagePort", "createRpcIpcForkedProcessMessagePort")
  @js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: js.UndefOr[scala.Nothing], autoRecreate: Boolean): RpcMessagePort = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc/RpcIpcMessagePort", "createRpcIpcForkedProcessMessagePort")
  @js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Double): RpcMessagePort = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc/RpcIpcMessagePort", "createRpcIpcForkedProcessMessagePort")
  @js.native
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Double, autoRecreate: Boolean): RpcMessagePort = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc/RpcIpcMessagePort", "createRpcIpcMessagePort")
  @js.native
  def createRpcIpcMessagePort(process: ProcessLike): RpcMessagePort = js.native
}
