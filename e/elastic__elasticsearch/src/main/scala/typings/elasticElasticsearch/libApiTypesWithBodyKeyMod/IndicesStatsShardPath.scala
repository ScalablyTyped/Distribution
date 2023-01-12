package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsShardPath extends StObject {
  
  var data_path: String
  
  var is_custom_data_path: Boolean
  
  var state_path: String
}
object IndicesStatsShardPath {
  
  inline def apply(data_path: String, is_custom_data_path: Boolean, state_path: String): IndicesStatsShardPath = {
    val __obj = js.Dynamic.literal(data_path = data_path.asInstanceOf[js.Any], is_custom_data_path = is_custom_data_path.asInstanceOf[js.Any], state_path = state_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsShardPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesStatsShardPath] (val x: Self) extends AnyVal {
    
    inline def setData_path(value: String): Self = StObject.set(x, "data_path", value.asInstanceOf[js.Any])
    
    inline def setIs_custom_data_path(value: Boolean): Self = StObject.set(x, "is_custom_data_path", value.asInstanceOf[js.Any])
    
    inline def setState_path(value: String): Self = StObject.set(x, "state_path", value.asInstanceOf[js.Any])
  }
}
