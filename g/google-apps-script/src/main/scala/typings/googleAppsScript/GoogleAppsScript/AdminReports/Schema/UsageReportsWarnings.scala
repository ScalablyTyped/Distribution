package typings.googleAppsScript.GoogleAppsScript.AdminReports.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageReportsWarnings extends js.Object {
  var code: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Array[UsageReportsWarningsData]] = js.native
  var message: js.UndefOr[String] = js.native
}

object UsageReportsWarnings {
  @scala.inline
  def apply(): UsageReportsWarnings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageReportsWarnings]
  }
  @scala.inline
  implicit class UsageReportsWarningsOps[Self <: UsageReportsWarnings] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDataVarargs(value: UsageReportsWarningsData*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[UsageReportsWarningsData]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

