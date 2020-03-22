package typings.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterId extends js.Object {
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.undefined
  var filterId: js.UndefOr[js.Array[String]] = js.undefined
  var filterType: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonFilterId {
  @scala.inline
  def apply(
    filterExtensionType: js.Array[String] = null,
    filterId: js.Array[String] = null,
    filterType: js.Array[String] = null
  ): AnonFilterId = {
    val __obj = js.Dynamic.literal()
    if (filterExtensionType != null) __obj.updateDynamic("filterExtensionType")(filterExtensionType.asInstanceOf[js.Any])
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterId]
  }
}

