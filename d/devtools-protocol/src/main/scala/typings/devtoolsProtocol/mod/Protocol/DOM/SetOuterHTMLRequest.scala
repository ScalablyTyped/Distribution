package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetOuterHTMLRequest extends StObject {
  
  /**
    * Id of the node to set markup for.
    */
  var nodeId: NodeId
  
  /**
    * Outer HTML markup to set.
    */
  var outerHTML: String
}
object SetOuterHTMLRequest {
  
  inline def apply(nodeId: NodeId, outerHTML: String): SetOuterHTMLRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOuterHTMLRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetOuterHTMLRequest] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setOuterHTML(value: String): Self = StObject.set(x, "outerHTML", value.asInstanceOf[js.Any])
  }
}
