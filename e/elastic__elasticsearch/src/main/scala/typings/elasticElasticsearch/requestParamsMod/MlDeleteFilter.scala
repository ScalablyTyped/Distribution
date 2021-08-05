package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteFilter
  extends StObject
     with Generic {
  
  var filter_id: String
}
object MlDeleteFilter {
  
  inline def apply(filter_id: String): MlDeleteFilter = {
    val __obj = js.Dynamic.literal(filter_id = filter_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteFilter]
  }
  
  extension [Self <: MlDeleteFilter](x: Self) {
    
    inline def setFilter_id(value: String): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
  }
}
