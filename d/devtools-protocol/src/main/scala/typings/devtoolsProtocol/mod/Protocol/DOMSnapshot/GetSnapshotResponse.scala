package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSnapshotResponse extends js.Object {
  
  /**
    * Whitelisted ComputedStyle properties for each node in the layout tree.
    */
  var computedStyles: js.Array[ComputedStyle] = js.native
  
  /**
    * The nodes in the DOM tree. The DOMNode at index 0 corresponds to the root document.
    */
  var domNodes: js.Array[DOMNode] = js.native
  
  /**
    * The nodes in the layout tree.
    */
  var layoutTreeNodes: js.Array[LayoutTreeNode] = js.native
}
object GetSnapshotResponse {
  
  @scala.inline
  def apply(
    computedStyles: js.Array[ComputedStyle],
    domNodes: js.Array[DOMNode],
    layoutTreeNodes: js.Array[LayoutTreeNode]
  ): GetSnapshotResponse = {
    val __obj = js.Dynamic.literal(computedStyles = computedStyles.asInstanceOf[js.Any], domNodes = domNodes.asInstanceOf[js.Any], layoutTreeNodes = layoutTreeNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotResponse]
  }
  
  @scala.inline
  implicit class GetSnapshotResponseOps[Self <: GetSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComputedStylesVarargs(value: ComputedStyle*): Self = this.set("computedStyles", js.Array(value :_*))
    
    @scala.inline
    def setComputedStyles(value: js.Array[ComputedStyle]): Self = this.set("computedStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomNodesVarargs(value: DOMNode*): Self = this.set("domNodes", js.Array(value :_*))
    
    @scala.inline
    def setDomNodes(value: js.Array[DOMNode]): Self = this.set("domNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutTreeNodesVarargs(value: LayoutTreeNode*): Self = this.set("layoutTreeNodes", js.Array(value :_*))
    
    @scala.inline
    def setLayoutTreeNodes(value: js.Array[LayoutTreeNode]): Self = this.set("layoutTreeNodes", value.asInstanceOf[js.Any])
  }
}
