package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTcpProxiesSetProxyHeaderRequest extends js.Object {
  /** The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed. */
  var proxyHeader: js.UndefOr[String] = js.undefined
}

object TargetTcpProxiesSetProxyHeaderRequest {
  @scala.inline
  def apply(proxyHeader: String = null): TargetTcpProxiesSetProxyHeaderRequest = {
    val __obj = js.Dynamic.literal()
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader)
    __obj.asInstanceOf[TargetTcpProxiesSetProxyHeaderRequest]
  }
}

