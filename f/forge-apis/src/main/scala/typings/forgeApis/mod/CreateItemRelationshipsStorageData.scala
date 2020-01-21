package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItemRelationshipsStorageData extends js.Object {
  var id: String
  var `type`: String
}

object CreateItemRelationshipsStorageData {
  @scala.inline
  def apply(id: String, `type`: String): CreateItemRelationshipsStorageData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemRelationshipsStorageData]
  }
}

