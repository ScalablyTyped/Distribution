package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoElementAddedEvent extends StObject {
  
  /**
    * Pseudo element's parent element id.
    */
  var parentId: NodeId
  
  /**
    * The added pseudo element.
    */
  var pseudoElement: Node
}
object PseudoElementAddedEvent {
  
  @scala.inline
  def apply(parentId: NodeId, pseudoElement: Node): PseudoElementAddedEvent = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any], pseudoElement = pseudoElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementAddedEvent]
  }
  
  @scala.inline
  implicit class PseudoElementAddedEventMutableBuilder[Self <: PseudoElementAddedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentId(value: NodeId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoElement(value: Node): Self = StObject.set(x, "pseudoElement", value.asInstanceOf[js.Any])
  }
}
