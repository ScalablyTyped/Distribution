package typings.devtoolsProtocol.mod.Protocol.Accessibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPartialAXTreeResponse extends StObject {
  
  /**
    * The `Accessibility.AXNode` for this DOM node, if it exists, plus its ancestors, siblings and
    * children, if requested.
    */
  var nodes: js.Array[AXNode]
}
object GetPartialAXTreeResponse {
  
  inline def apply(nodes: js.Array[AXNode]): GetPartialAXTreeResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPartialAXTreeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPartialAXTreeResponse] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
