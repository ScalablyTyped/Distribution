package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsolatedElementHighlightConfig extends StObject {
  
  /**
    * A descriptor for the highlight appearance of an element in isolation mode.
    */
  var isolationModeHighlightConfig: IsolationModeHighlightConfig
  
  /**
    * Identifier of the isolated element to highlight.
    */
  var nodeId: NodeId
}
object IsolatedElementHighlightConfig {
  
  inline def apply(isolationModeHighlightConfig: IsolationModeHighlightConfig, nodeId: NodeId): IsolatedElementHighlightConfig = {
    val __obj = js.Dynamic.literal(isolationModeHighlightConfig = isolationModeHighlightConfig.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsolatedElementHighlightConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsolatedElementHighlightConfig] (val x: Self) extends AnyVal {
    
    inline def setIsolationModeHighlightConfig(value: IsolationModeHighlightConfig): Self = StObject.set(x, "isolationModeHighlightConfig", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
