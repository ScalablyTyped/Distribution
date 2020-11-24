package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNodesForSubtreeByStyleRequest extends js.Object {
  
  /**
    * The style to filter nodes by (includes nodes if any of properties matches).
    */
  var computedStyles: js.Array[CSSComputedStyleProperty] = js.native
  
  /**
    * Node ID pointing to the root of a subtree.
    */
  var nodeId: NodeId = js.native
  
  /**
    * Whether or not iframes and shadow roots in the same target should be traversed when returning the
    * results (default is false).
    */
  var pierce: js.UndefOr[Boolean] = js.native
}
object GetNodesForSubtreeByStyleRequest {
  
  @scala.inline
  def apply(computedStyles: js.Array[CSSComputedStyleProperty], nodeId: NodeId): GetNodesForSubtreeByStyleRequest = {
    val __obj = js.Dynamic.literal(computedStyles = computedStyles.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNodesForSubtreeByStyleRequest]
  }
  
  @scala.inline
  implicit class GetNodesForSubtreeByStyleRequestOps[Self <: GetNodesForSubtreeByStyleRequest] (val x: Self) extends AnyVal {
    
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
    def setComputedStylesVarargs(value: CSSComputedStyleProperty*): Self = this.set("computedStyles", js.Array(value :_*))
    
    @scala.inline
    def setComputedStyles(value: js.Array[CSSComputedStyleProperty]): Self = this.set("computedStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPierce(value: Boolean): Self = this.set("pierce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePierce: Self = this.set("pierce", js.undefined)
  }
}
