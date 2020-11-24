package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoElementRemovedEvent extends js.Object {
  
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
  implicit class PseudoElementRemovedEventOps[Self <: PseudoElementRemovedEvent] (val x: Self) extends AnyVal {
    
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
    def setPseudoElementId(value: NodeId): Self = this.set("pseudoElementId", value.asInstanceOf[js.Any])
  }
}
