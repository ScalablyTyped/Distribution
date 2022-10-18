package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesFieldUsageStatsUsageStatsShards extends StObject {
  
  var routing: IndicesStatsShardRouting
  
  var stats: IndicesFieldUsageStatsShardsStats
  
  var tracking_id: String
  
  var tracking_started_at_millis: EpochTime[UnitMillis]
}
object IndicesFieldUsageStatsUsageStatsShards {
  
  inline def apply(
    routing: IndicesStatsShardRouting,
    stats: IndicesFieldUsageStatsShardsStats,
    tracking_id: String,
    tracking_started_at_millis: EpochTime[UnitMillis]
  ): IndicesFieldUsageStatsUsageStatsShards = {
    val __obj = js.Dynamic.literal(routing = routing.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tracking_id = tracking_id.asInstanceOf[js.Any], tracking_started_at_millis = tracking_started_at_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesFieldUsageStatsUsageStatsShards]
  }
  
  extension [Self <: IndicesFieldUsageStatsUsageStatsShards](x: Self) {
    
    inline def setRouting(value: IndicesStatsShardRouting): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setStats(value: IndicesFieldUsageStatsShardsStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setTracking_id(value: String): Self = StObject.set(x, "tracking_id", value.asInstanceOf[js.Any])
    
    inline def setTracking_started_at_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "tracking_started_at_millis", value.asInstanceOf[js.Any])
  }
}
