package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterOperatingSystemName extends StObject {
  
  var count: integer
  
  var name: Name
}
object ClusterStatsClusterOperatingSystemName {
  
  inline def apply(count: integer, name: Name): ClusterStatsClusterOperatingSystemName = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterOperatingSystemName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsClusterOperatingSystemName] (val x: Self) extends AnyVal {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
