package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterOperatingSystemArchitecture extends StObject {
  
  var arch: String
  
  var count: integer
}
object ClusterStatsClusterOperatingSystemArchitecture {
  
  inline def apply(arch: String, count: integer): ClusterStatsClusterOperatingSystemArchitecture = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterOperatingSystemArchitecture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsClusterOperatingSystemArchitecture] (val x: Self) extends AnyVal {
    
    inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
