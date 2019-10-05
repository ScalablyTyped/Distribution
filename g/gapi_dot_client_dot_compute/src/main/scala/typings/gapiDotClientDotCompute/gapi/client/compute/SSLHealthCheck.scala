package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSLHealthCheck extends js.Object {
  /** The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535. */
  var port: js.UndefOr[Double] = js.undefined
  /** Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. */
  var portName: js.UndefOr[String] = js.undefined
  /** Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE. */
  var proxyHeader: js.UndefOr[String] = js.undefined
  /**
    * The application data to send once the SSL connection has been established (default value is empty). If both request and response are empty, the
    * connection establishment alone will indicate health. The request data can only be ASCII.
    */
  var request: js.UndefOr[String] = js.undefined
  /**
    * The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data
    * can only be ASCII.
    */
  var response: js.UndefOr[String] = js.undefined
}

object SSLHealthCheck {
  @scala.inline
  def apply(
    port: Int | Double = null,
    portName: String = null,
    proxyHeader: String = null,
    request: String = null,
    response: String = null
  ): SSLHealthCheck = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (portName != null) __obj.updateDynamic("portName")(portName)
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader)
    if (request != null) __obj.updateDynamic("request")(request)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[SSLHealthCheck]
  }
}

