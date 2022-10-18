package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterOperatingSystemPrettyName extends StObject {
  
  var count: integer
  
  var pretty_name: Name
}
object ClusterStatsClusterOperatingSystemPrettyName {
  
  inline def apply(count: integer, pretty_name: Name): ClusterStatsClusterOperatingSystemPrettyName = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], pretty_name = pretty_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterOperatingSystemPrettyName]
  }
  
  extension [Self <: ClusterStatsClusterOperatingSystemPrettyName](x: Self) {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setPretty_name(value: Name): Self = StObject.set(x, "pretty_name", value.asInstanceOf[js.Any])
  }
}
