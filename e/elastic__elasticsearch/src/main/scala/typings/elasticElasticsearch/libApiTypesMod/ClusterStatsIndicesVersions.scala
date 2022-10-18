package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsIndicesVersions extends StObject {
  
  var index_count: integer
  
  var primary_shard_count: integer
  
  var total_primary_bytes: long
  
  var version: VersionString
}
object ClusterStatsIndicesVersions {
  
  inline def apply(
    index_count: integer,
    primary_shard_count: integer,
    total_primary_bytes: long,
    version: VersionString
  ): ClusterStatsIndicesVersions = {
    val __obj = js.Dynamic.literal(index_count = index_count.asInstanceOf[js.Any], primary_shard_count = primary_shard_count.asInstanceOf[js.Any], total_primary_bytes = total_primary_bytes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsIndicesVersions]
  }
  
  extension [Self <: ClusterStatsIndicesVersions](x: Self) {
    
    inline def setIndex_count(value: integer): Self = StObject.set(x, "index_count", value.asInstanceOf[js.Any])
    
    inline def setPrimary_shard_count(value: integer): Self = StObject.set(x, "primary_shard_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_primary_bytes(value: long): Self = StObject.set(x, "total_primary_bytes", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
