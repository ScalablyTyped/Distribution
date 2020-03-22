package typings.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterExtensionTypeFilterId extends js.Object {
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.undefined
  var filterId: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonFilterExtensionTypeFilterId {
  @scala.inline
  def apply(filterExtensionType: js.Array[String] = null, filterId: js.Array[String] = null): AnonFilterExtensionTypeFilterId = {
    val __obj = js.Dynamic.literal()
    if (filterExtensionType != null) __obj.updateDynamic("filterExtensionType")(filterExtensionType.asInstanceOf[js.Any])
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterExtensionTypeFilterId]
  }
}

