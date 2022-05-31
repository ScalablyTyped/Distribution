package typings.firebasePerformance

import org.scalablytyped.runtime.StringDictionary
import typings.firebasePerformance.anon.Attributes
import typings.firebasePerformanceTypes.mod.PerformanceTrace
import typings.std.PerformanceEntry
import typings.std.PerformanceNavigationTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceMod {
  
  @JSImport("@firebase/performance/dist/src/resources/trace", "Trace")
  @js.native
  class Trace protected ()
    extends StObject
       with PerformanceTrace {
    /**
      * @param name The name of the trace.
      * @param isAuto If the trace is auto-instrumented.
      * @param traceMeasureName The name of the measure marker in user timing specification. This field
      * is only set when the trace is built for logging when the user directly uses the user timing
      * api (performance.mark and performance.measure).
      */
    def this(name: String) = this()
    def this(name: String, isAuto: Boolean) = this()
    def this(name: String, isAuto: Boolean, traceMeasureName: String) = this()
    def this(name: String, isAuto: Unit, traceMeasureName: String) = this()
    
    /* private */ var api: js.Any = js.native
    
    /**
      * Calculates and assigns the duration and start time of the trace using the measure performance
      * entry.
      */
    /* private */ var calculateTraceMetrics: js.Any = js.native
    
    var counters: StringDictionary[Double] = js.native
    
    /* private */ var customAttributes: js.Any = js.native
    
    var durationUs: Double = js.native
    
    val isAuto: Boolean = js.native
    
    val name: String = js.native
    
    /* private */ var randomId: js.Any = js.native
    
    def record(startTime: Double, duration: Double, options: Attributes): Unit = js.native
    
    /* private */ var setDuration: js.Any = js.native
    
    /* private */ var setStartTime: js.Any = js.native
    
    var startTimeUs: Double = js.native
    
    /* private */ var state: js.Any = js.native
    
    /* private */ var traceMeasure: js.Any = js.native
    
    /* private */ var traceStartMark: js.Any = js.native
    
    /* private */ var traceStopMark: js.Any = js.native
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
    inline def createOobTrace(navigationTimings: js.Array[PerformanceNavigationTiming], paintTimings: js.Array[PerformanceEntry]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createOobTrace")(navigationTimings.asInstanceOf[js.Any], paintTimings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createOobTrace(
      navigationTimings: js.Array[PerformanceNavigationTiming],
      paintTimings: js.Array[PerformanceEntry],
      firstInputDelay: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createOobTrace")(navigationTimings.asInstanceOf[js.Any], paintTimings.asInstanceOf[js.Any], firstInputDelay.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def createUserTimingTrace(measureName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserTimingTrace")(measureName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
