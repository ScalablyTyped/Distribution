package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFolderDataRelationshipsParentData extends js.Object {
  var id: String
  var `type`: String
}

object CreateFolderDataRelationshipsParentData {
  @scala.inline
  def apply(id: String, `type`: String): CreateFolderDataRelationshipsParentData = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreateFolderDataRelationshipsParentData]
  }
}

