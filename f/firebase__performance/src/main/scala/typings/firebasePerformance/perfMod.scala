package typings.firebasePerformance

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebasePerformanceTypes.mod.FirebasePerformance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/performance/dist/src/controllers/perf", JSImport.Namespace)
@js.native
object perfMod extends js.Object {
  
  @js.native
  class PerformanceController protected () extends FirebasePerformance {
    def this(app: FirebaseApp) = this()
    
    val app: FirebaseApp = js.native
    
    @JSName("dataCollectionEnabled")
    def dataCollectionEnabled_MPerformanceController: Boolean = js.native
    
    @JSName("instrumentationEnabled")
    def instrumentationEnabled_MPerformanceController: Boolean = js.native
  }
}
