package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libRpcRpcWorkerMod.RpcWorker
import typings.forkTsCheckerWebpackPlugin.libRpcTypesMod.RpcMethod
import typings.forkTsCheckerWebpackPlugin.libRpcTypesMod.RpcRemoteMethod
import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRpcMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc", "RpcExitError")
  @js.native
  open class RpcExitError protected ()
    extends typings.forkTsCheckerWebpackPlugin.libRpcRpcErrorMod.RpcExitError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: String, code: Double) = this()
    def this(message: String, code: String, signal: String) = this()
    def this(message: String, code: Double, signal: String) = this()
    def this(message: String, code: Null, signal: String) = this()
    def this(message: String, code: Unit, signal: String) = this()
  }
  
  inline def createRpcWorker[T /* <: RpcMethod */](modulePath: String, data: Any): RpcWorker[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcWorker")(modulePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[RpcWorker[T]]
  inline def createRpcWorker[T /* <: RpcMethod */](modulePath: String, data: Any, memoryLimit: Double): RpcWorker[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcWorker")(modulePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], memoryLimit.asInstanceOf[js.Any])).asInstanceOf[RpcWorker[T]]
  
  inline def exposeRpc(fn: js.Function1[/* repeated */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exposeRpc")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getRpcWorkerData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRpcWorkerData")().asInstanceOf[Any]
  
  inline def wrapRpc[T /* <: js.Function1[/* repeated */ Any, Any] */](childProcess: ChildProcess): RpcRemoteMethod[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRpc")(childProcess.asInstanceOf[js.Any]).asInstanceOf[RpcRemoteMethod[T]]
}
