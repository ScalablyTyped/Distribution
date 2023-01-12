package typings.devtoolsProtocol.mod.Protocol.Accessibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAXNodeAndAncestorsResponse extends StObject {
  
  var nodes: js.Array[AXNode]
}
object GetAXNodeAndAncestorsResponse {
  
  inline def apply(nodes: js.Array[AXNode]): GetAXNodeAndAncestorsResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAXNodeAndAncestorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAXNodeAndAncestorsResponse] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
