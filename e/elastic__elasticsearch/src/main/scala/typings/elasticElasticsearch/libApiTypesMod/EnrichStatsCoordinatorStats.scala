package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichStatsCoordinatorStats extends StObject {
  
  var executed_searches_total: long
  
  var node_id: Id
  
  var queue_size: integer
  
  var remote_requests_current: integer
  
  var remote_requests_total: long
}
object EnrichStatsCoordinatorStats {
  
  inline def apply(
    executed_searches_total: long,
    node_id: Id,
    queue_size: integer,
    remote_requests_current: integer,
    remote_requests_total: long
  ): EnrichStatsCoordinatorStats = {
    val __obj = js.Dynamic.literal(executed_searches_total = executed_searches_total.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], queue_size = queue_size.asInstanceOf[js.Any], remote_requests_current = remote_requests_current.asInstanceOf[js.Any], remote_requests_total = remote_requests_total.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichStatsCoordinatorStats]
  }
  
  extension [Self <: EnrichStatsCoordinatorStats](x: Self) {
    
    inline def setExecuted_searches_total(value: long): Self = StObject.set(x, "executed_searches_total", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: Id): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setQueue_size(value: integer): Self = StObject.set(x, "queue_size", value.asInstanceOf[js.Any])
    
    inline def setRemote_requests_current(value: integer): Self = StObject.set(x, "remote_requests_current", value.asInstanceOf[js.Any])
    
    inline def setRemote_requests_total(value: long): Self = StObject.set(x, "remote_requests_total", value.asInstanceOf[js.Any])
  }
}
