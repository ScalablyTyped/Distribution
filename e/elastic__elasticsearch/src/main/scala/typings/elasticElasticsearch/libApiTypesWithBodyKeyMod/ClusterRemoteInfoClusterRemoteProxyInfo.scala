package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRemoteInfoClusterRemoteProxyInfo
  extends StObject
     with ClusterRemoteInfoClusterRemoteInfo {
  
  var connected: Boolean
  
  var initial_connect_timeout: Duration
  
  var max_proxy_socket_connections: integer
  
  var mode: proxy
  
  var num_proxy_sockets_connected: integer
  
  var proxy_address: String
  
  var server_name: String
  
  var skip_unavailable: Boolean
}
object ClusterRemoteInfoClusterRemoteProxyInfo {
  
  inline def apply(
    connected: Boolean,
    initial_connect_timeout: Duration,
    max_proxy_socket_connections: integer,
    num_proxy_sockets_connected: integer,
    proxy_address: String,
    server_name: String,
    skip_unavailable: Boolean
  ): ClusterRemoteInfoClusterRemoteProxyInfo = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], initial_connect_timeout = initial_connect_timeout.asInstanceOf[js.Any], max_proxy_socket_connections = max_proxy_socket_connections.asInstanceOf[js.Any], mode = "proxy", num_proxy_sockets_connected = num_proxy_sockets_connected.asInstanceOf[js.Any], proxy_address = proxy_address.asInstanceOf[js.Any], server_name = server_name.asInstanceOf[js.Any], skip_unavailable = skip_unavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRemoteInfoClusterRemoteProxyInfo]
  }
  
  extension [Self <: ClusterRemoteInfoClusterRemoteProxyInfo](x: Self) {
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setInitial_connect_timeout(value: Duration): Self = StObject.set(x, "initial_connect_timeout", value.asInstanceOf[js.Any])
    
    inline def setMax_proxy_socket_connections(value: integer): Self = StObject.set(x, "max_proxy_socket_connections", value.asInstanceOf[js.Any])
    
    inline def setMode(value: proxy): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setNum_proxy_sockets_connected(value: integer): Self = StObject.set(x, "num_proxy_sockets_connected", value.asInstanceOf[js.Any])
    
    inline def setProxy_address(value: String): Self = StObject.set(x, "proxy_address", value.asInstanceOf[js.Any])
    
    inline def setServer_name(value: String): Self = StObject.set(x, "server_name", value.asInstanceOf[js.Any])
    
    inline def setSkip_unavailable(value: Boolean): Self = StObject.set(x, "skip_unavailable", value.asInstanceOf[js.Any])
  }
}
