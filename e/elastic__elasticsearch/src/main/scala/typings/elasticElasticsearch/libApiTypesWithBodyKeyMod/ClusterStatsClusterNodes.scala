package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterNodes extends StObject {
  
  var count: ClusterStatsClusterNodeCount
  
  var discovery_types: Record[String, integer]
  
  var fs: ClusterStatsClusterFileSystem
  
  var indexing_pressure: ClusterStatsIndexingPressure
  
  var ingest: ClusterStatsClusterIngest
  
  var jvm: ClusterStatsClusterJvm
  
  var network_types: ClusterStatsClusterNetworkTypes
  
  var os: ClusterStatsClusterOperatingSystem
  
  var packaging_types: js.Array[ClusterStatsNodePackagingType]
  
  var plugins: js.Array[PluginStats]
  
  var process: ClusterStatsClusterProcess
  
  var versions: js.Array[VersionString]
}
object ClusterStatsClusterNodes {
  
  inline def apply(
    count: ClusterStatsClusterNodeCount,
    discovery_types: Record[String, integer],
    fs: ClusterStatsClusterFileSystem,
    indexing_pressure: ClusterStatsIndexingPressure,
    ingest: ClusterStatsClusterIngest,
    jvm: ClusterStatsClusterJvm,
    network_types: ClusterStatsClusterNetworkTypes,
    os: ClusterStatsClusterOperatingSystem,
    packaging_types: js.Array[ClusterStatsNodePackagingType],
    plugins: js.Array[PluginStats],
    process: ClusterStatsClusterProcess,
    versions: js.Array[VersionString]
  ): ClusterStatsClusterNodes = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], discovery_types = discovery_types.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], indexing_pressure = indexing_pressure.asInstanceOf[js.Any], ingest = ingest.asInstanceOf[js.Any], jvm = jvm.asInstanceOf[js.Any], network_types = network_types.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], packaging_types = packaging_types.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterNodes]
  }
  
  extension [Self <: ClusterStatsClusterNodes](x: Self) {
    
    inline def setCount(value: ClusterStatsClusterNodeCount): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDiscovery_types(value: Record[String, integer]): Self = StObject.set(x, "discovery_types", value.asInstanceOf[js.Any])
    
    inline def setFs(value: ClusterStatsClusterFileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setIndexing_pressure(value: ClusterStatsIndexingPressure): Self = StObject.set(x, "indexing_pressure", value.asInstanceOf[js.Any])
    
    inline def setIngest(value: ClusterStatsClusterIngest): Self = StObject.set(x, "ingest", value.asInstanceOf[js.Any])
    
    inline def setJvm(value: ClusterStatsClusterJvm): Self = StObject.set(x, "jvm", value.asInstanceOf[js.Any])
    
    inline def setNetwork_types(value: ClusterStatsClusterNetworkTypes): Self = StObject.set(x, "network_types", value.asInstanceOf[js.Any])
    
    inline def setOs(value: ClusterStatsClusterOperatingSystem): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setPackaging_types(value: js.Array[ClusterStatsNodePackagingType]): Self = StObject.set(x, "packaging_types", value.asInstanceOf[js.Any])
    
    inline def setPackaging_typesVarargs(value: ClusterStatsNodePackagingType*): Self = StObject.set(x, "packaging_types", js.Array(value*))
    
    inline def setPlugins(value: js.Array[PluginStats]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: PluginStats*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setProcess(value: ClusterStatsClusterProcess): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setVersions(value: js.Array[VersionString]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsVarargs(value: VersionString*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
