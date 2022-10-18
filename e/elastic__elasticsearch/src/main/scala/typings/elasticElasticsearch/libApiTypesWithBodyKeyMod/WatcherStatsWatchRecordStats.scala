package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherStatsWatchRecordStats
  extends StObject
     with WatcherStatsWatchRecordQueuedStats {
  
  var executed_actions: js.UndefOr[js.Array[String]] = js.undefined
  
  var execution_phase: WatcherExecutionPhase
  
  var triggered_time: DateTime
  
  var watch_id: Id
  
  var watch_record_id: Id
}
object WatcherStatsWatchRecordStats {
  
  inline def apply(
    execution_phase: WatcherExecutionPhase,
    execution_time: DateTime,
    triggered_time: DateTime,
    watch_id: Id,
    watch_record_id: Id
  ): WatcherStatsWatchRecordStats = {
    val __obj = js.Dynamic.literal(execution_phase = execution_phase.asInstanceOf[js.Any], execution_time = execution_time.asInstanceOf[js.Any], triggered_time = triggered_time.asInstanceOf[js.Any], watch_id = watch_id.asInstanceOf[js.Any], watch_record_id = watch_record_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherStatsWatchRecordStats]
  }
  
  extension [Self <: WatcherStatsWatchRecordStats](x: Self) {
    
    inline def setExecuted_actions(value: js.Array[String]): Self = StObject.set(x, "executed_actions", value.asInstanceOf[js.Any])
    
    inline def setExecuted_actionsUndefined: Self = StObject.set(x, "executed_actions", js.undefined)
    
    inline def setExecuted_actionsVarargs(value: String*): Self = StObject.set(x, "executed_actions", js.Array(value*))
    
    inline def setExecution_phase(value: WatcherExecutionPhase): Self = StObject.set(x, "execution_phase", value.asInstanceOf[js.Any])
    
    inline def setTriggered_time(value: DateTime): Self = StObject.set(x, "triggered_time", value.asInstanceOf[js.Any])
    
    inline def setWatch_id(value: Id): Self = StObject.set(x, "watch_id", value.asInstanceOf[js.Any])
    
    inline def setWatch_record_id(value: Id): Self = StObject.set(x, "watch_record_id", value.asInstanceOf[js.Any])
  }
}
