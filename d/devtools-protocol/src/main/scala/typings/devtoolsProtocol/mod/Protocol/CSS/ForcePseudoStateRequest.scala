package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForcePseudoStateRequest extends StObject {
  
  /**
    * Element pseudo classes to force when computing the element's style.
    */
  var forcedPseudoClasses: js.Array[String]
  
  /**
    * The element id for which to force the pseudo state.
    */
  var nodeId: NodeId
}
object ForcePseudoStateRequest {
  
  inline def apply(forcedPseudoClasses: js.Array[String], nodeId: NodeId): ForcePseudoStateRequest = {
    val __obj = js.Dynamic.literal(forcedPseudoClasses = forcedPseudoClasses.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcePseudoStateRequest]
  }
  
  extension [Self <: ForcePseudoStateRequest](x: Self) {
    
    inline def setForcedPseudoClasses(value: js.Array[String]): Self = StObject.set(x, "forcedPseudoClasses", value.asInstanceOf[js.Any])
    
    inline def setForcedPseudoClassesVarargs(value: String*): Self = StObject.set(x, "forcedPseudoClasses", js.Array(value*))
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
