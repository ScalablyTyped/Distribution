package typings.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterType extends js.Object {
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.undefined
  var filterId: js.UndefOr[js.Array[String]] = js.undefined
  var filterType: js.UndefOr[js.Array[String]] = js.undefined
  var filterVersionNumber: js.UndefOr[js.Array[Double]] = js.undefined
  var pageLimit: js.UndefOr[Double] = js.undefined
  var pageNumber: js.UndefOr[Double] = js.undefined
}

object AnonFilterType {
  @scala.inline
  def apply(
    filterExtensionType: js.Array[String] = null,
    filterId: js.Array[String] = null,
    filterType: js.Array[String] = null,
    filterVersionNumber: js.Array[Double] = null,
    pageLimit: Int | Double = null,
    pageNumber: Int | Double = null
  ): AnonFilterType = {
    val __obj = js.Dynamic.literal()
    if (filterExtensionType != null) __obj.updateDynamic("filterExtensionType")(filterExtensionType.asInstanceOf[js.Any])
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (filterVersionNumber != null) __obj.updateDynamic("filterVersionNumber")(filterVersionNumber.asInstanceOf[js.Any])
    if (pageLimit != null) __obj.updateDynamic("pageLimit")(pageLimit.asInstanceOf[js.Any])
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterType]
  }
}

