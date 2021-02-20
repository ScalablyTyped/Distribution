package typings.firebasePerformance

import typings.firebasePerformance.networkRequestMod.NetworkRequest
import typings.firebasePerformance.traceMod.Trace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object perfLoggerMod {
  
  @JSImport("@firebase/performance/dist/src/services/perf_logger", "logNetworkRequest")
  @js.native
  def logNetworkRequest(networkRequest: NetworkRequest): Unit = js.native
  
  @JSImport("@firebase/performance/dist/src/services/perf_logger", "logTrace")
  @js.native
  def logTrace(trace: Trace): Unit = js.native
}
