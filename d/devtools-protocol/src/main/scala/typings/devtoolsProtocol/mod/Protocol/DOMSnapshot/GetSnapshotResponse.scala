package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSnapshotResponse extends StObject {
  
  /**
    * Whitelisted ComputedStyle properties for each node in the layout tree.
    */
  var computedStyles: js.Array[ComputedStyle]
  
  /**
    * The nodes in the DOM tree. The DOMNode at index 0 corresponds to the root document.
    */
  var domNodes: js.Array[DOMNode]
  
  /**
    * The nodes in the layout tree.
    */
  var layoutTreeNodes: js.Array[LayoutTreeNode]
}
object GetSnapshotResponse {
  
  inline def apply(
    computedStyles: js.Array[ComputedStyle],
    domNodes: js.Array[DOMNode],
    layoutTreeNodes: js.Array[LayoutTreeNode]
  ): GetSnapshotResponse = {
    val __obj = js.Dynamic.literal(computedStyles = computedStyles.asInstanceOf[js.Any], domNodes = domNodes.asInstanceOf[js.Any], layoutTreeNodes = layoutTreeNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotResponse]
  }
  
  extension [Self <: GetSnapshotResponse](x: Self) {
    
    inline def setComputedStyles(value: js.Array[ComputedStyle]): Self = StObject.set(x, "computedStyles", value.asInstanceOf[js.Any])
    
    inline def setComputedStylesVarargs(value: ComputedStyle*): Self = StObject.set(x, "computedStyles", js.Array(value :_*))
    
    inline def setDomNodes(value: js.Array[DOMNode]): Self = StObject.set(x, "domNodes", value.asInstanceOf[js.Any])
    
    inline def setDomNodesVarargs(value: DOMNode*): Self = StObject.set(x, "domNodes", js.Array(value :_*))
    
    inline def setLayoutTreeNodes(value: js.Array[LayoutTreeNode]): Self = StObject.set(x, "layoutTreeNodes", value.asInstanceOf[js.Any])
    
    inline def setLayoutTreeNodesVarargs(value: LayoutTreeNode*): Self = StObject.set(x, "layoutTreeNodes", js.Array(value :_*))
  }
}
