package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckRequest extends js.Object {
  /** The operation to be checked. */
  var operation: js.UndefOr[Operation] = js.native
  /** Requests the project settings to be returned as part of the check response. */
  var requestProjectSettings: js.UndefOr[Boolean] = js.native
  /**
    * Specifies which version of service configuration should be used to process
    * the request.
    *
    * If unspecified or no matching version can be found, the
    * latest one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
  /**
    * Indicates if service activation check should be skipped for this request.
    * Default behavior is to perform the check and apply relevant quota.
    */
  var skipActivationCheck: js.UndefOr[Boolean] = js.native
}

object CheckRequest {
  @scala.inline
  def apply(): CheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckRequest]
  }
  @scala.inline
  implicit class CheckRequestOps[Self <: CheckRequest] (val x: Self) extends AnyVal {
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
    def setOperation(value: Operation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setRequestProjectSettings(value: Boolean): Self = this.set("requestProjectSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestProjectSettings: Self = this.set("requestProjectSettings", js.undefined)
    @scala.inline
    def setServiceConfigId(value: String): Self = this.set("serviceConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceConfigId: Self = this.set("serviceConfigId", js.undefined)
    @scala.inline
    def setSkipActivationCheck(value: Boolean): Self = this.set("skipActivationCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipActivationCheck: Self = this.set("skipActivationCheck", js.undefined)
  }
  
}

