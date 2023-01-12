package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.sniff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRemoteInfoClusterRemoteSniffInfo
  extends StObject
     with ClusterRemoteInfoClusterRemoteInfo {
  
  var connected: Boolean
  
  var initial_connect_timeout: Duration
  
  var max_connections_per_cluster: integer
  
  var mode: sniff
  
  var num_nodes_connected: long
  
  var seeds: js.Array[String]
  
  var skip_unavailable: Boolean
}
object ClusterRemoteInfoClusterRemoteSniffInfo {
  
  inline def apply(
    connected: Boolean,
    initial_connect_timeout: Duration,
    max_connections_per_cluster: integer,
    num_nodes_connected: long,
    seeds: js.Array[String],
    skip_unavailable: Boolean
  ): ClusterRemoteInfoClusterRemoteSniffInfo = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], initial_connect_timeout = initial_connect_timeout.asInstanceOf[js.Any], max_connections_per_cluster = max_connections_per_cluster.asInstanceOf[js.Any], mode = "sniff", num_nodes_connected = num_nodes_connected.asInstanceOf[js.Any], seeds = seeds.asInstanceOf[js.Any], skip_unavailable = skip_unavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRemoteInfoClusterRemoteSniffInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterRemoteInfoClusterRemoteSniffInfo] (val x: Self) extends AnyVal {
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setInitial_connect_timeout(value: Duration): Self = StObject.set(x, "initial_connect_timeout", value.asInstanceOf[js.Any])
    
    inline def setMax_connections_per_cluster(value: integer): Self = StObject.set(x, "max_connections_per_cluster", value.asInstanceOf[js.Any])
    
    inline def setMode(value: sniff): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setNum_nodes_connected(value: long): Self = StObject.set(x, "num_nodes_connected", value.asInstanceOf[js.Any])
    
    inline def setSeeds(value: js.Array[String]): Self = StObject.set(x, "seeds", value.asInstanceOf[js.Any])
    
    inline def setSeedsVarargs(value: String*): Self = StObject.set(x, "seeds", js.Array(value*))
    
    inline def setSkip_unavailable(value: Boolean): Self = StObject.set(x, "skip_unavailable", value.asInstanceOf[js.Any])
  }
}
