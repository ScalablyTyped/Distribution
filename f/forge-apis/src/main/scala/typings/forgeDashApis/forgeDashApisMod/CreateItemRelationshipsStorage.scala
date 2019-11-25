package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItemRelationshipsStorage extends js.Object {
  var data: js.UndefOr[CreateItemRelationshipsStorageData] = js.undefined
}

object CreateItemRelationshipsStorage {
  @scala.inline
  def apply(data: CreateItemRelationshipsStorageData = null): CreateItemRelationshipsStorage = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemRelationshipsStorage]
  }
}

