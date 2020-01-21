package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIssue extends js.Object {
  /** List of issues. Applicable only for Collection Edition and Omnibus. */
  var issue: js.UndefOr[js.Array[AnonIssueDisplayNumber]] = js.undefined
  /** The book order number in the series. */
  var orderNumber: js.UndefOr[Double] = js.undefined
  /** The book type in the context of series. Examples - Single Issue, Collection Edition, etc. */
  var seriesBookType: js.UndefOr[String] = js.undefined
  /** The series id. */
  var seriesId: js.UndefOr[String] = js.undefined
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

