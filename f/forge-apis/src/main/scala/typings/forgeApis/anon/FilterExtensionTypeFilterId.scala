package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterExtensionTypeFilterId extends js.Object {
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.undefined
  var filterId: js.UndefOr[js.Array[String]] = js.undefined
}

object FilterExtensionTypeFilterId {
  @scala.inline
  def apply(filterExtensionType: js.Array[String] = null, filterId: js.Array[String] = null): FilterExtensionTypeFilterId = {
    val __obj = js.Dynamic.literal()
    if (filterExtensionType != null) __obj.updateDynamic("filterExtensionType")(filterExtensionType.asInstanceOf[js.Any])
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterExtensionTypeFilterId]
  }
}

