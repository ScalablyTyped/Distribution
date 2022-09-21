package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSamplingRequest extends StObject {
  
  /**
    * By default, the sampling heap profiler reports only objects which are
    * still alive when the profile is returned via getSamplingProfile or
    * stopSampling, which is useful for determining what functions contribute
    * the most to steady-state memory usage. This flag instructs the sampling
    * heap profiler to also include information about objects discarded by
    * major GC, which will show which functions cause large temporary memory
    * usage or long GC pauses.
    */
  var includeObjectsCollectedByMajorGC: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, the sampling heap profiler reports only objects which are
    * still alive when the profile is returned via getSamplingProfile or
    * stopSampling, which is useful for determining what functions contribute
    * the most to steady-state memory usage. This flag instructs the sampling
    * heap profiler to also include information about objects discarded by
    * minor GC, which is useful when tuning a latency-sensitive application
    * for minimal GC activity.
    */
  var includeObjectsCollectedByMinorGC: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Average sample interval in bytes. Poisson distribution is used for the intervals. The
    * default value is 32768 bytes.
    */
  var samplingInterval: js.UndefOr[Double] = js.undefined
}
object StartSamplingRequest {
  
  inline def apply(): StartSamplingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSamplingRequest]
  }
  
  extension [Self <: StartSamplingRequest](x: Self) {
    
    inline def setIncludeObjectsCollectedByMajorGC(value: Boolean): Self = StObject.set(x, "includeObjectsCollectedByMajorGC", value.asInstanceOf[js.Any])
    
    inline def setIncludeObjectsCollectedByMajorGCUndefined: Self = StObject.set(x, "includeObjectsCollectedByMajorGC", js.undefined)
    
    inline def setIncludeObjectsCollectedByMinorGC(value: Boolean): Self = StObject.set(x, "includeObjectsCollectedByMinorGC", value.asInstanceOf[js.Any])
    
    inline def setIncludeObjectsCollectedByMinorGCUndefined: Self = StObject.set(x, "includeObjectsCollectedByMinorGC", js.undefined)
    
    inline def setSamplingInterval(value: Double): Self = StObject.set(x, "samplingInterval", value.asInstanceOf[js.Any])
    
    inline def setSamplingIntervalUndefined: Self = StObject.set(x, "samplingInterval", js.undefined)
  }
}
