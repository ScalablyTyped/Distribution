package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterJvm extends StObject {
  
  var max_uptime_in_millis: DurationValue[UnitMillis]
  
  var mem: ClusterStatsClusterJvmMemory
  
  var threads: long
  
  var versions: js.Array[ClusterStatsClusterJvmVersion]
}
object ClusterStatsClusterJvm {
  
  inline def apply(
    max_uptime_in_millis: DurationValue[UnitMillis],
    mem: ClusterStatsClusterJvmMemory,
    threads: long,
    versions: js.Array[ClusterStatsClusterJvmVersion]
  ): ClusterStatsClusterJvm = {
    val __obj = js.Dynamic.literal(max_uptime_in_millis = max_uptime_in_millis.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterJvm]
  }
  
  extension [Self <: ClusterStatsClusterJvm](x: Self) {
    
    inline def setMax_uptime_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "max_uptime_in_millis", value.asInstanceOf[js.Any])
    
    inline def setMem(value: ClusterStatsClusterJvmMemory): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setThreads(value: long): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setVersions(value: js.Array[ClusterStatsClusterJvmVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsVarargs(value: ClusterStatsClusterJvmVersion*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
