package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVersionDataRelationshipsItemData extends js.Object {
  var id: String
  var `type`: String
}

object CreateVersionDataRelationshipsItemData {
  @scala.inline
  def apply(id: String, `type`: String): CreateVersionDataRelationshipsItemData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVersionDataRelationshipsItemData]
  }
}

