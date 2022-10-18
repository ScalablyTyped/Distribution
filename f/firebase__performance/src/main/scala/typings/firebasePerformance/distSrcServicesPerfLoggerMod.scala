package typings.firebasePerformance

import typings.firebasePerformance.distSrcResourcesNetworkRequestMod.NetworkRequest
import typings.firebasePerformance.distSrcResourcesTraceMod.Trace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcServicesPerfLoggerMod {
  
  @JSImport("@firebase/performance/dist/src/services/perf_logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logNetworkRequest(networkRequest: NetworkRequest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logNetworkRequest")(networkRequest.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logTrace(trace: Trace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logTrace")(trace.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
