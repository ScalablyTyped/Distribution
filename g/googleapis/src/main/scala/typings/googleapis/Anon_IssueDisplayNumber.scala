package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IssueDisplayNumber extends js.Object {
  var issueDisplayNumber: js.UndefOr[String] = js.native
  var issueOrderNumber: js.UndefOr[Double] = js.native
}

object Anon_IssueDisplayNumber {
  @scala.inline
  def apply(issueDisplayNumber: String = null, issueOrderNumber: Int | Double = null): Anon_IssueDisplayNumber = {
    val __obj = js.Dynamic.literal()
    if (issueDisplayNumber != null) __obj.updateDynamic("issueDisplayNumber")(issueDisplayNumber.asInstanceOf[js.Any])
    if (issueOrderNumber != null) __obj.updateDynamic("issueOrderNumber")(issueOrderNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IssueDisplayNumber]
  }
}

