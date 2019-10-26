package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItemData extends js.Object {
  var attributes: js.UndefOr[CreateStorageDataAttributes] = js.undefined
  var relationships: js.UndefOr[CreateItemDataRelationships] = js.undefined
  var `type`: String
}

object CreateItemData {
  @scala.inline
  def apply(
    `type`: String,
    attributes: CreateStorageDataAttributes = null,
    relationships: CreateItemDataRelationships = null
  ): CreateItemData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (relationships != null) __obj.updateDynamic("relationships")(relationships)
    __obj.asInstanceOf[CreateItemData]
  }
}

