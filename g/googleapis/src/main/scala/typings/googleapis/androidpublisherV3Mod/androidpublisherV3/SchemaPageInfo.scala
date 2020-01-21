package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPageInfo extends js.Object {
  var resultPerPage: js.UndefOr[Double] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var totalResults: js.UndefOr[Double] = js.native
}

object SchemaPageInfo {
  @scala.inline
  def apply(
    resultPerPage: Int | Double = null,
    startIndex: Int | Double = null,
    totalResults: Int | Double = null
  ): SchemaPageInfo = {
    val __obj = js.Dynamic.literal()
    if (resultPerPage != null) __obj.updateDynamic("resultPerPage")(resultPerPage.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPageInfo]
  }
}

