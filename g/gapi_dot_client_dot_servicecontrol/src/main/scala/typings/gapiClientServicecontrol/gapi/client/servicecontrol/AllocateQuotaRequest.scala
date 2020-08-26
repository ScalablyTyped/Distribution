package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateQuotaRequest extends js.Object {
  /** Operation that describes the quota allocation. */
  var allocateOperation: js.UndefOr[QuotaOperation] = js.native
  /**
    * Specifies which version of service configuration should be used to process
    * the request. If unspecified or no matching version can be found, the latest
    * one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object AllocateQuotaRequest {
  @scala.inline
  def apply(): AllocateQuotaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateQuotaRequest]
  }
  @scala.inline
  implicit class AllocateQuotaRequestOps[Self <: AllocateQuotaRequest] (val x: Self) extends AnyVal {
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
    def setAllocateOperation(value: QuotaOperation): Self = this.set("allocateOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocateOperation: Self = this.set("allocateOperation", js.undefined)
    @scala.inline
    def setServiceConfigId(value: String): Self = this.set("serviceConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceConfigId: Self = this.set("serviceConfigId", js.undefined)
  }
  
}

