package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesCgroupCpuStat extends StObject {
  
  var number_of_elapsed_periods: js.UndefOr[long] = js.undefined
  
  var number_of_times_throttled: js.UndefOr[long] = js.undefined
  
  var time_throttled_nanos: js.UndefOr[DurationValue[UnitNanos]] = js.undefined
}
object NodesCgroupCpuStat {
  
  inline def apply(): NodesCgroupCpuStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesCgroupCpuStat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesCgroupCpuStat] (val x: Self) extends AnyVal {
    
    inline def setNumber_of_elapsed_periods(value: long): Self = StObject.set(x, "number_of_elapsed_periods", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_elapsed_periodsUndefined: Self = StObject.set(x, "number_of_elapsed_periods", js.undefined)
    
    inline def setNumber_of_times_throttled(value: long): Self = StObject.set(x, "number_of_times_throttled", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_times_throttledUndefined: Self = StObject.set(x, "number_of_times_throttled", js.undefined)
    
    inline def setTime_throttled_nanos(value: DurationValue[UnitNanos]): Self = StObject.set(x, "time_throttled_nanos", value.asInstanceOf[js.Any])
    
    inline def setTime_throttled_nanosUndefined: Self = StObject.set(x, "time_throttled_nanos", js.undefined)
  }
}
