package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetTcpProxiesSetBackendServiceRequest extends js.Object {
  /**
    * The URL of the new BackendService resource for the targetTcpProxy.
    */
  var service: js.UndefOr[String] = js.native
}

object Schema$TargetTcpProxiesSetBackendServiceRequest {
  @scala.inline
  def apply(service: String = null): Schema$TargetTcpProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetTcpProxiesSetBackendServiceRequest]
  }
}

