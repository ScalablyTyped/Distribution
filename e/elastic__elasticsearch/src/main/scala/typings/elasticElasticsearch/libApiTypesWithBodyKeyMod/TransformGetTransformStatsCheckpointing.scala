package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformGetTransformStatsCheckpointing extends StObject {
  
  var changes_last_detected_at: js.UndefOr[long] = js.undefined
  
  var changes_last_detected_at_date_time: js.UndefOr[DateTime] = js.undefined
  
  var last: TransformGetTransformStatsCheckpointStats
  
  var last_search_time: js.UndefOr[long] = js.undefined
  
  var next: js.UndefOr[TransformGetTransformStatsCheckpointStats] = js.undefined
  
  var operations_behind: js.UndefOr[long] = js.undefined
}
object TransformGetTransformStatsCheckpointing {
  
  inline def apply(last: TransformGetTransformStatsCheckpointStats): TransformGetTransformStatsCheckpointing = {
    val __obj = js.Dynamic.literal(last = last.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformGetTransformStatsCheckpointing]
  }
  
  extension [Self <: TransformGetTransformStatsCheckpointing](x: Self) {
    
    inline def setChanges_last_detected_at(value: long): Self = StObject.set(x, "changes_last_detected_at", value.asInstanceOf[js.Any])
    
    inline def setChanges_last_detected_atUndefined: Self = StObject.set(x, "changes_last_detected_at", js.undefined)
    
    inline def setChanges_last_detected_at_date_time(value: DateTime): Self = StObject.set(x, "changes_last_detected_at_date_time", value.asInstanceOf[js.Any])
    
    inline def setChanges_last_detected_at_date_timeUndefined: Self = StObject.set(x, "changes_last_detected_at_date_time", js.undefined)
    
    inline def setLast(value: TransformGetTransformStatsCheckpointStats): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLast_search_time(value: long): Self = StObject.set(x, "last_search_time", value.asInstanceOf[js.Any])
    
    inline def setLast_search_timeUndefined: Self = StObject.set(x, "last_search_time", js.undefined)
    
    inline def setNext(value: TransformGetTransformStatsCheckpointStats): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setOperations_behind(value: long): Self = StObject.set(x, "operations_behind", value.asInstanceOf[js.Any])
    
    inline def setOperations_behindUndefined: Self = StObject.set(x, "operations_behind", js.undefined)
  }
}
