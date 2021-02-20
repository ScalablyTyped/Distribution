package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoElementRemovedEvent extends StObject {
  
  /**
    * Pseudo element's parent element id.
    */
  var parentId: NodeId = js.native
  
  /**
    * The removed pseudo element id.
    */
  var pseudoElementId: NodeId = js.native
}
object PseudoElementRemovedEvent {
  
  @scala.inline
  def apply(parentId: NodeId, pseudoElementId: NodeId): PseudoElementRemovedEvent = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any], pseudoElementId = pseudoElementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementRemovedEvent]
  }
  
  @scala.inline
  implicit class PseudoElementRemovedEventMutableBuilder[Self <: PseudoElementRemovedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentId(value: NodeId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoElementId(value: NodeId): Self = StObject.set(x, "pseudoElementId", value.asInstanceOf[js.Any])
  }
}
