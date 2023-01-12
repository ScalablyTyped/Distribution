package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotShardsStatsSummary extends StObject {
  
  var incremental: SnapshotShardsStatsSummaryItem
  
  var start_time_in_millis: EpochTime[UnitMillis]
  
  var time: js.UndefOr[Duration] = js.undefined
  
  var time_in_millis: DurationValue[UnitMillis]
  
  var total: SnapshotShardsStatsSummaryItem
}
object SnapshotShardsStatsSummary {
  
  inline def apply(
    incremental: SnapshotShardsStatsSummaryItem,
    start_time_in_millis: EpochTime[UnitMillis],
    time_in_millis: DurationValue[UnitMillis],
    total: SnapshotShardsStatsSummaryItem
  ): SnapshotShardsStatsSummary = {
    val __obj = js.Dynamic.literal(incremental = incremental.asInstanceOf[js.Any], start_time_in_millis = start_time_in_millis.asInstanceOf[js.Any], time_in_millis = time_in_millis.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotShardsStatsSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotShardsStatsSummary] (val x: Self) extends AnyVal {
    
    inline def setIncremental(value: SnapshotShardsStatsSummaryItem): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
    
    inline def setStart_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Duration): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTime_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: SnapshotShardsStatsSummaryItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
