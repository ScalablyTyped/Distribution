package typings.devtoolsProtocol.mod.Protocol.Accessibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFullAXTreeResponse extends StObject {
  
  var nodes: js.Array[AXNode]
}
object GetFullAXTreeResponse {
  
  inline def apply(nodes: js.Array[AXNode]): GetFullAXTreeResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFullAXTreeResponse]
  }
  
  extension [Self <: GetFullAXTreeResponse](x: Self) {
    
    inline def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
