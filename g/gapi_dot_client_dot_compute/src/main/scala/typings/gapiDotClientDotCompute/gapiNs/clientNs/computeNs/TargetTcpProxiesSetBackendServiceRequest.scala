package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

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
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[TargetTcpProxiesSetBackendServiceRequest]
  }
}

