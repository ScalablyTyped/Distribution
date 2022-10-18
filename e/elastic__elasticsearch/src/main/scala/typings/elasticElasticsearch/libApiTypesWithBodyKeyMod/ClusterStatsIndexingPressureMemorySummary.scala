package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsIndexingPressureMemorySummary extends StObject {
  
  var all_in_bytes: long
  
  var combined_coordinating_and_primary_in_bytes: long
  
  var coordinating_in_bytes: long
  
  var coordinating_rejections: js.UndefOr[long] = js.undefined
  
  var primary_in_bytes: long
  
  var primary_rejections: js.UndefOr[long] = js.undefined
  
  var replica_in_bytes: long
  
  var replica_rejections: js.UndefOr[long] = js.undefined
}
object ClusterStatsIndexingPressureMemorySummary {
  
  inline def apply(
    all_in_bytes: long,
    combined_coordinating_and_primary_in_bytes: long,
    coordinating_in_bytes: long,
    primary_in_bytes: long,
    replica_in_bytes: long
  ): ClusterStatsIndexingPressureMemorySummary = {
    val __obj = js.Dynamic.literal(all_in_bytes = all_in_bytes.asInstanceOf[js.Any], combined_coordinating_and_primary_in_bytes = combined_coordinating_and_primary_in_bytes.asInstanceOf[js.Any], coordinating_in_bytes = coordinating_in_bytes.asInstanceOf[js.Any], primary_in_bytes = primary_in_bytes.asInstanceOf[js.Any], replica_in_bytes = replica_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsIndexingPressureMemorySummary]
  }
  
  extension [Self <: ClusterStatsIndexingPressureMemorySummary](x: Self) {
    
    inline def setAll_in_bytes(value: long): Self = StObject.set(x, "all_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setCombined_coordinating_and_primary_in_bytes(value: long): Self = StObject.set(x, "combined_coordinating_and_primary_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setCoordinating_in_bytes(value: long): Self = StObject.set(x, "coordinating_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setCoordinating_rejections(value: long): Self = StObject.set(x, "coordinating_rejections", value.asInstanceOf[js.Any])
    
    inline def setCoordinating_rejectionsUndefined: Self = StObject.set(x, "coordinating_rejections", js.undefined)
    
    inline def setPrimary_in_bytes(value: long): Self = StObject.set(x, "primary_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setPrimary_rejections(value: long): Self = StObject.set(x, "primary_rejections", value.asInstanceOf[js.Any])
    
    inline def setPrimary_rejectionsUndefined: Self = StObject.set(x, "primary_rejections", js.undefined)
    
    inline def setReplica_in_bytes(value: long): Self = StObject.set(x, "replica_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setReplica_rejections(value: long): Self = StObject.set(x, "replica_rejections", value.asInstanceOf[js.Any])
    
    inline def setReplica_rejectionsUndefined: Self = StObject.set(x, "replica_rejections", js.undefined)
  }
}
