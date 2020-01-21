package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTcpProxiesSetBackendServiceRequest extends js.Object {
  /** The URL of the new BackendService resource for the targetTcpProxy. */
  var service: js.UndefOr[String] = js.undefined
}

object TargetTcpProxiesSetBackendServiceRequest {
  @scala.inline
  def apply(service: String = null): TargetTcpProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTcpProxiesSetBackendServiceRequest]
  }
}

