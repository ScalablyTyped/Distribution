package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherStatsWatcherNodeStats extends StObject {
  
  var current_watches: js.UndefOr[js.Array[WatcherStatsWatchRecordStats]] = js.undefined
  
  var execution_thread_pool: WatcherExecutionThreadPool
  
  var node_id: Id
  
  var queued_watches: js.UndefOr[js.Array[WatcherStatsWatchRecordQueuedStats]] = js.undefined
  
  var watch_count: long
  
  var watcher_state: WatcherStatsWatcherState
}
object WatcherStatsWatcherNodeStats {
  
  inline def apply(
    execution_thread_pool: WatcherExecutionThreadPool,
    node_id: Id,
    watch_count: long,
    watcher_state: WatcherStatsWatcherState
  ): WatcherStatsWatcherNodeStats = {
    val __obj = js.Dynamic.literal(execution_thread_pool = execution_thread_pool.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], watch_count = watch_count.asInstanceOf[js.Any], watcher_state = watcher_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherStatsWatcherNodeStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherStatsWatcherNodeStats] (val x: Self) extends AnyVal {
    
    inline def setCurrent_watches(value: js.Array[WatcherStatsWatchRecordStats]): Self = StObject.set(x, "current_watches", value.asInstanceOf[js.Any])
    
    inline def setCurrent_watchesUndefined: Self = StObject.set(x, "current_watches", js.undefined)
    
    inline def setCurrent_watchesVarargs(value: WatcherStatsWatchRecordStats*): Self = StObject.set(x, "current_watches", js.Array(value*))
    
    inline def setExecution_thread_pool(value: WatcherExecutionThreadPool): Self = StObject.set(x, "execution_thread_pool", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: Id): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setQueued_watches(value: js.Array[WatcherStatsWatchRecordQueuedStats]): Self = StObject.set(x, "queued_watches", value.asInstanceOf[js.Any])
    
    inline def setQueued_watchesUndefined: Self = StObject.set(x, "queued_watches", js.undefined)
    
    inline def setQueued_watchesVarargs(value: WatcherStatsWatchRecordQueuedStats*): Self = StObject.set(x, "queued_watches", js.Array(value*))
    
    inline def setWatch_count(value: long): Self = StObject.set(x, "watch_count", value.asInstanceOf[js.Any])
    
    inline def setWatcher_state(value: WatcherStatsWatcherState): Self = StObject.set(x, "watcher_state", value.asInstanceOf[js.Any])
  }
}
