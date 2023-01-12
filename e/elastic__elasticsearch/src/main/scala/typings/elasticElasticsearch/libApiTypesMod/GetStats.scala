package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStats extends StObject {
  
  var current: long
  
  var exists_time: js.UndefOr[Duration] = js.undefined
  
  var exists_time_in_millis: DurationValue[UnitMillis]
  
  var exists_total: long
  
  var missing_time: js.UndefOr[Duration] = js.undefined
  
  var missing_time_in_millis: DurationValue[UnitMillis]
  
  var missing_total: long
  
  var time: js.UndefOr[Duration] = js.undefined
  
  var time_in_millis: DurationValue[UnitMillis]
  
  var total: long
}
object GetStats {
  
  inline def apply(
    current: long,
    exists_time_in_millis: DurationValue[UnitMillis],
    exists_total: long,
    missing_time_in_millis: DurationValue[UnitMillis],
    missing_total: long,
    time_in_millis: DurationValue[UnitMillis],
    total: long
  ): GetStats = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], exists_time_in_millis = exists_time_in_millis.asInstanceOf[js.Any], exists_total = exists_total.asInstanceOf[js.Any], missing_time_in_millis = missing_time_in_millis.asInstanceOf[js.Any], missing_total = missing_total.asInstanceOf[js.Any], time_in_millis = time_in_millis.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStats] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: long): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setExists_time(value: Duration): Self = StObject.set(x, "exists_time", value.asInstanceOf[js.Any])
    
    inline def setExists_timeUndefined: Self = StObject.set(x, "exists_time", js.undefined)
    
    inline def setExists_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "exists_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setExists_total(value: long): Self = StObject.set(x, "exists_total", value.asInstanceOf[js.Any])
    
    inline def setMissing_time(value: Duration): Self = StObject.set(x, "missing_time", value.asInstanceOf[js.Any])
    
    inline def setMissing_timeUndefined: Self = StObject.set(x, "missing_time", js.undefined)
    
    inline def setMissing_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "missing_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setMissing_total(value: long): Self = StObject.set(x, "missing_total", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Duration): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTime_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
