package typings.forgeApis.mod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (relationships != null) __obj.updateDynamic("relationships")(relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemIncluded]
  }
}

