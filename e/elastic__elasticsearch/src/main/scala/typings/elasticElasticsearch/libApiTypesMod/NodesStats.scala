package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesStats
  extends StObject
     with NodesNodeReloadResult {
  
  var adaptive_selection: js.UndefOr[Record[String, NodesAdaptiveSelection]] = js.undefined
  
  var attributes: js.UndefOr[Record[Field, String]] = js.undefined
  
  var breakers: js.UndefOr[Record[String, NodesBreaker]] = js.undefined
  
  var discovery: js.UndefOr[NodesDiscovery] = js.undefined
  
  var fs: js.UndefOr[NodesFileSystem] = js.undefined
  
  var host: js.UndefOr[Host] = js.undefined
  
  var http: js.UndefOr[NodesHttp] = js.undefined
  
  var indexing_pressure: js.UndefOr[NodesIndexingPressure] = js.undefined
  
  var indices: js.UndefOr[IndicesStatsShardStats] = js.undefined
  
  var ingest: js.UndefOr[NodesIngest] = js.undefined
  
  var ip: js.UndefOr[Ip | js.Array[Ip]] = js.undefined
  
  var jvm: js.UndefOr[NodesJvm] = js.undefined
  
  var name: js.UndefOr[Name] = js.undefined
  
  var os: js.UndefOr[NodesOperatingSystem] = js.undefined
  
  var process: js.UndefOr[NodesProcess] = js.undefined
  
  var roles: js.UndefOr[NodeRoles] = js.undefined
  
  var script: js.UndefOr[NodesScripting] = js.undefined
  
  var script_cache: js.UndefOr[Record[String, NodesScriptCache | js.Array[NodesScriptCache]]] = js.undefined
  
  var thread_pool: js.UndefOr[Record[String, NodesThreadCount]] = js.undefined
  
  var timestamp: js.UndefOr[long] = js.undefined
  
  var transport: js.UndefOr[NodesTransport] = js.undefined
  
  var transport_address: js.UndefOr[TransportAddress] = js.undefined
}
object NodesStats {
  
  inline def apply(): NodesStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesStats] (val x: Self) extends AnyVal {
    
    inline def setAdaptive_selection(value: Record[String, NodesAdaptiveSelection]): Self = StObject.set(x, "adaptive_selection", value.asInstanceOf[js.Any])
    
    inline def setAdaptive_selectionUndefined: Self = StObject.set(x, "adaptive_selection", js.undefined)
    
    inline def setAttributes(value: Record[Field, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setBreakers(value: Record[String, NodesBreaker]): Self = StObject.set(x, "breakers", value.asInstanceOf[js.Any])
    
    inline def setBreakersUndefined: Self = StObject.set(x, "breakers", js.undefined)
    
    inline def setDiscovery(value: NodesDiscovery): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    
    inline def setFs(value: NodesFileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttp(value: NodesHttp): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setIndexing_pressure(value: NodesIndexingPressure): Self = StObject.set(x, "indexing_pressure", value.asInstanceOf[js.Any])
    
    inline def setIndexing_pressureUndefined: Self = StObject.set(x, "indexing_pressure", js.undefined)
    
    inline def setIndices(value: IndicesStatsShardStats): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIngest(value: NodesIngest): Self = StObject.set(x, "ingest", value.asInstanceOf[js.Any])
    
    inline def setIngestUndefined: Self = StObject.set(x, "ingest", js.undefined)
    
    inline def setIp(value: Ip | js.Array[Ip]): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setIpVarargs(value: Ip*): Self = StObject.set(x, "ip", js.Array(value*))
    
    inline def setJvm(value: NodesJvm): Self = StObject.set(x, "jvm", value.asInstanceOf[js.Any])
    
    inline def setJvmUndefined: Self = StObject.set(x, "jvm", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOs(value: NodesOperatingSystem): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setProcess(value: NodesProcess): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    inline def setRoles(value: NodeRoles): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: NodeRole*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setScript(value: NodesScripting): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setScript_cache(value: Record[String, NodesScriptCache | js.Array[NodesScriptCache]]): Self = StObject.set(x, "script_cache", value.asInstanceOf[js.Any])
    
    inline def setScript_cacheUndefined: Self = StObject.set(x, "script_cache", js.undefined)
    
    inline def setThread_pool(value: Record[String, NodesThreadCount]): Self = StObject.set(x, "thread_pool", value.asInstanceOf[js.Any])
    
    inline def setThread_poolUndefined: Self = StObject.set(x, "thread_pool", js.undefined)
    
    inline def setTimestamp(value: long): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTransport(value: NodesTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    inline def setTransport_address(value: TransportAddress): Self = StObject.set(x, "transport_address", value.asInstanceOf[js.Any])
    
    inline def setTransport_addressUndefined: Self = StObject.set(x, "transport_address", js.undefined)
  }
}
