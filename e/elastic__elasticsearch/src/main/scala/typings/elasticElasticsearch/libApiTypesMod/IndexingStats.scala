package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexingStats extends StObject {
  
  var delete_current: long
  
  var delete_time: js.UndefOr[Duration] = js.undefined
  
  var delete_time_in_millis: DurationValue[UnitMillis]
  
  var delete_total: long
  
  var index_current: long
  
  var index_failed: long
  
  var index_time: js.UndefOr[Duration] = js.undefined
  
  var index_time_in_millis: DurationValue[UnitMillis]
  
  var index_total: long
  
  var is_throttled: Boolean
  
  var noop_update_total: long
  
  var throttle_time: js.UndefOr[Duration] = js.undefined
  
  var throttle_time_in_millis: DurationValue[UnitMillis]
  
  var types: js.UndefOr[Record[String, IndexingStats]] = js.undefined
}
object IndexingStats {
  
  inline def apply(
    delete_current: long,
    delete_time_in_millis: DurationValue[UnitMillis],
    delete_total: long,
    index_current: long,
    index_failed: long,
    index_time_in_millis: DurationValue[UnitMillis],
    index_total: long,
    is_throttled: Boolean,
    noop_update_total: long,
    throttle_time_in_millis: DurationValue[UnitMillis]
  ): IndexingStats = {
    val __obj = js.Dynamic.literal(delete_current = delete_current.asInstanceOf[js.Any], delete_time_in_millis = delete_time_in_millis.asInstanceOf[js.Any], delete_total = delete_total.asInstanceOf[js.Any], index_current = index_current.asInstanceOf[js.Any], index_failed = index_failed.asInstanceOf[js.Any], index_time_in_millis = index_time_in_millis.asInstanceOf[js.Any], index_total = index_total.asInstanceOf[js.Any], is_throttled = is_throttled.asInstanceOf[js.Any], noop_update_total = noop_update_total.asInstanceOf[js.Any], throttle_time_in_millis = throttle_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexingStats]
  }
  
  extension [Self <: IndexingStats](x: Self) {
    
    inline def setDelete_current(value: long): Self = StObject.set(x, "delete_current", value.asInstanceOf[js.Any])
    
    inline def setDelete_time(value: Duration): Self = StObject.set(x, "delete_time", value.asInstanceOf[js.Any])
    
    inline def setDelete_timeUndefined: Self = StObject.set(x, "delete_time", js.undefined)
    
    inline def setDelete_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "delete_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setDelete_total(value: long): Self = StObject.set(x, "delete_total", value.asInstanceOf[js.Any])
    
    inline def setIndex_current(value: long): Self = StObject.set(x, "index_current", value.asInstanceOf[js.Any])
    
    inline def setIndex_failed(value: long): Self = StObject.set(x, "index_failed", value.asInstanceOf[js.Any])
    
    inline def setIndex_time(value: Duration): Self = StObject.set(x, "index_time", value.asInstanceOf[js.Any])
    
    inline def setIndex_timeUndefined: Self = StObject.set(x, "index_time", js.undefined)
    
    inline def setIndex_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "index_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setIndex_total(value: long): Self = StObject.set(x, "index_total", value.asInstanceOf[js.Any])
    
    inline def setIs_throttled(value: Boolean): Self = StObject.set(x, "is_throttled", value.asInstanceOf[js.Any])
    
    inline def setNoop_update_total(value: long): Self = StObject.set(x, "noop_update_total", value.asInstanceOf[js.Any])
    
    inline def setThrottle_time(value: Duration): Self = StObject.set(x, "throttle_time", value.asInstanceOf[js.Any])
    
    inline def setThrottle_timeUndefined: Self = StObject.set(x, "throttle_time", js.undefined)
    
    inline def setThrottle_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "throttle_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: Record[String, IndexingStats]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
  }
}
