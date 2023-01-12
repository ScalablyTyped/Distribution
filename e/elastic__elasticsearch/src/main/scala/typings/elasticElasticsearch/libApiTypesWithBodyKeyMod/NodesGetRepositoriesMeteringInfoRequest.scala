package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesGetRepositoriesMeteringInfoRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var node_id: NodeIds
}
object NodesGetRepositoriesMeteringInfoRequest {
  
  inline def apply(node_id: NodeIds): NodesGetRepositoriesMeteringInfoRequest = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesGetRepositoriesMeteringInfoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesGetRepositoriesMeteringInfoRequest] (val x: Self) extends AnyVal {
    
    inline def setNode_id(value: NodeIds): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idVarargs(value: NodeId*): Self = StObject.set(x, "node_id", js.Array(value*))
  }
}
