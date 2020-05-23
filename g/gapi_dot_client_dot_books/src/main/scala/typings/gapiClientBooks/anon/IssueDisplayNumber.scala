package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueDisplayNumber extends js.Object {
  var issueDisplayNumber: js.UndefOr[String] = js.undefined
  var issueOrderNumber: js.UndefOr[Double] = js.undefined
}

object IssueDisplayNumber {
  @scala.inline
  def apply(issueDisplayNumber: String = null, issueOrderNumber: js.UndefOr[Double] = js.undefined): IssueDisplayNumber = {
    val __obj = js.Dynamic.literal()
    if (issueDisplayNumber != null) __obj.updateDynamic("issueDisplayNumber")(issueDisplayNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(issueOrderNumber)) __obj.updateDynamic("issueOrderNumber")(issueOrderNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueDisplayNumber]
  }
}

