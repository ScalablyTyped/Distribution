package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterExtensionTypeFilterId extends js.Object {
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.undefined
  var filterId: js.UndefOr[js.Array[String]] = js.undefined
  var filterType: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_FilterExtensionTypeFilterId {
  @scala.inline
  def apply(
    filterExtensionType: js.Array[String] = null,
    filterId: js.Array[String] = null,
    filterType: js.Array[String] = null
  ): Anon_FilterExtensionTypeFilterId = {
    val __obj = js.Dynamic.literal()
    if (filterExtensionType != null) __obj.updateDynamic("filterExtensionType")(filterExtensionType)
    if (filterId != null) __obj.updateDynamic("filterId")(filterId)
    if (filterType != null) __obj.updateDynamic("filterType")(filterType)
    __obj.asInstanceOf[Anon_FilterExtensionTypeFilterId]
  }
}

