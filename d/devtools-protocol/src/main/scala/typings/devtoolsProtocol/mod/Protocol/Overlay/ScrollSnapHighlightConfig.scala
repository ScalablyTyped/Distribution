package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollSnapHighlightConfig extends StObject {
  
  /**
    * Identifier of the node to highlight.
    */
  var nodeId: NodeId
  
  /**
    * A descriptor for the highlight appearance of scroll snap containers.
    */
  var scrollSnapContainerHighlightConfig: ScrollSnapContainerHighlightConfig
}
object ScrollSnapHighlightConfig {
  
  inline def apply(nodeId: NodeId, scrollSnapContainerHighlightConfig: ScrollSnapContainerHighlightConfig): ScrollSnapHighlightConfig = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], scrollSnapContainerHighlightConfig = scrollSnapContainerHighlightConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSnapHighlightConfig]
  }
  
  extension [Self <: ScrollSnapHighlightConfig](x: Self) {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setScrollSnapContainerHighlightConfig(value: ScrollSnapContainerHighlightConfig): Self = StObject.set(x, "scrollSnapContainerHighlightConfig", value.asInstanceOf[js.Any])
  }
}
