package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStorageDataRelationshipsTarget extends js.Object {
  var data: js.UndefOr[StorageRelationshipsTargetData] = js.undefined
}

object CreateStorageDataRelationshipsTarget {
  @scala.inline
  def apply(data: StorageRelationshipsTargetData = null): CreateStorageDataRelationshipsTarget = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStorageDataRelationshipsTarget]
  }
}

