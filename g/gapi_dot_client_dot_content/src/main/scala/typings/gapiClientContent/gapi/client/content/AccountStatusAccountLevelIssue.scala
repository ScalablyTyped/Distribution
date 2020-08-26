package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountStatusAccountLevelIssue extends js.Object {
  /** Country for which this issue is reported. */
  var country: js.UndefOr[String] = js.native
  /** Additional details about the issue. */
  var detail: js.UndefOr[String] = js.native
  /** Issue identifier. */
  var id: js.UndefOr[String] = js.native
  /** Severity of the issue. */
  var severity: js.UndefOr[String] = js.native
  /** Short description of the issue. */
  var title: js.UndefOr[String] = js.native
}

object AccountStatusAccountLevelIssue {
  @scala.inline
  def apply(): AccountStatusAccountLevelIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatusAccountLevelIssue]
  }
  @scala.inline
  implicit class AccountStatusAccountLevelIssueOps[Self <: AccountStatusAccountLevelIssue] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

