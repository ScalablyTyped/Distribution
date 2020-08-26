package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseQuotaRequest extends js.Object {
  /** Operation that describes the quota release. */
  var releaseOperation: js.UndefOr[QuotaOperation] = js.native
  /**
    * Specifies which version of service configuration should be used to process
    * the request. If unspecified or no matching version can be found, the latest
    * one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object ReleaseQuotaRequest {
  @scala.inline
  def apply(): ReleaseQuotaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseQuotaRequest]
  }
  @scala.inline
  implicit class ReleaseQuotaRequestOps[Self <: ReleaseQuotaRequest] (val x: Self) extends AnyVal {
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
    def setReleaseOperation(value: QuotaOperation): Self = this.set("releaseOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseOperation: Self = this.set("releaseOperation", js.undefined)
    @scala.inline
    def setServiceConfigId(value: String): Self = this.set("serviceConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceConfigId: Self = this.set("serviceConfigId", js.undefined)
  }
  
}

