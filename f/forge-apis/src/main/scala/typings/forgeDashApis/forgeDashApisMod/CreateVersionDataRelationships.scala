package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVersionDataRelationships extends js.Object {
  var item: js.UndefOr[CreateVersionDataRelationshipsItem] = js.undefined
  var storage: js.UndefOr[CreateItemRelationshipsStorage] = js.undefined
}

object CreateVersionDataRelationships {
  @scala.inline
  def apply(item: CreateVersionDataRelationshipsItem = null, storage: CreateItemRelationshipsStorage = null): CreateVersionDataRelationships = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    __obj.asInstanceOf[CreateVersionDataRelationships]
  }
}

