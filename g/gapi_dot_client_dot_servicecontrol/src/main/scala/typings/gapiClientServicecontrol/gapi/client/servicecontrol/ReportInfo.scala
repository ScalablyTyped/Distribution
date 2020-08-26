package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportInfo extends js.Object {
  /** The Operation.operation_id value from the request. */
  var operationId: js.UndefOr[String] = js.native
  /** Quota usage info when processing the `Operation`. */
  var quotaInfo: js.UndefOr[QuotaInfo] = js.native
}

object ReportInfo {
  @scala.inline
  def apply(): ReportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportInfo]
  }
  @scala.inline
  implicit class ReportInfoOps[Self <: ReportInfo] (val x: Self) extends AnyVal {
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
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setQuotaInfo(value: QuotaInfo): Self = this.set("quotaInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaInfo: Self = this.set("quotaInfo", js.undefined)
  }
  
}

