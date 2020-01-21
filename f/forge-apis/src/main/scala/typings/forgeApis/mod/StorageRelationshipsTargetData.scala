package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageRelationshipsTargetData extends js.Object {
  var id: String
  var `type`: String
}

object StorageRelationshipsTargetData {
  @scala.inline
  def apply(id: String, `type`: String): StorageRelationshipsTargetData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageRelationshipsTargetData]
  }
}

