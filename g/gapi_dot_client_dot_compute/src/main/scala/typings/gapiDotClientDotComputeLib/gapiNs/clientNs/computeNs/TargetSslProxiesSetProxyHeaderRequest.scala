package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSslProxiesSetProxyHeaderRequest extends js.Object {
  /** The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed. */
  var proxyHeader: js.UndefOr[java.lang.String] = js.undefined
}

object TargetSslProxiesSetProxyHeaderRequest {
  @scala.inline
  def apply(proxyHeader: java.lang.String = null): TargetSslProxiesSetProxyHeaderRequest = {
    val __obj = js.Dynamic.literal()
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader)
    __obj.asInstanceOf[TargetSslProxiesSetProxyHeaderRequest]
  }
}

