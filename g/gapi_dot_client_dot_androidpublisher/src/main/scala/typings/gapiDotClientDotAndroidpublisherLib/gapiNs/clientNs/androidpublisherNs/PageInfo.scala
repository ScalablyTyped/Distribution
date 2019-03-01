package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  var resultPerPage: js.UndefOr[scala.Double] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  var totalResults: js.UndefOr[scala.Double] = js.undefined
}

object PageInfo {
  @scala.inline
  def apply(
    resultPerPage: scala.Int | scala.Double = null,
    startIndex: scala.Int | scala.Double = null,
    totalResults: scala.Int | scala.Double = null
  ): PageInfo = {
    val __obj = js.Dynamic.literal()
    if (resultPerPage != null) __obj.updateDynamic("resultPerPage")(resultPerPage.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
}

