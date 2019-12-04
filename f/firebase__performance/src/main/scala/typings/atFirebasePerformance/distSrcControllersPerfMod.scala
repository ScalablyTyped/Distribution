package typings.atFirebasePerformance

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebasePerformanceDashTypes.atFirebasePerformanceDashTypesMod.FirebasePerformance
import typings.atFirebasePerformanceDashTypes.atFirebasePerformanceDashTypesMod.PerformanceTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/performance/dist/src/controllers/perf", JSImport.Namespace)
@js.native
object distSrcControllersPerfMod extends js.Object {
  @js.native
  class PerformanceController protected () extends FirebasePerformance {
    def this(app: FirebaseApp) = this()
    val app: FirebaseApp = js.native
    /**
      * Controls the logging of custom traces.
      */
    /* CompleteClass */
    override var dataCollectionEnabled: Boolean = js.native
    /**
      * Controls the logging of automatic traces and HTTP/S network monitoring.
      */
    /* CompleteClass */
    override var instrumentationEnabled: Boolean = js.native
    @JSName("dataCollectionEnabled")
    def dataCollectionEnabled_MPerformanceController(): Boolean = js.native
    @JSName("dataCollectionEnabled")
    def dataCollectionEnabled_MPerformanceController(`val`: Boolean): js.Any = js.native
    @JSName("instrumentationEnabled")
    def instrumentationEnabled_MPerformanceController(): Boolean = js.native
    @JSName("instrumentationEnabled")
    def instrumentationEnabled_MPerformanceController(`val`: Boolean): js.Any = js.native
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

