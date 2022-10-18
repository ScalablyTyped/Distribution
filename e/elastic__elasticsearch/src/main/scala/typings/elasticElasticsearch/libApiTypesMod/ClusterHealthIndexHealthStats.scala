package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterHealthIndexHealthStats extends StObject {
  
  var active_primary_shards: integer
  
  var active_shards: integer
  
  var initializing_shards: integer
  
  var number_of_replicas: integer
  
  var number_of_shards: integer
  
  var relocating_shards: integer
  
  var shards: js.UndefOr[Record[String, ClusterHealthShardHealthStats]] = js.undefined
  
  var status: HealthStatus
  
  var unassigned_shards: integer
}
object ClusterHealthIndexHealthStats {
  
  inline def apply(
    active_primary_shards: integer,
    active_shards: integer,
    initializing_shards: integer,
    number_of_replicas: integer,
    number_of_shards: integer,
    relocating_shards: integer,
    status: HealthStatus,
    unassigned_shards: integer
  ): ClusterHealthIndexHealthStats = {
    val __obj = js.Dynamic.literal(active_primary_shards = active_primary_shards.asInstanceOf[js.Any], active_shards = active_shards.asInstanceOf[js.Any], initializing_shards = initializing_shards.asInstanceOf[js.Any], number_of_replicas = number_of_replicas.asInstanceOf[js.Any], number_of_shards = number_of_shards.asInstanceOf[js.Any], relocating_shards = relocating_shards.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unassigned_shards = unassigned_shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterHealthIndexHealthStats]
  }
  
  extension [Self <: ClusterHealthIndexHealthStats](x: Self) {
    
    inline def setActive_primary_shards(value: integer): Self = StObject.set(x, "active_primary_shards", value.asInstanceOf[js.Any])
    
    inline def setActive_shards(value: integer): Self = StObject.set(x, "active_shards", value.asInstanceOf[js.Any])
    
    inline def setInitializing_shards(value: integer): Self = StObject.set(x, "initializing_shards", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_replicas(value: integer): Self = StObject.set(x, "number_of_replicas", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_shards(value: integer): Self = StObject.set(x, "number_of_shards", value.asInstanceOf[js.Any])
    
    inline def setRelocating_shards(value: integer): Self = StObject.set(x, "relocating_shards", value.asInstanceOf[js.Any])
    
    inline def setShards(value: Record[String, ClusterHealthShardHealthStats]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
    
    inline def setStatus(value: HealthStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUnassigned_shards(value: integer): Self = StObject.set(x, "unassigned_shards", value.asInstanceOf[js.Any])
  }
}
