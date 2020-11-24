package typings.devtoolsProtocol.mod.Protocol.Accessibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPartialAXTreeResponse extends js.Object {
  
  /**
    * The `Accessibility.AXNode` for this DOM node, if it exists, plus its ancestors, siblings and
    * children, if requested.
    */
  var nodes: js.Array[AXNode] = js.native
}
object GetPartialAXTreeResponse {
  
  @scala.inline
  def apply(nodes: js.Array[AXNode]): GetPartialAXTreeResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPartialAXTreeResponse]
  }
  
  @scala.inline
  implicit class GetPartialAXTreeResponseOps[Self <: GetPartialAXTreeResponse] (val x: Self) extends AnyVal {
    
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
    def setNodesVarargs(value: AXNode*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[AXNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
}
