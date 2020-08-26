package typings.gapiClientResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneViewsSetServiceRequest extends js.Object {
  /** The service information to be updated. */
  var endpoints: js.UndefOr[js.Array[ServiceEndpoint]] = js.native
  /** Fingerprint of the service information; a hash of the contents. This field is used for optimistic locking when updating the service entries. */
  var fingerprint: js.UndefOr[String] = js.native
  /** The name of the resource if user wants to update the service information of the resource. */
  var resourceName: js.UndefOr[String] = js.native
}

object ZoneViewsSetServiceRequest {
  @scala.inline
  def apply(): ZoneViewsSetServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneViewsSetServiceRequest]
  }
  @scala.inline
  implicit class ZoneViewsSetServiceRequestOps[Self <: ZoneViewsSetServiceRequest] (val x: Self) extends AnyVal {
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
    def setEndpointsVarargs(value: ServiceEndpoint*): Self = this.set("endpoints", js.Array(value :_*))
    @scala.inline
    def setEndpoints(value: js.Array[ServiceEndpoint]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
  }
  
}

