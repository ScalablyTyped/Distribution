package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRemoteInfoClusterRemoteSniffInfo
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRemoteInfoClusterRemoteProxyInfo
*/
trait ClusterRemoteInfoClusterRemoteInfo extends StObject
object ClusterRemoteInfoClusterRemoteInfo {
  
  inline def ClusterRemoteInfoClusterRemoteProxyInfo(
    connected: Boolean,
    initial_connect_timeout: Duration,
    max_proxy_socket_connections: integer,
    num_proxy_sockets_connected: integer,
    proxy_address: String,
    server_name: String,
    skip_unavailable: Boolean
  ): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRemoteInfoClusterRemoteProxyInfo = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], initial_connect_timeout = initial_connect_timeout.asInstanceOf[js.Any], max_proxy_socket_connections = max_proxy_socket_connections.asInstanceOf[js.Any], mode = "proxy", num_proxy_sockets_connected = num_proxy_sockets_connected.asInstanceOf[js.Any], proxy_address = proxy_address.asInstanceOf[js.Any], server_name = server_name.asInstanceOf[js.Any], skip_unavailable = skip_unavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRemoteInfoClusterRemoteProxyInfo]
  }
  
  inline def ClusterRemoteInfoClusterRemoteSniffInfo(
    connected: Boolean,
    initial_connect_timeout: Duration,
    max_connections_per_cluster: integer,
    num_nodes_connected: long,
    seeds: js.Array[String],
    skip_unavailable: Boolean
  ): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRemoteInfoClusterRemoteSniffInfo = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], initial_connect_timeout = initial_connect_timeout.asInstanceOf[js.Any], max_connections_per_cluster = max_connections_per_cluster.asInstanceOf[js.Any], mode = "sniff", num_nodes_connected = num_nodes_connected.asInstanceOf[js.Any], seeds = seeds.asInstanceOf[js.Any], skip_unavailable = skip_unavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRemoteInfoClusterRemoteSniffInfo]
  }
}
