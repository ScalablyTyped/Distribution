package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsIndicesStats extends StObject {
  
  var health: js.UndefOr[HealthStatus] = js.undefined
  
  var primaries: js.UndefOr[IndicesStatsIndexStats] = js.undefined
  
  var shards: js.UndefOr[Record[String, js.Array[IndicesStatsShardStats]]] = js.undefined
  
  var status: js.UndefOr[IndicesStatsIndexMetadataState] = js.undefined
  
  var total: js.UndefOr[IndicesStatsIndexStats] = js.undefined
  
  var uuid: js.UndefOr[Uuid] = js.undefined
}
object IndicesStatsIndicesStats {
  
  inline def apply(): IndicesStatsIndicesStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesStatsIndicesStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesStatsIndicesStats] (val x: Self) extends AnyVal {
    
    inline def setHealth(value: HealthStatus): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setPrimaries(value: IndicesStatsIndexStats): Self = StObject.set(x, "primaries", value.asInstanceOf[js.Any])
    
    inline def setPrimariesUndefined: Self = StObject.set(x, "primaries", js.undefined)
    
    inline def setShards(value: Record[String, js.Array[IndicesStatsShardStats]]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
    
    inline def setStatus(value: IndicesStatsIndexMetadataState): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotal(value: IndicesStatsIndexStats): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setUuid(value: Uuid): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
