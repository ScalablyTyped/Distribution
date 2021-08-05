package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoElementRemovedEvent extends StObject {
  
  /**
    * Pseudo element's parent element id.
    */
  var parentId: NodeId
  
  /**
    * The removed pseudo element id.
    */
  var pseudoElementId: NodeId
}
object PseudoElementRemovedEvent {
  
  inline def apply(parentId: NodeId, pseudoElementId: NodeId): PseudoElementRemovedEvent = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any], pseudoElementId = pseudoElementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementRemovedEvent]
  }
  
  extension [Self <: PseudoElementRemovedEvent](x: Self) {
    
    inline def setParentId(value: NodeId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setPseudoElementId(value: NodeId): Self = StObject.set(x, "pseudoElementId", value.asInstanceOf[js.Any])
  }
}
