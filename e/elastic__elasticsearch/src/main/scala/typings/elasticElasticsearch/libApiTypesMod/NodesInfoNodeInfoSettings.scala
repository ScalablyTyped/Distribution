package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoSettings extends StObject {
  
  var action: js.UndefOr[NodesInfoNodeInfoAction] = js.undefined
  
  var bootstrap: js.UndefOr[NodesInfoNodeInfoBootstrap] = js.undefined
  
  var client: NodesInfoNodeInfoClient
  
  var cluster: NodesInfoNodeInfoSettingsCluster
  
  var discovery: js.UndefOr[NodesInfoNodeInfoDiscover] = js.undefined
  
  var http: NodesInfoNodeInfoSettingsHttp
  
  var ingest: js.UndefOr[NodesInfoNodeInfoSettingsIngest] = js.undefined
  
  var network: js.UndefOr[NodesInfoNodeInfoSettingsNetwork] = js.undefined
  
  var node: NodesInfoNodeInfoSettingsNode
  
  var path: NodesInfoNodeInfoPath
  
  var repositories: js.UndefOr[NodesInfoNodeInfoRepositories] = js.undefined
  
  var script: js.UndefOr[NodesInfoNodeInfoScript] = js.undefined
  
  var search: js.UndefOr[NodesInfoNodeInfoSearch] = js.undefined
  
  var transport: NodesInfoNodeInfoSettingsTransport
  
  var xpack: js.UndefOr[NodesInfoNodeInfoXpack] = js.undefined
}
object NodesInfoNodeInfoSettings {
  
  inline def apply(
    client: NodesInfoNodeInfoClient,
    cluster: NodesInfoNodeInfoSettingsCluster,
    http: NodesInfoNodeInfoSettingsHttp,
    node: NodesInfoNodeInfoSettingsNode,
    path: NodesInfoNodeInfoPath,
    transport: NodesInfoNodeInfoSettingsTransport
  ): NodesInfoNodeInfoSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], cluster = cluster.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoSettings] (val x: Self) extends AnyVal {
    
    inline def setAction(value: NodesInfoNodeInfoAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setBootstrap(value: NodesInfoNodeInfoBootstrap): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setBootstrapUndefined: Self = StObject.set(x, "bootstrap", js.undefined)
    
    inline def setClient(value: NodesInfoNodeInfoClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setCluster(value: NodesInfoNodeInfoSettingsCluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setDiscovery(value: NodesInfoNodeInfoDiscover): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    
    inline def setHttp(value: NodesInfoNodeInfoSettingsHttp): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setIngest(value: NodesInfoNodeInfoSettingsIngest): Self = StObject.set(x, "ingest", value.asInstanceOf[js.Any])
    
    inline def setIngestUndefined: Self = StObject.set(x, "ingest", js.undefined)
    
    inline def setNetwork(value: NodesInfoNodeInfoSettingsNetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNode(value: NodesInfoNodeInfoSettingsNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPath(value: NodesInfoNodeInfoPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRepositories(value: NodesInfoNodeInfoRepositories): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setScript(value: NodesInfoNodeInfoScript): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setSearch(value: NodesInfoNodeInfoSearch): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setTransport(value: NodesInfoNodeInfoSettingsTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setXpack(value: NodesInfoNodeInfoXpack): Self = StObject.set(x, "xpack", value.asInstanceOf[js.Any])
    
    inline def setXpackUndefined: Self = StObject.set(x, "xpack", js.undefined)
  }
}
