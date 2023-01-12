package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsNodePackagingType extends StObject {
  
  var count: integer
  
  var flavor: String
  
  var `type`: String
}
object ClusterStatsNodePackagingType {
  
  inline def apply(count: integer, flavor: String, `type`: String): ClusterStatsNodePackagingType = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], flavor = flavor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsNodePackagingType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsNodePackagingType] (val x: Self) extends AnyVal {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setFlavor(value: String): Self = StObject.set(x, "flavor", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
