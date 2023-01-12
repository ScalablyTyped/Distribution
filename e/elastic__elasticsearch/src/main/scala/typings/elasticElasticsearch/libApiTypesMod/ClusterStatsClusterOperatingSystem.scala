package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterOperatingSystem extends StObject {
  
  var allocated_processors: integer
  
  var architectures: js.UndefOr[js.Array[ClusterStatsClusterOperatingSystemArchitecture]] = js.undefined
  
  var available_processors: integer
  
  var mem: ClusterStatsOperatingSystemMemoryInfo
  
  var names: js.Array[ClusterStatsClusterOperatingSystemName]
  
  var pretty_names: js.Array[ClusterStatsClusterOperatingSystemPrettyName]
}
object ClusterStatsClusterOperatingSystem {
  
  inline def apply(
    allocated_processors: integer,
    available_processors: integer,
    mem: ClusterStatsOperatingSystemMemoryInfo,
    names: js.Array[ClusterStatsClusterOperatingSystemName],
    pretty_names: js.Array[ClusterStatsClusterOperatingSystemPrettyName]
  ): ClusterStatsClusterOperatingSystem = {
    val __obj = js.Dynamic.literal(allocated_processors = allocated_processors.asInstanceOf[js.Any], available_processors = available_processors.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], pretty_names = pretty_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterOperatingSystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsClusterOperatingSystem] (val x: Self) extends AnyVal {
    
    inline def setAllocated_processors(value: integer): Self = StObject.set(x, "allocated_processors", value.asInstanceOf[js.Any])
    
    inline def setArchitectures(value: js.Array[ClusterStatsClusterOperatingSystemArchitecture]): Self = StObject.set(x, "architectures", value.asInstanceOf[js.Any])
    
    inline def setArchitecturesUndefined: Self = StObject.set(x, "architectures", js.undefined)
    
    inline def setArchitecturesVarargs(value: ClusterStatsClusterOperatingSystemArchitecture*): Self = StObject.set(x, "architectures", js.Array(value*))
    
    inline def setAvailable_processors(value: integer): Self = StObject.set(x, "available_processors", value.asInstanceOf[js.Any])
    
    inline def setMem(value: ClusterStatsOperatingSystemMemoryInfo): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[ClusterStatsClusterOperatingSystemName]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: ClusterStatsClusterOperatingSystemName*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setPretty_names(value: js.Array[ClusterStatsClusterOperatingSystemPrettyName]): Self = StObject.set(x, "pretty_names", value.asInstanceOf[js.Any])
    
    inline def setPretty_namesVarargs(value: ClusterStatsClusterOperatingSystemPrettyName*): Self = StObject.set(x, "pretty_names", js.Array(value*))
  }
}
