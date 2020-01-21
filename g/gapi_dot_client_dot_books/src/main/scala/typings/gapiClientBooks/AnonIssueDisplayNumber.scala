package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIssueDisplayNumber extends js.Object {
  var issueDisplayNumber: js.UndefOr[String] = js.undefined
  var issueOrderNumber: js.UndefOr[Double] = js.undefined
}

object AnonIssueDisplayNumber {
  @scala.inline
  def apply(issueDisplayNumber: String = null, issueOrderNumber: Int | Double = null): AnonIssueDisplayNumber = {
    val __obj = js.Dynamic.literal()
    if (issueDisplayNumber != null) __obj.updateDynamic("issueDisplayNumber")(issueDisplayNumber.asInstanceOf[js.Any])
    if (issueOrderNumber != null) __obj.updateDynamic("issueOrderNumber")(issueOrderNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIssueDisplayNumber]
  }
}

