package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfo extends StObject {
  
  var aggregations: js.UndefOr[Record[String, NodesInfoNodeInfoAggregation]] = js.undefined
  
  var attributes: Record[String, String]
  
  var build_flavor: String
  
  var build_hash: String
  
  var build_type: String
  
  var host: Host
  
  var http: js.UndefOr[NodesInfoNodeInfoHttp] = js.undefined
  
  var ingest: js.UndefOr[NodesInfoNodeInfoIngest] = js.undefined
  
  var ip: Ip
  
  var jvm: js.UndefOr[NodesInfoNodeJvmInfo] = js.undefined
  
  var modules: js.UndefOr[js.Array[PluginStats]] = js.undefined
  
  var name: Name
  
  var network: js.UndefOr[NodesInfoNodeInfoNetwork] = js.undefined
  
  var os: js.UndefOr[NodesInfoNodeOperatingSystemInfo] = js.undefined
  
  var plugins: js.UndefOr[js.Array[PluginStats]] = js.undefined
  
  var process: js.UndefOr[NodesInfoNodeProcessInfo] = js.undefined
  
  var roles: NodeRoles
  
  var settings: js.UndefOr[NodesInfoNodeInfoSettings] = js.undefined
  
  var thread_pool: js.UndefOr[Record[String, NodesInfoNodeThreadPoolInfo]] = js.undefined
  
  var total_indexing_buffer: js.UndefOr[long] = js.undefined
  
  var total_indexing_buffer_in_bytes: js.UndefOr[ByteSize] = js.undefined
  
  var transport: js.UndefOr[NodesInfoNodeInfoTransport] = js.undefined
  
  var transport_address: TransportAddress
  
  var version: VersionString
}
object NodesInfoNodeInfo {
  
  inline def apply(
    attributes: Record[String, String],
    build_flavor: String,
    build_hash: String,
    build_type: String,
    host: Host,
    ip: Ip,
    name: Name,
    roles: NodeRoles,
    transport_address: TransportAddress,
    version: VersionString
  ): NodesInfoNodeInfo = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], build_flavor = build_flavor.asInstanceOf[js.Any], build_hash = build_hash.asInstanceOf[js.Any], build_type = build_type.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], transport_address = transport_address.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfo] (val x: Self) extends AnyVal {
    
    inline def setAggregations(value: Record[String, NodesInfoNodeInfoAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setBuild_flavor(value: String): Self = StObject.set(x, "build_flavor", value.asInstanceOf[js.Any])
    
    inline def setBuild_hash(value: String): Self = StObject.set(x, "build_hash", value.asInstanceOf[js.Any])
    
    inline def setBuild_type(value: String): Self = StObject.set(x, "build_type", value.asInstanceOf[js.Any])
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHttp(value: NodesInfoNodeInfoHttp): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setIngest(value: NodesInfoNodeInfoIngest): Self = StObject.set(x, "ingest", value.asInstanceOf[js.Any])
    
    inline def setIngestUndefined: Self = StObject.set(x, "ingest", js.undefined)
    
    inline def setIp(value: Ip): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setJvm(value: NodesInfoNodeJvmInfo): Self = StObject.set(x, "jvm", value.asInstanceOf[js.Any])
    
    inline def setJvmUndefined: Self = StObject.set(x, "jvm", js.undefined)
    
    inline def setModules(value: js.Array[PluginStats]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setModulesVarargs(value: PluginStats*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetwork(value: NodesInfoNodeInfoNetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setOs(value: NodesInfoNodeOperatingSystemInfo): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setPlugins(value: js.Array[PluginStats]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: PluginStats*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setProcess(value: NodesInfoNodeProcessInfo): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    inline def setRoles(value: NodeRoles): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: NodeRole*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setSettings(value: NodesInfoNodeInfoSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setThread_pool(value: Record[String, NodesInfoNodeThreadPoolInfo]): Self = StObject.set(x, "thread_pool", value.asInstanceOf[js.Any])
    
    inline def setThread_poolUndefined: Self = StObject.set(x, "thread_pool", js.undefined)
    
    inline def setTotal_indexing_buffer(value: long): Self = StObject.set(x, "total_indexing_buffer", value.asInstanceOf[js.Any])
    
    inline def setTotal_indexing_bufferUndefined: Self = StObject.set(x, "total_indexing_buffer", js.undefined)
    
    inline def setTotal_indexing_buffer_in_bytes(value: ByteSize): Self = StObject.set(x, "total_indexing_buffer_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_indexing_buffer_in_bytesUndefined: Self = StObject.set(x, "total_indexing_buffer_in_bytes", js.undefined)
    
    inline def setTransport(value: NodesInfoNodeInfoTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    inline def setTransport_address(value: TransportAddress): Self = StObject.set(x, "transport_address", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
