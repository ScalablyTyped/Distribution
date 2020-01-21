package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetSslProxiesSetProxyHeaderRequest extends js.Object {
  /**
    * The new type of proxy header to append before sending data to the
    * backend. NONE or PROXY_V1 are allowed.
    */
  var proxyHeader: js.UndefOr[String] = js.native
}

object SchemaTargetSslProxiesSetProxyHeaderRequest {
  @scala.inline
  def apply(proxyHeader: String = null): SchemaTargetSslProxiesSetProxyHeaderRequest = {
    val __obj = js.Dynamic.literal()
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetSslProxiesSetProxyHeaderRequest]
  }
}

