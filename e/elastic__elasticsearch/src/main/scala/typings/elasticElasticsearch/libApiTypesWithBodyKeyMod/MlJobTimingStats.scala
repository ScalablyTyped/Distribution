package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlJobTimingStats extends StObject {
  
  var average_bucket_processing_time_ms: js.UndefOr[DurationValue[UnitFloatMillis]] = js.undefined
  
  var bucket_count: long
  
  var exponential_average_bucket_processing_time_ms: js.UndefOr[DurationValue[UnitFloatMillis]] = js.undefined
  
  var exponential_average_bucket_processing_time_per_hour_ms: DurationValue[UnitFloatMillis]
  
  var job_id: Id
  
  var maximum_bucket_processing_time_ms: js.UndefOr[DurationValue[UnitFloatMillis]] = js.undefined
  
  var minimum_bucket_processing_time_ms: js.UndefOr[DurationValue[UnitFloatMillis]] = js.undefined
  
  var total_bucket_processing_time_ms: DurationValue[UnitFloatMillis]
}
object MlJobTimingStats {
  
  inline def apply(
    bucket_count: long,
    exponential_average_bucket_processing_time_per_hour_ms: DurationValue[UnitFloatMillis],
    job_id: Id,
    total_bucket_processing_time_ms: DurationValue[UnitFloatMillis]
  ): MlJobTimingStats = {
    val __obj = js.Dynamic.literal(bucket_count = bucket_count.asInstanceOf[js.Any], exponential_average_bucket_processing_time_per_hour_ms = exponential_average_bucket_processing_time_per_hour_ms.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], total_bucket_processing_time_ms = total_bucket_processing_time_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlJobTimingStats]
  }
  
  extension [Self <: MlJobTimingStats](x: Self) {
    
    inline def setAverage_bucket_processing_time_ms(value: DurationValue[UnitFloatMillis]): Self = StObject.set(x, "average_bucket_processing_time_ms", value.asInstanceOf[js.Any])
    
    inline def setAverage_bucket_processing_time_msUndefined: Self = StObject.set(x, "average_bucket_processing_time_ms", js.undefined)
    
    inline def setBucket_count(value: long): Self = StObject.set(x, "bucket_count", value.asInstanceOf[js.Any])
    
    inline def setExponential_average_bucket_processing_time_ms(value: DurationValue[UnitFloatMillis]): Self = StObject.set(x, "exponential_average_bucket_processing_time_ms", value.asInstanceOf[js.Any])
    
    inline def setExponential_average_bucket_processing_time_msUndefined: Self = StObject.set(x, "exponential_average_bucket_processing_time_ms", js.undefined)
    
    inline def setExponential_average_bucket_processing_time_per_hour_ms(value: DurationValue[UnitFloatMillis]): Self = StObject.set(x, "exponential_average_bucket_processing_time_per_hour_ms", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setMaximum_bucket_processing_time_ms(value: DurationValue[UnitFloatMillis]): Self = StObject.set(x, "maximum_bucket_processing_time_ms", value.asInstanceOf[js.Any])
    
    inline def setMaximum_bucket_processing_time_msUndefined: Self = StObject.set(x, "maximum_bucket_processing_time_ms", js.undefined)
    
    inline def setMinimum_bucket_processing_time_ms(value: DurationValue[UnitFloatMillis]): Self = StObject.set(x, "minimum_bucket_processing_time_ms", value.asInstanceOf[js.Any])
    
    inline def setMinimum_bucket_processing_time_msUndefined: Self = StObject.set(x, "minimum_bucket_processing_time_ms", js.undefined)
    
    inline def setTotal_bucket_processing_time_ms(value: DurationValue[UnitFloatMillis]): Self = StObject.set(x, "total_bucket_processing_time_ms", value.asInstanceOf[js.Any])
  }
}
