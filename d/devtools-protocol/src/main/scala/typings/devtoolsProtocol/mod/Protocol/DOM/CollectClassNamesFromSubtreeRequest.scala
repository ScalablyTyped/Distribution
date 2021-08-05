package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectClassNamesFromSubtreeRequest extends StObject {
  
  /**
    * Id of the node to collect class names.
    */
  var nodeId: NodeId
}
object CollectClassNamesFromSubtreeRequest {
  
  inline def apply(nodeId: NodeId): CollectClassNamesFromSubtreeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectClassNamesFromSubtreeRequest]
  }
  
  extension [Self <: CollectClassNamesFromSubtreeRequest](x: Self) {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
