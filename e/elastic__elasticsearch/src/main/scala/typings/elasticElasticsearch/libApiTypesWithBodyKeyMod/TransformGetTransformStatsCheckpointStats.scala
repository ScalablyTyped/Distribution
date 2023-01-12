package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformGetTransformStatsCheckpointStats extends StObject {
  
  var checkpoint: long
  
  var checkpoint_progress: js.UndefOr[TransformGetTransformStatsTransformProgress] = js.undefined
  
  var time_upper_bound: js.UndefOr[DateTime] = js.undefined
  
  var time_upper_bound_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var timestamp: js.UndefOr[DateTime] = js.undefined
  
  var timestamp_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
}
object TransformGetTransformStatsCheckpointStats {
  
  inline def apply(checkpoint: long): TransformGetTransformStatsCheckpointStats = {
    val __obj = js.Dynamic.literal(checkpoint = checkpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformGetTransformStatsCheckpointStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformGetTransformStatsCheckpointStats] (val x: Self) extends AnyVal {
    
    inline def setCheckpoint(value: long): Self = StObject.set(x, "checkpoint", value.asInstanceOf[js.Any])
    
    inline def setCheckpoint_progress(value: TransformGetTransformStatsTransformProgress): Self = StObject.set(x, "checkpoint_progress", value.asInstanceOf[js.Any])
    
    inline def setCheckpoint_progressUndefined: Self = StObject.set(x, "checkpoint_progress", js.undefined)
    
    inline def setTime_upper_bound(value: DateTime): Self = StObject.set(x, "time_upper_bound", value.asInstanceOf[js.Any])
    
    inline def setTime_upper_boundUndefined: Self = StObject.set(x, "time_upper_bound", js.undefined)
    
    inline def setTime_upper_bound_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "time_upper_bound_millis", value.asInstanceOf[js.Any])
    
    inline def setTime_upper_bound_millisUndefined: Self = StObject.set(x, "time_upper_bound_millis", js.undefined)
    
    inline def setTimestamp(value: DateTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTimestamp_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "timestamp_millis", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_millisUndefined: Self = StObject.set(x, "timestamp_millis", js.undefined)
  }
}
