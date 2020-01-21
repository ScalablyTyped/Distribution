package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIssue extends js.Object {
  var issue: js.UndefOr[js.Array[AnonIssueDisplayNumber]] = js.native
  var orderNumber: js.UndefOr[Double] = js.native
  var seriesBookType: js.UndefOr[String] = js.native
  var seriesId: js.UndefOr[String] = js.native
}

object AnonIssue {
  @scala.inline
  def apply(
    issue: js.Array[AnonIssueDisplayNumber] = null,
    orderNumber: Int | Double = null,
    seriesBookType: String = null,
    seriesId: String = null
  ): AnonIssue = {
    val __obj = js.Dynamic.literal()
    if (issue != null) __obj.updateDynamic("issue")(issue.asInstanceOf[js.Any])
    if (orderNumber != null) __obj.updateDynamic("orderNumber")(orderNumber.asInstanceOf[js.Any])
    if (seriesBookType != null) __obj.updateDynamic("seriesBookType")(seriesBookType.asInstanceOf[js.Any])
    if (seriesId != null) __obj.updateDynamic("seriesId")(seriesId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIssue]
  }
}

