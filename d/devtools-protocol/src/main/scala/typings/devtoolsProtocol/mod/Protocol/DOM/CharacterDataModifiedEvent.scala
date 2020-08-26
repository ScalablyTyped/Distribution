package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacterDataModifiedEvent extends js.Object {
  /**
    * New text value.
    */
  var characterData: String = js.native
  /**
    * Id of the node that has changed.
    */
  var nodeId: NodeId = js.native
}

object CharacterDataModifiedEvent {
  @scala.inline
  def apply(characterData: String, nodeId: NodeId): CharacterDataModifiedEvent = {
    val __obj = js.Dynamic.literal(characterData = characterData.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterDataModifiedEvent]
  }
  @scala.inline
  implicit class CharacterDataModifiedEventOps[Self <: CharacterDataModifiedEvent] (val x: Self) extends AnyVal {
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
    def setCharacterData(value: String): Self = this.set("characterData", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
  }
  
}

