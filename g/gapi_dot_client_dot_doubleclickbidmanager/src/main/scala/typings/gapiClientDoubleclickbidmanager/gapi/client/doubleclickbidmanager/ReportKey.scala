package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportKey extends js.Object {
  /** Query ID. */
  var queryId: js.UndefOr[String] = js.native
  /** Report ID. */
  var reportId: js.UndefOr[String] = js.native
}

object ReportKey {
  @scala.inline
  def apply(): ReportKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportKey]
  }
  @scala.inline
  implicit class ReportKeyOps[Self <: ReportKey] (val x: Self) extends AnyVal {
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
    def setQueryId(value: String): Self = this.set("queryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryId: Self = this.set("queryId", js.undefined)
    @scala.inline
    def setReportId(value: String): Self = this.set("reportId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportId: Self = this.set("reportId", js.undefined)
  }
  
}

