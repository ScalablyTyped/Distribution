package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStorageDataRelationships extends js.Object {
  var target: js.UndefOr[CreateStorageDataRelationshipsTarget] = js.undefined
}

object CreateStorageDataRelationships {
  @scala.inline
  def apply(target: CreateStorageDataRelationshipsTarget = null): CreateStorageDataRelationships = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStorageDataRelationships]
  }
}

