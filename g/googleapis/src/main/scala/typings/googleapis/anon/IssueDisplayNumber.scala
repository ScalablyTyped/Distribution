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
  def apply(): IssueDisplayNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssueDisplayNumber]
  }
  @scala.inline
  implicit class IssueDisplayNumberOps[Self <: IssueDisplayNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIssueDisplayNumber(value: String): Self = this.set("issueDisplayNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssueDisplayNumber: Self = this.set("issueDisplayNumber", js.undefined)
    @scala.inline
    def setIssueOrderNumber(value: Double): Self = this.set("issueOrderNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssueOrderNumber: Self = this.set("issueOrderNumber", js.undefined)
  }
  
}

