package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoElementAddedEvent extends js.Object {
  
  /**
    * Pseudo element's parent element id.
    */
  var parentId: NodeId = js.native
  
  /**
    * The added pseudo element.
    */
  var pseudoElement: Node = js.native
}
object PseudoElementAddedEvent {
  
  @scala.inline
  def apply(parentId: NodeId, pseudoElement: Node): PseudoElementAddedEvent = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any], pseudoElement = pseudoElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementAddedEvent]
  }
  
  @scala.inline
  implicit class PseudoElementAddedEventOps[Self <: PseudoElementAddedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParentId(value: NodeId): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoElement(value: Node): Self = this.set("pseudoElement", value.asInstanceOf[js.Any])
  }
}
