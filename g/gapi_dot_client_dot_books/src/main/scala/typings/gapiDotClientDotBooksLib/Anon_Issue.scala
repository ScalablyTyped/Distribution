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

