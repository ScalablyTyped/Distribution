package typings.firebasePerformance

import org.scalablytyped.runtime.StringDictionary
import typings.firebasePerformance.perfMod.PerformanceController
import typings.firebasePerformance.publicTypesMod.PerformanceTrace
import typings.std.PerformanceEntry
import typings.std.PerformanceNavigationTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceMod {
  
  @JSImport("@firebase/performance/dist/src/resources/trace", "Trace")
  @js.native
  open class Trace protected ()
    extends StObject
       with PerformanceTrace {
    /**
      * @param performanceController The performance controller running.
      * @param name The name of the trace.
      * @param isAuto If the trace is auto-instrumented.
      * @param traceMeasureName The name of the measure marker in user timing specification. This field
      * is only set when the trace is built for logging when the user directly uses the user timing
      * api (performance.mark and performance.measure).
      */
    def this(performanceController: PerformanceController, name: String) = this()
    def this(performanceController: PerformanceController, name: String, isAuto: Boolean) = this()
    def this(
      performanceController: PerformanceController,
      name: String,
      isAuto: Boolean,
      traceMeasureName: String
    ) = this()
    def this(performanceController: PerformanceController, name: String, isAuto: Unit, traceMeasureName: String) = this()
    
    /* private */ var api: Any = js.native
    
    /**
      * Calculates and assigns the duration and start time of the trace using the measure performance
      * entry.
      */
    /* private */ var calculateTraceMetrics: Any = js.native
    
    var counters: StringDictionary[Double] = js.native
    
    /* private */ var customAttributes: Any = js.native
    
    var durationUs: Double = js.native
    
    val isAuto: Boolean = js.native
    
    val name: String = js.native
    
    val performanceController: PerformanceController = js.native
    
    /* private */ var randomId: Any = js.native
    
    /* private */ var setDuration: Any = js.native
    
    /* private */ var setStartTime: Any = js.native
    
    var startTimeUs: Double = js.native
    
    /* private */ var state: Any = js.native
    
    /* private */ var traceMeasure: Any = js.native
    
    /* private */ var traceStartMark: Any = js.native
    
    /* private */ var traceStopMark: Any = js.native
  }
  /* static members */
  object Trace {
    
    @JSImport("@firebase/performance/dist/src/resources/trace", "Trace")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param navigationTimings A single element array which contains the navigationTIming object of
      * the page load
      * @param paintTimings A array which contains paintTiming object of the page load
      * @param firstInputDelay First input delay in millisec
      */
    inline def createOobTrace(
      performanceController: PerformanceController,
      navigationTimings: js.Array[PerformanceNavigationTiming],
      paintTimings: js.Array[PerformanceEntry]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createOobTrace")(performanceController.asInstanceOf[js.Any], navigationTimings.asInstanceOf[js.Any], paintTimings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createOobTrace(
      performanceController: PerformanceController,
      navigationTimings: js.Array[PerformanceNavigationTiming],
      paintTimings: js.Array[PerformanceEntry],
      firstInputDelay: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createOobTrace")(performanceController.asInstanceOf[js.Any], navigationTimings.asInstanceOf[js.Any], paintTimings.asInstanceOf[js.Any], firstInputDelay.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def createUserTimingTrace(performanceController: PerformanceController, measureName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createUserTimingTrace")(performanceController.asInstanceOf[js.Any], measureName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
