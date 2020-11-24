package typings.firebasePerformance

import typings.firebasePerformance.networkRequestMod.NetworkRequest
import typings.firebasePerformance.traceMod.Trace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/performance/dist/src/services/perf_logger", JSImport.Namespace)
@js.native
object perfLoggerMod extends js.Object {
  
  def logNetworkRequest(networkRequest: NetworkRequest): Unit = js.native
  
  def logTrace(trace: Trace): Unit = js.native
}
