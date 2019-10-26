package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVersionData extends js.Object {
  var attributes: js.UndefOr[CreateStorageDataAttributes] = js.undefined
  var relationships: js.UndefOr[CreateVersionDataRelationships] = js.undefined
  var `type`: String
}

object CreateVersionData {
  @scala.inline
  def apply(
    `type`: String,
    attributes: CreateStorageDataAttributes = null,
    relationships: CreateVersionDataRelationships = null
  ): CreateVersionData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (relationships != null) __obj.updateDynamic("relationships")(relationships)
    __obj.asInstanceOf[CreateVersionData]
  }
}

