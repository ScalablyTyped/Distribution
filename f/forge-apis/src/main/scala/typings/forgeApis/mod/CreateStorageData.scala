package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStorageData extends js.Object {
  var attributes: js.UndefOr[CreateStorageDataAttributes] = js.undefined
  var relationships: js.UndefOr[CreateStorageDataRelationships] = js.undefined
  var `type`: String
}

object CreateStorageData {
  @scala.inline
  def apply(
    `type`: String,
    attributes: CreateStorageDataAttributes = null,
    relationships: CreateStorageDataRelationships = null
  ): CreateStorageData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (relationships != null) __obj.updateDynamic("relationships")(relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStorageData]
  }
}

