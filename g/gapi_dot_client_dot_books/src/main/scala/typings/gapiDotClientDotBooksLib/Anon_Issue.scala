package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Issue extends js.Object {
  /** List of issues. Applicable only for Collection Edition and Omnibus. */
  var issue: js.UndefOr[js.Array[Anon_IssueDisplayNumber]] = js.undefined
  /** The book order number in the series. */
  var orderNumber: js.UndefOr[scala.Double] = js.undefined
  /** The book type in the context of series. Examples - Single Issue, Collection Edition, etc. */
  var seriesBookType: js.UndefOr[java.lang.String] = js.undefined
  /** The series id. */
  var seriesId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Issue {
  @scala.inline
  def apply(
    issue: js.Array[Anon_IssueDisplayNumber] = null,
    orderNumber: scala.Int | scala.Double = null,
    seriesBookType: java.lang.String = null,
    seriesId: java.lang.String = null
  ): Anon_Issue = {
    val __obj = js.Dynamic.literal()
    if (issue != null) __obj.updateDynamic("issue")(issue)
    if (orderNumber != null) __obj.updateDynamic("orderNumber")(orderNumber.asInstanceOf[js.Any])
    if (seriesBookType != null) __obj.updateDynamic("seriesBookType")(seriesBookType)
    if (seriesId != null) __obj.updateDynamic("seriesId")(seriesId)
    __obj.asInstanceOf[Anon_Issue]
  }
}

