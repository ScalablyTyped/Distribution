package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSLHealthCheck extends js.Object {
  /** The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535. */
  var port: js.UndefOr[Double] = js.native
  /** Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. */
  var portName: js.UndefOr[String] = js.native
  /** Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE. */
  var proxyHeader: js.UndefOr[String] = js.native
  /**
    * The application data to send once the SSL connection has been established (default value is empty). If both request and response are empty, the
    * connection establishment alone will indicate health. The request data can only be ASCII.
    */
  var request: js.UndefOr[String] = js.native
  /**
    * The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data
    * can only be ASCII.
    */
  var response: js.UndefOr[String] = js.native
}

object SSLHealthCheck {
  @scala.inline
  def apply(): SSLHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSLHealthCheck]
  }
  @scala.inline
  implicit class SSLHealthCheckOps[Self <: SSLHealthCheck] (val x: Self) extends AnyVal {
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
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

