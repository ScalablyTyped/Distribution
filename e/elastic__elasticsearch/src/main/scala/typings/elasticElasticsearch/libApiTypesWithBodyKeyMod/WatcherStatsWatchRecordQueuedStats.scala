package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherStatsWatchRecordQueuedStats extends StObject {
  
  var execution_time: DateTime
}
object WatcherStatsWatchRecordQueuedStats {
  
  inline def apply(execution_time: DateTime): WatcherStatsWatchRecordQueuedStats = {
    val __obj = js.Dynamic.literal(execution_time = execution_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherStatsWatchRecordQueuedStats]
  }
  
  extension [Self <: WatcherStatsWatchRecordQueuedStats](x: Self) {
    
    inline def setExecution_time(value: DateTime): Self = StObject.set(x, "execution_time", value.asInstanceOf[js.Any])
  }
}
