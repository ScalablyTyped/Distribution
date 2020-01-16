package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandsBodyObjectData extends js.Object {
  var attributes: CommandsAttributesObject
  var relationships: CommandsRelationshipsObject
  var `type`: String
}

object CommandsBodyObjectData {
  @scala.inline
  def apply(attributes: CommandsAttributesObject, relationships: CommandsRelationshipsObject, `type`: String): CommandsBodyObjectData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsBodyObjectData]
  }
}

