package typings.devtoolsProtocol.mod.Protocol.Accessibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryAXTreeResponse extends js.Object {
  
  /**
    * A list of `Accessibility.AXNode` matching the specified attributes,
    * including nodes that are ignored for accessibility.
    */
  var nodes: js.Array[AXNode] = js.native
}
object QueryAXTreeResponse {
  
  @scala.inline
  def apply(nodes: js.Array[AXNode]): QueryAXTreeResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAXTreeResponse]
  }
  
  @scala.inline
  implicit class QueryAXTreeResponseOps[Self <: QueryAXTreeResponse] (val x: Self) extends AnyVal {
    
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
