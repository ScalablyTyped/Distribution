package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.processLikeMod.ProcessLike
import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcIpcMessagePortMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc/RpcIpcMessagePort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRpcIpcForkedProcessMessagePort(filePath: String): RpcMessagePort = ^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcForkedProcessMessagePort")(filePath.asInstanceOf[js.Any]).asInstanceOf[RpcMessagePort]
  inline def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Double): RpcMessagePort = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcForkedProcessMessagePort")(filePath.asInstanceOf[js.Any], memoryLimit.asInstanceOf[js.Any])).asInstanceOf[RpcMessagePort]
  inline def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Double, autoRecreate: Boolean): RpcMessagePort = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcForkedProcessMessagePort")(filePath.asInstanceOf[js.Any], memoryLimit.asInstanceOf[js.Any], autoRecreate.asInstanceOf[js.Any])).asInstanceOf[RpcMessagePort]
  inline def createRpcIpcForkedProcessMessagePort(filePath: String, memoryLimit: Unit, autoRecreate: Boolean): RpcMessagePort = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcForkedProcessMessagePort")(filePath.asInstanceOf[js.Any], memoryLimit.asInstanceOf[js.Any], autoRecreate.asInstanceOf[js.Any])).asInstanceOf[RpcMessagePort]
  
  inline def createRpcIpcMessagePort(process: ProcessLike): RpcMessagePort = ^.asInstanceOf[js.Dynamic].applyDynamic("createRpcIpcMessagePort")(process.asInstanceOf[js.Any]).asInstanceOf[RpcMessagePort]
}
