package typings.forgeDashApis.forgeDashApisMod

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
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StorageRelationshipsTargetData]
  }
}

