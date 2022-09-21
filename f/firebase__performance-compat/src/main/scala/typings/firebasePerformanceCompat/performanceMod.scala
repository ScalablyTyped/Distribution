package typings.firebasePerformanceCompat

import typings.firebaseAppCompat.mod.FirebaseService
import typings.firebasePerformanceCompat.mod.FirebaseApp
import typings.firebasePerformanceTypes.mod.FirebasePerformance
import typings.firebasePerformanceTypes.mod.PerformanceTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object performanceMod {
  
  @JSImport("@firebase/performance-compat/dist/src/performance", "PerformanceCompatImpl")
  @js.native
  open class PerformanceCompatImpl protected ()
    extends StObject
       with FirebasePerformance
       with FirebaseService {
    def this(app: FirebaseApp, _delegate: typings.firebasePerformance.publicTypesMod.FirebasePerformance) = this()
    
    /* CompleteClass */
    var _delegate: Any = js.native
    @JSName("_delegate")
    val _delegate_PerformanceCompatImpl: typings.firebasePerformance.publicTypesMod.FirebasePerformance = js.native
    
    /* CompleteClass */
    var app: typings.firebaseAppCompat.mod.FirebaseApp = js.native
    @JSName("app")
    var app_PerformanceCompatImpl: FirebaseApp = js.native
    
    /**
      * Controls the logging of custom traces.
      */
    /* CompleteClass */
    var dataCollectionEnabled: Boolean = js.native
    @JSName("dataCollectionEnabled")
    def dataCollectionEnabled_MPerformanceCompatImpl: Boolean = js.native
    
    /**
      * Controls the logging of automatic traces and HTTP/S network monitoring.
      */
    /* CompleteClass */
    var instrumentationEnabled: Boolean = js.native
    @JSName("instrumentationEnabled")
    def instrumentationEnabled_MPerformanceCompatImpl: Boolean = js.native
    
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
