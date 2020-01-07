package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetSslProxiesSetProxyHeaderRequest extends js.Object {
  /**
    * The new type of proxy header to append before sending data to the
    * backend. NONE or PROXY_V1 are allowed.
    */
  var proxyHeader: js.UndefOr[String] = js.native
}

object Schema$TargetSslProxiesSetProxyHeaderRequest {
  @scala.inline
  def apply(proxyHeader: String = null): Schema$TargetSslProxiesSetProxyHeaderRequest = {
    val __obj = js.Dynamic.literal()
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetSslProxiesSetProxyHeaderRequest]
  }
}

