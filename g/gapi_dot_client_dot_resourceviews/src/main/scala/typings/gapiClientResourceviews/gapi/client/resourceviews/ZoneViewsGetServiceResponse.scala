package typings.gapiClientResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneViewsGetServiceResponse extends js.Object {
  /** The service information. */
  var endpoints: js.UndefOr[js.Array[ServiceEndpoint]] = js.native
  /** The fingerprint of the service information. */
  var fingerprint: js.UndefOr[String] = js.native
}

object ZoneViewsGetServiceResponse {
  @scala.inline
  def apply(): ZoneViewsGetServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneViewsGetServiceResponse]
  }
  @scala.inline
  implicit class ZoneViewsGetServiceResponseOps[Self <: ZoneViewsGetServiceResponse] (val x: Self) extends AnyVal {
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
  }
  
}

