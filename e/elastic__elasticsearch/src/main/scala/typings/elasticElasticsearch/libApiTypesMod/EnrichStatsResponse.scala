package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichStatsResponse extends StObject {
  
  var cache_stats: js.UndefOr[js.Array[EnrichStatsCacheStats]] = js.undefined
  
  var coordinator_stats: js.Array[EnrichStatsCoordinatorStats]
  
  var executing_policies: js.Array[EnrichStatsExecutingPolicy]
}
object EnrichStatsResponse {
  
  inline def apply(
    coordinator_stats: js.Array[EnrichStatsCoordinatorStats],
    executing_policies: js.Array[EnrichStatsExecutingPolicy]
  ): EnrichStatsResponse = {
    val __obj = js.Dynamic.literal(coordinator_stats = coordinator_stats.asInstanceOf[js.Any], executing_policies = executing_policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichStatsResponse]
  }
  
  extension [Self <: EnrichStatsResponse](x: Self) {
    
    inline def setCache_stats(value: js.Array[EnrichStatsCacheStats]): Self = StObject.set(x, "cache_stats", value.asInstanceOf[js.Any])
    
    inline def setCache_statsUndefined: Self = StObject.set(x, "cache_stats", js.undefined)
    
    inline def setCache_statsVarargs(value: EnrichStatsCacheStats*): Self = StObject.set(x, "cache_stats", js.Array(value*))
    
    inline def setCoordinator_stats(value: js.Array[EnrichStatsCoordinatorStats]): Self = StObject.set(x, "coordinator_stats", value.asInstanceOf[js.Any])
    
    inline def setCoordinator_statsVarargs(value: EnrichStatsCoordinatorStats*): Self = StObject.set(x, "coordinator_stats", js.Array(value*))
    
    inline def setExecuting_policies(value: js.Array[EnrichStatsExecutingPolicy]): Self = StObject.set(x, "executing_policies", value.asInstanceOf[js.Any])
    
    inline def setExecuting_policiesVarargs(value: EnrichStatsExecutingPolicy*): Self = StObject.set(x, "executing_policies", js.Array(value*))
  }
}
