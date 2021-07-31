package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.processLikeMod.ProcessLike
import typings.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcIpcMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createRpcIpcForkedProcessMessagePort(filePath: String): RpcMessagePort = ^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcForkedProcessMessagePort")(filePath.asInstanceOf[js.Any]).asInstanceOf[RpcMessagePort]
  @scala.inline
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Double): RpcMessagePort = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcForkedProcessMessagePort")(filePath.asInstanceOf[js.Any], memoryLimit.asInstanceOf[js.Any])).asInstanceOf[RpcMessagePort]
  @scala.inline
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Double, autoRecreate: Boolean): RpcMessagePort = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcForkedProcessMessagePort")(filePath.asInstanceOf[js.Any], memoryLimit.asInstanceOf[js.Any], autoRecreate.asInstanceOf[js.Any])).asInstanceOf[RpcMessagePort]
  @scala.inline
  def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Unit, autoRecreate: Boolean): RpcMessagePort = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcForkedProcessMessagePort")(filePath.asInstanceOf[js.Any], memoryLimit.asInstanceOf[js.Any], autoRecreate.asInstanceOf[js.Any])).asInstanceOf[RpcMessagePort]
  
  @scala.inline
  def createRpcIpcMessageChannel(servicePath: String): RpcMessageChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcMessageChannel")(servicePath.asInstanceOf[js.Any]).asInstanceOf[RpcMessageChannel]
  @scala.inline
  def createRpcIpcMessageChannel(servicePath: String, memoryLimit: Double): RpcMessageChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcMessageChannel")(servicePath.asInstanceOf[js.Any], memoryLimit.asInstanceOf[js.Any])).asInstanceOf[RpcMessageChannel]
  
  @scala.inline
  def createRpcIpcMessagePort(process: ProcessLike): RpcMessagePort = ^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcMessagePort")(process.asInstanceOf[js.Any]).asInstanceOf[RpcMessagePort]
}
