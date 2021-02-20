package typings.firebasePerformance

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebasePerformanceTypes.mod.FirebasePerformance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object perfMod {
  
  @JSImport("@firebase/performance/dist/src/controllers/perf", "PerformanceController")
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
