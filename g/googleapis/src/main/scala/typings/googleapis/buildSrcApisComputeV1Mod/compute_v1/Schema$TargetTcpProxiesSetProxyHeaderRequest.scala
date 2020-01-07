package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetTcpProxiesSetProxyHeaderRequest extends js.Object {
  /**
    * The new type of proxy header to append before sending data to the
    * backend. NONE or PROXY_V1 are allowed.
    */
  var proxyHeader: js.UndefOr[String] = js.native
}

object Schema$TargetTcpProxiesSetProxyHeaderRequest {
  @scala.inline
  def apply(proxyHeader: String = null): Schema$TargetTcpProxiesSetProxyHeaderRequest = {
    val __obj = js.Dynamic.literal()
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetTcpProxiesSetProxyHeaderRequest]
  }
}

