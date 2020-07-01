package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueDisplayNumber extends js.Object {
  var issueDisplayNumber: js.UndefOr[String] = js.native
  var issueOrderNumber: js.UndefOr[Double] = js.native
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

