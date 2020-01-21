package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItem extends js.Object {
  var data: js.UndefOr[CreateItemData] = js.undefined
  var included: js.Array[CreateItemIncluded]
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}

object CreateItem {
  @scala.inline
  def apply(
    included: js.Array[CreateItemIncluded],
    data: CreateItemData = null,
    jsonapi: JsonApiVersionJsonapi = null
  ): CreateItem = {
    val __obj = js.Dynamic.literal(included = included.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (jsonapi != null) __obj.updateDynamic("jsonapi")(jsonapi.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItem]
  }
}

