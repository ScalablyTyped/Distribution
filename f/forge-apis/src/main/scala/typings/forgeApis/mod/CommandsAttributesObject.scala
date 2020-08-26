package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandsAttributesObject extends js.Object {
  var extension: CommandsAttributesExtensionObject = js.native
}

object CommandsAttributesObject {
  @scala.inline
  def apply(extension: CommandsAttributesExtensionObject): CommandsAttributesObject = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsAttributesObject]
  }
  @scala.inline
  implicit class CommandsAttributesObjectOps[Self <: CommandsAttributesObject] (val x: Self) extends AnyVal {
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
    def setExtension(value: CommandsAttributesExtensionObject): Self = this.set("extension", value.asInstanceOf[js.Any])
  }
  
}

