package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterDirectionFilterExtensionType extends js.Object {
  var filterDirection: js.UndefOr[String] = js.undefined
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.undefined
  var filterId: js.UndefOr[js.Array[String]] = js.undefined
  var filterRefType: js.UndefOr[String] = js.undefined
  var filterType: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_FilterDirectionFilterExtensionType {
  @scala.inline
  def apply(
    filterDirection: String = null,
    filterExtensionType: js.Array[String] = null,
    filterId: js.Array[String] = null,
    filterRefType: String = null,
    filterType: js.Array[String] = null
  ): Anon_FilterDirectionFilterExtensionType = {
    val __obj = js.Dynamic.literal()
    if (filterDirection != null) __obj.updateDynamic("filterDirection")(filterDirection)
    if (filterExtensionType != null) __obj.updateDynamic("filterExtensionType")(filterExtensionType)
    if (filterId != null) __obj.updateDynamic("filterId")(filterId)
    if (filterRefType != null) __obj.updateDynamic("filterRefType")(filterRefType)
    if (filterType != null) __obj.updateDynamic("filterType")(filterType)
    __obj.asInstanceOf[Anon_FilterDirectionFilterExtensionType]
  }
}

