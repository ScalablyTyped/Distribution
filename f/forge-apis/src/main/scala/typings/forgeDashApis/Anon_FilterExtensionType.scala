package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterExtensionType extends js.Object {
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.undefined
  var filterId: js.UndefOr[js.Array[String]] = js.undefined
  var filterType: js.UndefOr[js.Array[String]] = js.undefined
  var pageLimit: js.UndefOr[Double] = js.undefined
  var pageNumber: js.UndefOr[Double] = js.undefined
}

object Anon_FilterExtensionType {
  @scala.inline
  def apply(
    filterExtensionType: js.Array[String] = null,
    filterId: js.Array[String] = null,
    filterType: js.Array[String] = null,
    pageLimit: Int | Double = null,
    pageNumber: Int | Double = null
  ): Anon_FilterExtensionType = {
    val __obj = js.Dynamic.literal()
    if (filterExtensionType != null) __obj.updateDynamic("filterExtensionType")(filterExtensionType)
    if (filterId != null) __obj.updateDynamic("filterId")(filterId)
    if (filterType != null) __obj.updateDynamic("filterType")(filterType)
    if (pageLimit != null) __obj.updateDynamic("pageLimit")(pageLimit.asInstanceOf[js.Any])
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FilterExtensionType]
  }
}

