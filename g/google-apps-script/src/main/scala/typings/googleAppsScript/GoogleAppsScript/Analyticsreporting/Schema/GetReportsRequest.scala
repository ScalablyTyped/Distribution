package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReportsRequest extends js.Object {
  var reportRequests: js.UndefOr[js.Array[ReportRequest]] = js.native
  var useResourceQuotas: js.UndefOr[Boolean] = js.native
}

object GetReportsRequest {
  @scala.inline
  def apply(): GetReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReportsRequest]
  }
  @scala.inline
  implicit class GetReportsRequestOps[Self <: GetReportsRequest] (val x: Self) extends AnyVal {
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
    def setReportRequestsVarargs(value: ReportRequest*): Self = this.set("reportRequests", js.Array(value :_*))
    @scala.inline
    def setReportRequests(value: js.Array[ReportRequest]): Self = this.set("reportRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportRequests: Self = this.set("reportRequests", js.undefined)
    @scala.inline
    def setUseResourceQuotas(value: Boolean): Self = this.set("useResourceQuotas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseResourceQuotas: Self = this.set("useResourceQuotas", js.undefined)
  }
  
}

