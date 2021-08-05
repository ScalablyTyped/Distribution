package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcIpcMessageChannelMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc/RpcIpcMessageChannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRpcIpcMessageChannel(servicePath: String): RpcMessageChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcMessageChannel")(servicePath.asInstanceOf[js.Any]).asInstanceOf[RpcMessageChannel]
  inline def createRpcIpcMessageChannel(servicePath: String, memoryLimit: Double): RpcMessageChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcMessageChannel")(servicePath.asInstanceOf[js.Any], memoryLimit.asInstanceOf[js.Any])).asInstanceOf[RpcMessageChannel]
}
