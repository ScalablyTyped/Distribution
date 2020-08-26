package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetTcpProxiesSetProxyHeaderRequest extends js.Object {
  /** The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed. */
  var proxyHeader: js.UndefOr[String] = js.native
}

object TargetTcpProxiesSetProxyHeaderRequest {
  @scala.inline
  def apply(): TargetTcpProxiesSetProxyHeaderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetTcpProxiesSetProxyHeaderRequest]
  }
  @scala.inline
  implicit class TargetTcpProxiesSetProxyHeaderRequestOps[Self <: TargetTcpProxiesSetProxyHeaderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProxyHeader(value: String): Self = this.set("proxyHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyHeader: Self = this.set("proxyHeader", js.undefined)
  }
  
}

