package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  var resultPerPage: js.UndefOr[Double] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var totalResults: js.UndefOr[Double] = js.undefined
}

object PageInfo {
  @scala.inline
  def apply(
    resultPerPage: Int | Double = null,
    startIndex: Int | Double = null,
    totalResults: Int | Double = null
  ): PageInfo = {
    val __obj = js.Dynamic.literal()
    if (resultPerPage != null) __obj.updateDynamic("resultPerPage")(resultPerPage.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
}

