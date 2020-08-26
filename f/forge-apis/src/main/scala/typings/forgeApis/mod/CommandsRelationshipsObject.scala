package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandsRelationshipsObject extends js.Object {
  var resources: CommandsRelationshipsResourceObject = js.native
}

object CommandsRelationshipsObject {
  @scala.inline
  def apply(resources: CommandsRelationshipsResourceObject): CommandsRelationshipsObject = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsRelationshipsObject]
  }
  @scala.inline
  implicit class CommandsRelationshipsObjectOps[Self <: CommandsRelationshipsObject] (val x: Self) extends AnyVal {
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
    def setResources(value: CommandsRelationshipsResourceObject): Self = this.set("resources", value.asInstanceOf[js.Any])
  }
  
}

