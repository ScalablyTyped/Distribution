package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckResponse extends js.Object {
  /**
    * Indicate the decision of the check.
    *
    * If no check errors are present, the service should process the operation.
    * Otherwise the service should use the list of errors to determine the
    * appropriate action.
    */
  var checkErrors: js.UndefOr[js.Array[CheckError]] = js.native
  /** Feedback data returned from the server during processing a Check request. */
  var checkInfo: js.UndefOr[CheckInfo] = js.native
  /**
    * The same operation_id value used in the CheckRequest.
    * Used for logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.native
  /** Quota information for the check request associated with this response. */
  var quotaInfo: js.UndefOr[QuotaInfo] = js.native
  /** The actual config id used to process the request. */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object CheckResponse {
  @scala.inline
  def apply(): CheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckResponse]
  }
  @scala.inline
  implicit class CheckResponseOps[Self <: CheckResponse] (val x: Self) extends AnyVal {
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
    def setCheckErrorsVarargs(value: CheckError*): Self = this.set("checkErrors", js.Array(value :_*))
    @scala.inline
    def setCheckErrors(value: js.Array[CheckError]): Self = this.set("checkErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckErrors: Self = this.set("checkErrors", js.undefined)
    @scala.inline
    def setCheckInfo(value: CheckInfo): Self = this.set("checkInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckInfo: Self = this.set("checkInfo", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setQuotaInfo(value: QuotaInfo): Self = this.set("quotaInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaInfo: Self = this.set("quotaInfo", js.undefined)
    @scala.inline
    def setServiceConfigId(value: String): Self = this.set("serviceConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceConfigId: Self = this.set("serviceConfigId", js.undefined)
  }
  
}

