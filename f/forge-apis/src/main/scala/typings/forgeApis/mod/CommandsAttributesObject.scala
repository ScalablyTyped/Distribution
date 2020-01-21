package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandsAttributesObject extends js.Object {
  var extension: CommandsAttributesExtensionObject
}

object CommandsAttributesObject {
  @scala.inline
  def apply(extension: CommandsAttributesExtensionObject): CommandsAttributesObject = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommandsAttributesObject]
  }
}

