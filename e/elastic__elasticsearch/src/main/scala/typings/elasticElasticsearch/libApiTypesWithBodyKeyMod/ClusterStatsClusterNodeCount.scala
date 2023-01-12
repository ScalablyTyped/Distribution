package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterNodeCount extends StObject {
  
  var coordinating_only: integer
  
  var data: integer
  
  var data_cold: integer
  
  var data_content: integer
  
  var data_frozen: js.UndefOr[integer] = js.undefined
  
  var data_hot: integer
  
  var data_warm: integer
  
  var ingest: integer
  
  var master: integer
  
  var ml: integer
  
  var remote_cluster_client: integer
  
  var total: integer
  
  var transform: integer
  
  var voting_only: integer
}
object ClusterStatsClusterNodeCount {
  
  inline def apply(
    coordinating_only: integer,
    data: integer,
    data_cold: integer,
    data_content: integer,
    data_hot: integer,
    data_warm: integer,
    ingest: integer,
    master: integer,
    ml: integer,
    remote_cluster_client: integer,
    total: integer,
    transform: integer,
    voting_only: integer
  ): ClusterStatsClusterNodeCount = {
    val __obj = js.Dynamic.literal(coordinating_only = coordinating_only.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], data_cold = data_cold.asInstanceOf[js.Any], data_content = data_content.asInstanceOf[js.Any], data_hot = data_hot.asInstanceOf[js.Any], data_warm = data_warm.asInstanceOf[js.Any], ingest = ingest.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any], remote_cluster_client = remote_cluster_client.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], voting_only = voting_only.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterNodeCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsClusterNodeCount] (val x: Self) extends AnyVal {
    
    inline def setCoordinating_only(value: integer): Self = StObject.set(x, "coordinating_only", value.asInstanceOf[js.Any])
    
    inline def setData(value: integer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setData_cold(value: integer): Self = StObject.set(x, "data_cold", value.asInstanceOf[js.Any])
    
    inline def setData_content(value: integer): Self = StObject.set(x, "data_content", value.asInstanceOf[js.Any])
    
    inline def setData_frozen(value: integer): Self = StObject.set(x, "data_frozen", value.asInstanceOf[js.Any])
    
    inline def setData_frozenUndefined: Self = StObject.set(x, "data_frozen", js.undefined)
    
    inline def setData_hot(value: integer): Self = StObject.set(x, "data_hot", value.asInstanceOf[js.Any])
    
    inline def setData_warm(value: integer): Self = StObject.set(x, "data_warm", value.asInstanceOf[js.Any])
    
    inline def setIngest(value: integer): Self = StObject.set(x, "ingest", value.asInstanceOf[js.Any])
    
    inline def setMaster(value: integer): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setMl(value: integer): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    inline def setRemote_cluster_client(value: integer): Self = StObject.set(x, "remote_cluster_client", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: integer): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: integer): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setVoting_only(value: integer): Self = StObject.set(x, "voting_only", value.asInstanceOf[js.Any])
  }
}
