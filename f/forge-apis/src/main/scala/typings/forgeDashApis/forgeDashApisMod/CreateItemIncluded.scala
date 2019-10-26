package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItemIncluded extends js.Object {
  var attributes: js.UndefOr[CreateStorageDataAttributes] = js.undefined
  var id: String
  var relationships: js.UndefOr[CreateItemRelationships] = js.undefined
  var `type`: String
}

object CreateItemIncluded {
  @scala.inline
  def apply(
    id: String,
    `type`: String,
    attributes: CreateStorageDataAttributes = null,
    relationships: CreateItemRelationships = null
  ): CreateItemIncluded = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (relationships != null) __obj.updateDynamic("relationships")(relationships)
    __obj.asInstanceOf[CreateItemIncluded]
  }
}

