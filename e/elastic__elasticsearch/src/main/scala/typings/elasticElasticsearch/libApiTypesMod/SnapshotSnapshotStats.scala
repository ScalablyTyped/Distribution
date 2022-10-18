package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotSnapshotStats extends StObject {
  
  var incremental: SnapshotFileCountSnapshotStats
  
  var start_time_in_millis: EpochTime[UnitMillis]
  
  var time: js.UndefOr[Duration] = js.undefined
  
  var time_in_millis: DurationValue[UnitMillis]
  
  var total: SnapshotFileCountSnapshotStats
}
object SnapshotSnapshotStats {
  
  inline def apply(
    incremental: SnapshotFileCountSnapshotStats,
    start_time_in_millis: EpochTime[UnitMillis],
    time_in_millis: DurationValue[UnitMillis],
    total: SnapshotFileCountSnapshotStats
  ): SnapshotSnapshotStats = {
    val __obj = js.Dynamic.literal(incremental = incremental.asInstanceOf[js.Any], start_time_in_millis = start_time_in_millis.asInstanceOf[js.Any], time_in_millis = time_in_millis.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSnapshotStats]
  }
  
  extension [Self <: SnapshotSnapshotStats](x: Self) {
    
    inline def setIncremental(value: SnapshotFileCountSnapshotStats): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
    
    inline def setStart_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Duration): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTime_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: SnapshotFileCountSnapshotStats): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
