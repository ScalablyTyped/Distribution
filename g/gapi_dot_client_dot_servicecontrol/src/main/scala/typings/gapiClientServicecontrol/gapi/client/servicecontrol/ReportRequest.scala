package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportRequest extends js.Object {
  /**
    * Operations to be reported.
    *
    * Typically the service should report one operation per request.
    * Putting multiple operations into a single request is allowed, but should
    * be used only when multiple operations are natually available at the time
    * of the report.
    *
    * If multiple operations are in a single request, the total request size
    * should be no larger than 1MB. See ReportResponse.report_errors for
    * partial failure behavior.
    */
  var operations: js.UndefOr[js.Array[Operation]] = js.native
  /**
    * Specifies which version of service config should be used to process the
    * request.
    *
    * If unspecified or no matching version can be found, the
    * latest one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object ReportRequest {
  @scala.inline
  def apply(): ReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRequest]
  }
  @scala.inline
  implicit class ReportRequestOps[Self <: ReportRequest] (val x: Self) extends AnyVal {
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
    def setOperationsVarargs(value: Operation*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: js.Array[Operation]): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    @scala.inline
    def setServiceConfigId(value: String): Self = this.set("serviceConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceConfigId: Self = this.set("serviceConfigId", js.undefined)
  }
  
}

