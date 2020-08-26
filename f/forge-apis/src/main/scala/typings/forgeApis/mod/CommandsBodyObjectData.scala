package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandsBodyObjectData extends js.Object {
  var attributes: CommandsAttributesObject = js.native
  var relationships: CommandsRelationshipsObject = js.native
  var `type`: String = js.native
}

object CommandsBodyObjectData {
  @scala.inline
  def apply(attributes: CommandsAttributesObject, relationships: CommandsRelationshipsObject, `type`: String): CommandsBodyObjectData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsBodyObjectData]
  }
  @scala.inline
  implicit class CommandsBodyObjectDataOps[Self <: CommandsBodyObjectData] (val x: Self) extends AnyVal {
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
    def setAttributes(value: CommandsAttributesObject): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelationships(value: CommandsRelationshipsObject): Self = this.set("relationships", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

