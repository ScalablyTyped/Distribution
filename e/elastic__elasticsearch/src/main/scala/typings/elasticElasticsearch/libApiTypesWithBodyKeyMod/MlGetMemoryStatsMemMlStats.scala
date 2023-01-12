package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetMemoryStatsMemMlStats extends StObject {
  
  var anomaly_detectors: js.UndefOr[ByteSize] = js.undefined
  
  var anomaly_detectors_in_bytes: integer
  
  var data_frame_analytics: js.UndefOr[ByteSize] = js.undefined
  
  var data_frame_analytics_in_bytes: integer
  
  var max: js.UndefOr[ByteSize] = js.undefined
  
  var max_in_bytes: integer
  
  var native_code_overhead: js.UndefOr[ByteSize] = js.undefined
  
  var native_code_overhead_in_bytes: integer
  
  var native_inference: js.UndefOr[ByteSize] = js.undefined
  
  var native_inference_in_bytes: integer
}
object MlGetMemoryStatsMemMlStats {
  
  inline def apply(
    anomaly_detectors_in_bytes: integer,
    data_frame_analytics_in_bytes: integer,
    max_in_bytes: integer,
    native_code_overhead_in_bytes: integer,
    native_inference_in_bytes: integer
  ): MlGetMemoryStatsMemMlStats = {
    val __obj = js.Dynamic.literal(anomaly_detectors_in_bytes = anomaly_detectors_in_bytes.asInstanceOf[js.Any], data_frame_analytics_in_bytes = data_frame_analytics_in_bytes.asInstanceOf[js.Any], max_in_bytes = max_in_bytes.asInstanceOf[js.Any], native_code_overhead_in_bytes = native_code_overhead_in_bytes.asInstanceOf[js.Any], native_inference_in_bytes = native_inference_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetMemoryStatsMemMlStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetMemoryStatsMemMlStats] (val x: Self) extends AnyVal {
    
    inline def setAnomaly_detectors(value: ByteSize): Self = StObject.set(x, "anomaly_detectors", value.asInstanceOf[js.Any])
    
    inline def setAnomaly_detectorsUndefined: Self = StObject.set(x, "anomaly_detectors", js.undefined)
    
    inline def setAnomaly_detectors_in_bytes(value: integer): Self = StObject.set(x, "anomaly_detectors_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setData_frame_analytics(value: ByteSize): Self = StObject.set(x, "data_frame_analytics", value.asInstanceOf[js.Any])
    
    inline def setData_frame_analyticsUndefined: Self = StObject.set(x, "data_frame_analytics", js.undefined)
    
    inline def setData_frame_analytics_in_bytes(value: integer): Self = StObject.set(x, "data_frame_analytics_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setMax(value: ByteSize): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMax_in_bytes(value: integer): Self = StObject.set(x, "max_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setNative_code_overhead(value: ByteSize): Self = StObject.set(x, "native_code_overhead", value.asInstanceOf[js.Any])
    
    inline def setNative_code_overheadUndefined: Self = StObject.set(x, "native_code_overhead", js.undefined)
    
    inline def setNative_code_overhead_in_bytes(value: integer): Self = StObject.set(x, "native_code_overhead_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setNative_inference(value: ByteSize): Self = StObject.set(x, "native_inference", value.asInstanceOf[js.Any])
    
    inline def setNative_inferenceUndefined: Self = StObject.set(x, "native_inference", js.undefined)
    
    inline def setNative_inference_in_bytes(value: integer): Self = StObject.set(x, "native_inference_in_bytes", value.asInstanceOf[js.Any])
  }
}
