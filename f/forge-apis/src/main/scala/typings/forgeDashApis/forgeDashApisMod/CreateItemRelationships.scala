package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItemRelationships extends js.Object {
  var storage: js.UndefOr[CreateItemRelationshipsStorage] = js.undefined
}

object CreateItemRelationships {
  @scala.inline
  def apply(storage: CreateItemRelationshipsStorage = null): CreateItemRelationships = {
    val __obj = js.Dynamic.literal()
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemRelationships]
  }
}

