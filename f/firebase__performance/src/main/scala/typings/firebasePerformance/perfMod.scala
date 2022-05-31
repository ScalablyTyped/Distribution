package typings.firebasePerformance

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebasePerformanceTypes.mod.FirebasePerformance
import typings.firebasePerformanceTypes.mod.PerformanceTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object perfMod {
  
  @JSImport("@firebase/performance/dist/src/controllers/perf", "PerformanceController")
  @js.native
  class PerformanceController protected ()
    extends StObject
       with FirebasePerformance {
    def this(app: FirebaseApp) = this()
    
    val app: FirebaseApp = js.native
    
    /**
      * Controls the logging of custom traces.
      */
    /* CompleteClass */
    var dataCollectionEnabled: Boolean = js.native
    @JSName("dataCollectionEnabled")
    def dataCollectionEnabled_MPerformanceController: Boolean = js.native
    
    /**
      * Controls the logging of automatic traces and HTTP/S network monitoring.
      */
    /* CompleteClass */
    var instrumentationEnabled: Boolean = js.native
    @JSName("instrumentationEnabled")
    def instrumentationEnabled_MPerformanceController: Boolean = js.native
    
    /**
      * Creates an uninitialized instance of trace and returns it.
      *
      * @param traceName The name of trace instance.
      * @return The trace instance.
      */
    /* CompleteClass */
    override def trace(traceName: String): PerformanceTrace = js.native
  }
}
