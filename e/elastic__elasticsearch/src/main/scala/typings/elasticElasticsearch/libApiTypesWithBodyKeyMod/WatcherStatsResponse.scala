package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherStatsResponse extends StObject {
  
  var _nodes: NodeStatistics
  
  var cluster_name: Name
  
  var manually_stopped: Boolean
  
  var stats: js.Array[WatcherStatsWatcherNodeStats]
}
object WatcherStatsResponse {
  
  inline def apply(
    _nodes: NodeStatistics,
    cluster_name: Name,
    manually_stopped: Boolean,
    stats: js.Array[WatcherStatsWatcherNodeStats]
  ): WatcherStatsResponse = {
    val __obj = js.Dynamic.literal(_nodes = _nodes.asInstanceOf[js.Any], cluster_name = cluster_name.asInstanceOf[js.Any], manually_stopped = manually_stopped.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setCluster_name(value: Name): Self = StObject.set(x, "cluster_name", value.asInstanceOf[js.Any])
    
    inline def setManually_stopped(value: Boolean): Self = StObject.set(x, "manually_stopped", value.asInstanceOf[js.Any])
    
    inline def setStats(value: js.Array[WatcherStatsWatcherNodeStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsVarargs(value: WatcherStatsWatcherNodeStats*): Self = StObject.set(x, "stats", js.Array(value*))
    
    inline def set_nodes(value: NodeStatistics): Self = StObject.set(x, "_nodes", value.asInstanceOf[js.Any])
  }
}
