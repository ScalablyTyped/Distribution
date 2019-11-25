package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSslProxiesSetBackendServiceRequest extends js.Object {
  /** The URL of the new BackendService resource for the targetSslProxy. */
  var service: js.UndefOr[String] = js.undefined
}

object TargetSslProxiesSetBackendServiceRequest {
  @scala.inline
  def apply(service: String = null): TargetSslProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetSslProxiesSetBackendServiceRequest]
  }
}

