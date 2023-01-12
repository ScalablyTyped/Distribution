package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridNodeHighlightConfig extends StObject {
  
  /**
    * A descriptor for the highlight appearance.
    */
  var gridHighlightConfig: GridHighlightConfig
  
  /**
    * Identifier of the node to highlight.
    */
  var nodeId: NodeId
}
object GridNodeHighlightConfig {
  
  inline def apply(gridHighlightConfig: GridHighlightConfig, nodeId: NodeId): GridNodeHighlightConfig = {
    val __obj = js.Dynamic.literal(gridHighlightConfig = gridHighlightConfig.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridNodeHighlightConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridNodeHighlightConfig] (val x: Self) extends AnyVal {
    
    inline def setGridHighlightConfig(value: GridHighlightConfig): Self = StObject.set(x, "gridHighlightConfig", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
