package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTcpProxiesSetBackendServiceRequest extends js.Object {
  /** The URL of the new BackendService resource for the targetTcpProxy. */
  var service: js.UndefOr[java.lang.String] = js.undefined
}

object TargetTcpProxiesSetBackendServiceRequest {
  @scala.inline
  def apply(service: java.lang.String = null): TargetTcpProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[TargetTcpProxiesSetBackendServiceRequest]
  }
}

