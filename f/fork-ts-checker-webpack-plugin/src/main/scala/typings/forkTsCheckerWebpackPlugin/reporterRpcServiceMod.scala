package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterRpcServiceMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcService", "registerReporterRpcService")
  @js.native
  def registerReporterRpcService[TConfiguration /* <: js.Object */](
    servicePort: RpcMessagePort,
    reporterFactory: js.Function1[/* configuration */ TConfiguration, Reporter]
  ): ReporterRpcService = js.native
  
  @js.native
  trait ReporterRpcService extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    
    def isOpen(): Boolean = js.native
    
    def open(): js.Promise[Unit] = js.native
  }
  object ReporterRpcService {
    
    @scala.inline
    def apply(close: () => js.Promise[Unit], isOpen: () => Boolean, open: () => js.Promise[Unit]): ReporterRpcService = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isOpen = js.Any.fromFunction0(isOpen), open = js.Any.fromFunction0(open))
      __obj.asInstanceOf[ReporterRpcService]
    }
    
    @scala.inline
    implicit class ReporterRpcServiceMutableBuilder[Self <: ReporterRpcService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: () => js.Promise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    }
  }
}
