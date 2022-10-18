package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergesStats extends StObject {
  
  var current: long
  
  var current_docs: long
  
  var current_size: js.UndefOr[String] = js.undefined
  
  var current_size_in_bytes: long
  
  var total: long
  
  var total_auto_throttle: js.UndefOr[String] = js.undefined
  
  var total_auto_throttle_in_bytes: long
  
  var total_docs: long
  
  var total_size: js.UndefOr[String] = js.undefined
  
  var total_size_in_bytes: long
  
  var total_stopped_time: js.UndefOr[Duration] = js.undefined
  
  var total_stopped_time_in_millis: DurationValue[UnitMillis]
  
  var total_throttled_time: js.UndefOr[Duration] = js.undefined
  
  var total_throttled_time_in_millis: DurationValue[UnitMillis]
  
  var total_time: js.UndefOr[Duration] = js.undefined
  
  var total_time_in_millis: DurationValue[UnitMillis]
}
object MergesStats {
  
  inline def apply(
    current: long,
    current_docs: long,
    current_size_in_bytes: long,
    total: long,
    total_auto_throttle_in_bytes: long,
    total_docs: long,
    total_size_in_bytes: long,
    total_stopped_time_in_millis: DurationValue[UnitMillis],
    total_throttled_time_in_millis: DurationValue[UnitMillis],
    total_time_in_millis: DurationValue[UnitMillis]
  ): MergesStats = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], current_docs = current_docs.asInstanceOf[js.Any], current_size_in_bytes = current_size_in_bytes.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], total_auto_throttle_in_bytes = total_auto_throttle_in_bytes.asInstanceOf[js.Any], total_docs = total_docs.asInstanceOf[js.Any], total_size_in_bytes = total_size_in_bytes.asInstanceOf[js.Any], total_stopped_time_in_millis = total_stopped_time_in_millis.asInstanceOf[js.Any], total_throttled_time_in_millis = total_throttled_time_in_millis.asInstanceOf[js.Any], total_time_in_millis = total_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergesStats]
  }
  
  extension [Self <: MergesStats](x: Self) {
    
    inline def setCurrent(value: long): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrent_docs(value: long): Self = StObject.set(x, "current_docs", value.asInstanceOf[js.Any])
    
    inline def setCurrent_size(value: String): Self = StObject.set(x, "current_size", value.asInstanceOf[js.Any])
    
    inline def setCurrent_sizeUndefined: Self = StObject.set(x, "current_size", js.undefined)
    
    inline def setCurrent_size_in_bytes(value: long): Self = StObject.set(x, "current_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotal_auto_throttle(value: String): Self = StObject.set(x, "total_auto_throttle", value.asInstanceOf[js.Any])
    
    inline def setTotal_auto_throttleUndefined: Self = StObject.set(x, "total_auto_throttle", js.undefined)
    
    inline def setTotal_auto_throttle_in_bytes(value: long): Self = StObject.set(x, "total_auto_throttle_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_docs(value: long): Self = StObject.set(x, "total_docs", value.asInstanceOf[js.Any])
    
    inline def setTotal_size(value: String): Self = StObject.set(x, "total_size", value.asInstanceOf[js.Any])
    
    inline def setTotal_sizeUndefined: Self = StObject.set(x, "total_size", js.undefined)
    
    inline def setTotal_size_in_bytes(value: long): Self = StObject.set(x, "total_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_stopped_time(value: Duration): Self = StObject.set(x, "total_stopped_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_stopped_timeUndefined: Self = StObject.set(x, "total_stopped_time", js.undefined)
    
    inline def setTotal_stopped_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_stopped_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal_throttled_time(value: Duration): Self = StObject.set(x, "total_throttled_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_throttled_timeUndefined: Self = StObject.set(x, "total_throttled_time", js.undefined)
    
    inline def setTotal_throttled_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_throttled_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal_time(value: Duration): Self = StObject.set(x, "total_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_timeUndefined: Self = StObject.set(x, "total_time", js.undefined)
    
    inline def setTotal_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_time_in_millis", value.asInstanceOf[js.Any])
  }
}
