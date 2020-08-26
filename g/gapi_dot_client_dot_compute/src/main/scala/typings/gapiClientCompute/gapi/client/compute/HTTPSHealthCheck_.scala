package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPSHealthCheck_ extends js.Object {
  /**
    * The value of the host header in the HTTPS health check request. If left empty (default value), the IP on behalf of which this health check is performed
    * will be used.
    */
  var host: js.UndefOr[String] = js.native
  /** The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535. */
  var port: js.UndefOr[Double] = js.native
  /** Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. */
  var portName: js.UndefOr[String] = js.native
  /** Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE. */
  var proxyHeader: js.UndefOr[String] = js.native
  /** The request path of the HTTPS health check request. The default value is /. */
  var requestPath: js.UndefOr[String] = js.native
}

object HTTPSHealthCheck_ {
  @scala.inline
  def apply(): HTTPSHealthCheck_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPSHealthCheck_]
  }
  @scala.inline
  implicit class HTTPSHealthCheck_Ops[Self <: HTTPSHealthCheck_] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPortName(value: String): Self = this.set("portName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortName: Self = this.set("portName", js.undefined)
    @scala.inline
    def setProxyHeader(value: String): Self = this.set("proxyHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyHeader: Self = this.set("proxyHeader", js.undefined)
    @scala.inline
    def setRequestPath(value: String): Self = this.set("requestPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPath: Self = this.set("requestPath", js.undefined)
  }
  
}

