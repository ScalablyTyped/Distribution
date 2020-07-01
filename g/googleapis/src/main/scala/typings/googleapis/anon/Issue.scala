package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issue extends js.Object {
  var issue: js.UndefOr[js.Array[IssueDisplayNumber]] = js.native
  var orderNumber: js.UndefOr[Double] = js.native
  var seriesBookType: js.UndefOr[String] = js.native
  var seriesId: js.UndefOr[String] = js.native
}

object Issue {
  @scala.inline
  def apply(
    issue: js.Array[IssueDisplayNumber] = null,
    orderNumber: js.UndefOr[Double] = js.undefined,
    seriesBookType: String = null,
    seriesId: String = null
  ): Issue = {
    val __obj = js.Dynamic.literal()
    if (issue != null) __obj.updateDynamic("issue")(issue.asInstanceOf[js.Any])
    if (!js.isUndefined(orderNumber)) __obj.updateDynamic("orderNumber")(orderNumber.get.asInstanceOf[js.Any])
    if (seriesBookType != null) __obj.updateDynamic("seriesBookType")(seriesBookType.asInstanceOf[js.Any])
    if (seriesId != null) __obj.updateDynamic("seriesId")(seriesId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
}

