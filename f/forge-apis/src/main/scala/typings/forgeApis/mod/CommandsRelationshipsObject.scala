package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandsRelationshipsObject extends js.Object {
  var resources: CommandsRelationshipsResourceObject
}

object CommandsRelationshipsObject {
  @scala.inline
  def apply(resources: CommandsRelationshipsResourceObject): CommandsRelationshipsObject = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommandsRelationshipsObject]
  }
}

