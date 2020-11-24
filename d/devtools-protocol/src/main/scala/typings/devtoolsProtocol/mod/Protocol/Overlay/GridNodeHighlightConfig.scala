package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridNodeHighlightConfig extends js.Object {
  
  /**
    * A descriptor for the highlight appearance.
    */
  var gridHighlightConfig: GridHighlightConfig = js.native
  
  /**
    * Identifier of the node to highlight.
    */
  var nodeId: NodeId = js.native
}
object GridNodeHighlightConfig {
  
  @scala.inline
  def apply(gridHighlightConfig: GridHighlightConfig, nodeId: NodeId): GridNodeHighlightConfig = {
    val __obj = js.Dynamic.literal(gridHighlightConfig = gridHighlightConfig.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridNodeHighlightConfig]
  }
  
  @scala.inline
  implicit class GridNodeHighlightConfigOps[Self <: GridNodeHighlightConfig] (val x: Self) extends AnyVal {
    
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
    def setGridHighlightConfig(value: GridHighlightConfig): Self = this.set("gridHighlightConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
  }
}
