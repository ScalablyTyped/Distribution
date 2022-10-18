package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterHealthShardHealthStats extends StObject {
  
  var active_shards: integer
  
  var initializing_shards: integer
  
  var primary_active: Boolean
  
  var relocating_shards: integer
  
  var status: HealthStatus
  
  var unassigned_shards: integer
}
object ClusterHealthShardHealthStats {
  
  inline def apply(
    active_shards: integer,
    initializing_shards: integer,
    primary_active: Boolean,
    relocating_shards: integer,
    status: HealthStatus,
    unassigned_shards: integer
  ): ClusterHealthShardHealthStats = {
    val __obj = js.Dynamic.literal(active_shards = active_shards.asInstanceOf[js.Any], initializing_shards = initializing_shards.asInstanceOf[js.Any], primary_active = primary_active.asInstanceOf[js.Any], relocating_shards = relocating_shards.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unassigned_shards = unassigned_shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterHealthShardHealthStats]
  }
  
  extension [Self <: ClusterHealthShardHealthStats](x: Self) {
    
    inline def setActive_shards(value: integer): Self = StObject.set(x, "active_shards", value.asInstanceOf[js.Any])
    
    inline def setInitializing_shards(value: integer): Self = StObject.set(x, "initializing_shards", value.asInstanceOf[js.Any])
    
    inline def setPrimary_active(value: Boolean): Self = StObject.set(x, "primary_active", value.asInstanceOf[js.Any])
    
    inline def setRelocating_shards(value: integer): Self = StObject.set(x, "relocating_shards", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: HealthStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUnassigned_shards(value: integer): Self = StObject.set(x, "unassigned_shards", value.asInstanceOf[js.Any])
  }
}
