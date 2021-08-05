package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import typings.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterRpcServiceMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerReporterRpcService[TConfiguration /* <: js.Object */](
    servicePort: RpcMessagePort,
    reporterFactory: js.Function1[/* configuration */ TConfiguration, Reporter]
  ): ReporterRpcService = (^.asInstanceOf[js.Dynamic].applyDynamic("registerReporterRpcService")(servicePort.asInstanceOf[js.Any], reporterFactory.asInstanceOf[js.Any])).asInstanceOf[ReporterRpcService]
  
  trait ReporterRpcService extends StObject {
    
    def close(): js.Promise[Unit]
    
    def isOpen(): Boolean
    
    def open(): js.Promise[Unit]
  }
  object ReporterRpcService {
    
    inline def apply(close: () => js.Promise[Unit], isOpen: () => Boolean, open: () => js.Promise[Unit]): ReporterRpcService = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isOpen = js.Any.fromFunction0(isOpen), open = js.Any.fromFunction0(open))
      __obj.asInstanceOf[ReporterRpcService]
    }
    
    extension [Self <: ReporterRpcService](x: Self) {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
      
      inline def setOpen(value: () => js.Promise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    }
  }
}
