package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IssueDisplayNumber extends js.Object {
  var issueDisplayNumber: js.UndefOr[java.lang.String] = js.undefined
  var issueOrderNumber: js.UndefOr[scala.Double] = js.undefined
}

object Anon_IssueDisplayNumber {
  @scala.inline
  def apply(issueDisplayNumber: java.lang.String = null, issueOrderNumber: scala.Int | scala.Double = null): Anon_IssueDisplayNumber = {
    val __obj = js.Dynamic.literal()
    if (issueDisplayNumber != null) __obj.updateDynamic("issueDisplayNumber")(issueDisplayNumber)
    if (issueOrderNumber != null) __obj.updateDynamic("issueOrderNumber")(issueOrderNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IssueDisplayNumber]
  }
}

