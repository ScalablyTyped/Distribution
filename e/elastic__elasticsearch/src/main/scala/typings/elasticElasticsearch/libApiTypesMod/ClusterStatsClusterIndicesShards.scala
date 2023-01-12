package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterIndicesShards extends StObject {
  
  var index: js.UndefOr[ClusterStatsClusterIndicesShardsIndex] = js.undefined
  
  var primaries: js.UndefOr[double] = js.undefined
  
  var replication: js.UndefOr[double] = js.undefined
  
  var total: js.UndefOr[double] = js.undefined
}
object ClusterStatsClusterIndicesShards {
  
  inline def apply(): ClusterStatsClusterIndicesShards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterStatsClusterIndicesShards]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsClusterIndicesShards] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: ClusterStatsClusterIndicesShardsIndex): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPrimaries(value: double): Self = StObject.set(x, "primaries", value.asInstanceOf[js.Any])
    
    inline def setPrimariesUndefined: Self = StObject.set(x, "primaries", js.undefined)
    
    inline def setReplication(value: double): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
    
    inline def setReplicationUndefined: Self = StObject.set(x, "replication", js.undefined)
    
    inline def setTotal(value: double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
