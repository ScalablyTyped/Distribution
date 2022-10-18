package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDatafeedTimingStats extends StObject {
  
  var average_search_time_per_bucket_ms: js.UndefOr[DurationValue[UnitFloatMillis]] = js.undefined
  
  var bucket_count: long
  
  var exponential_average_search_time_per_hour_ms: DurationValue[UnitFloatMillis]
  
  var job_id: Id
  
  var search_count: long
  
  var total_search_time_ms: DurationValue[UnitFloatMillis]
}
object MlDatafeedTimingStats {
  
  inline def apply(
    bucket_count: long,
    exponential_average_search_time_per_hour_ms: DurationValue[UnitFloatMillis],
    job_id: Id,
    search_count: long,
    total_search_time_ms: DurationValue[UnitFloatMillis]
  ): MlDatafeedTimingStats = {
    val __obj = js.Dynamic.literal(bucket_count = bucket_count.asInstanceOf[js.Any], exponential_average_search_time_per_hour_ms = exponential_average_search_time_per_hour_ms.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], search_count = search_count.asInstanceOf[js.Any], total_search_time_ms = total_search_time_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDatafeedTimingStats]
  }
  
  extension [Self <: MlDatafeedTimingStats](x: Self) {
    
    inline def setAverage_search_time_per_bucket_ms(value: DurationValue[UnitFloatMillis]): Self = StObject.set(x, "average_search_time_per_bucket_ms", value.asInstanceOf[js.Any])
    
    inline def setAverage_search_time_per_bucket_msUndefined: Self = StObject.set(x, "average_search_time_per_bucket_ms", js.undefined)
    
    inline def setBucket_count(value: long): Self = StObject.set(x, "bucket_count", value.asInstanceOf[js.Any])
    
    inline def setExponential_average_search_time_per_hour_ms(value: DurationValue[UnitFloatMillis]): Self = StObject.set(x, "exponential_average_search_time_per_hour_ms", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setSearch_count(value: long): Self = StObject.set(x, "search_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_search_time_ms(value: DurationValue[UnitFloatMillis]): Self = StObject.set(x, "total_search_time_ms", value.asInstanceOf[js.Any])
  }
}
