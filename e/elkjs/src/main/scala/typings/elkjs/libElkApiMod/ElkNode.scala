package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElkNode
  extends StObject
     with ElkShape {
  
  var children: js.UndefOr[js.Array[ElkNode]] = js.undefined
  
  var edges: js.UndefOr[js.Array[ElkExtendedEdge]] = js.undefined
  
  @JSName("id")
  var id_ElkNode: String
  
  var ports: js.UndefOr[js.Array[ElkPort]] = js.undefined
}
object ElkNode {
  
  inline def apply(id: String): ElkNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElkNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElkNode] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[ElkNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ElkNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setEdges(value: js.Array[ElkExtendedEdge]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setEdgesVarargs(value: ElkExtendedEdge*): Self = StObject.set(x, "edges", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: js.Array[ElkPort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: ElkPort*): Self = StObject.set(x, "ports", js.Array(value*))
  }
}
