package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyToResponse extends StObject {
  
  /**
    * Id of the node clone.
    */
  var nodeId: NodeId
}
object CopyToResponse {
  
  inline def apply(nodeId: NodeId): CopyToResponse = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyToResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyToResponse] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
