package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Issue extends js.Object {
  /** List of issues. Applicable only for Collection Edition and Omnibus. */
  var issue: js.UndefOr[js.Array[Anon_IssueDisplayNumber]] = js.undefined
  /** The book order number in the series. */
  var orderNumber: js.UndefOr[Double] = js.undefined
  /** The book type in the context of series. Examples - Single Issue, Collection Edition, etc. */
  var seriesBookType: js.UndefOr[String] = js.undefined
  /** The series id. */
  var seriesId: js.UndefOr[String] = js.undefined
}

object Anon_Issue {
  @scala.inline
  def apply(
    issue: js.Array[Anon_IssueDisplayNumber] = null,
    orderNumber: Int | Double = null,
    seriesBookType: String = null,
    seriesId: String = null
  ): Anon_Issue = {
    val __obj = js.Dynamic.literal()
    if (issue != null) __obj.updateDynamic("issue")(issue)
    if (orderNumber != null) __obj.updateDynamic("orderNumber")(orderNumber.asInstanceOf[js.Any])
    if (seriesBookType != null) __obj.updateDynamic("seriesBookType")(seriesBookType)
    if (seriesId != null) __obj.updateDynamic("seriesId")(seriesId)
    __obj.asInstanceOf[Anon_Issue]
  }
}

