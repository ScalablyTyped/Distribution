package typings.devtoolsProtocol.mod.Protocol.Accessibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAXTreeResponse extends StObject {
  
  /**
    * A list of `Accessibility.AXNode` matching the specified attributes,
    * including nodes that are ignored for accessibility.
    */
  var nodes: js.Array[AXNode]
}
object QueryAXTreeResponse {
  
  inline def apply(nodes: js.Array[AXNode]): QueryAXTreeResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAXTreeResponse]
  }
  
  extension [Self <: QueryAXTreeResponse](x: Self) {
    
    inline def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
