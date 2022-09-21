package typings.devtoolsProtocol.mod.Protocol.Accessibility

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AXRelatedNode extends StObject {
  
  /**
    * The BackendNodeId of the related DOM node.
    */
  var backendDOMNodeId: BackendNodeId
  
  /**
    * The IDRef value provided, if any.
    */
  var idref: js.UndefOr[String] = js.undefined
  
  /**
    * The text alternative of this node in the current context.
    */
  var text: js.UndefOr[String] = js.undefined
}
object AXRelatedNode {
  
  inline def apply(backendDOMNodeId: BackendNodeId): AXRelatedNode = {
    val __obj = js.Dynamic.literal(backendDOMNodeId = backendDOMNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AXRelatedNode]
  }
  
  extension [Self <: AXRelatedNode](x: Self) {
    
    inline def setBackendDOMNodeId(value: BackendNodeId): Self = StObject.set(x, "backendDOMNodeId", value.asInstanceOf[js.Any])
    
    inline def setIdref(value: String): Self = StObject.set(x, "idref", value.asInstanceOf[js.Any])
    
    inline def setIdrefUndefined: Self = StObject.set(x, "idref", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
