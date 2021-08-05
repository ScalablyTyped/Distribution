package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackgroundColorsRequest extends StObject {
  
  /**
    * Id of the node to get background colors for.
    */
  var nodeId: NodeId
}
object GetBackgroundColorsRequest {
  
  inline def apply(nodeId: NodeId): GetBackgroundColorsRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackgroundColorsRequest]
  }
  
  extension [Self <: GetBackgroundColorsRequest](x: Self) {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
