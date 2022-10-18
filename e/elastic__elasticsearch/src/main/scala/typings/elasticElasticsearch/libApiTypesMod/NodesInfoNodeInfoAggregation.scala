package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoAggregation extends StObject {
  
  var types: js.Array[String]
}
object NodesInfoNodeInfoAggregation {
  
  inline def apply(types: js.Array[String]): NodesInfoNodeInfoAggregation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoAggregation]
  }
  
  extension [Self <: NodesInfoNodeInfoAggregation](x: Self) {
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
