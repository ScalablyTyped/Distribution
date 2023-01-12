package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerQueryHighlightConfig extends StObject {
  
  /**
    * A descriptor for the highlight appearance of container query containers.
    */
  var containerQueryContainerHighlightConfig: ContainerQueryContainerHighlightConfig
  
  /**
    * Identifier of the container node to highlight.
    */
  var nodeId: NodeId
}
object ContainerQueryHighlightConfig {
  
  inline def apply(containerQueryContainerHighlightConfig: ContainerQueryContainerHighlightConfig, nodeId: NodeId): ContainerQueryHighlightConfig = {
    val __obj = js.Dynamic.literal(containerQueryContainerHighlightConfig = containerQueryContainerHighlightConfig.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerQueryHighlightConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerQueryHighlightConfig] (val x: Self) extends AnyVal {
    
    inline def setContainerQueryContainerHighlightConfig(value: ContainerQueryContainerHighlightConfig): Self = StObject.set(x, "containerQueryContainerHighlightConfig", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
