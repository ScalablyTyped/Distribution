package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPHealthCheck_ extends js.Object {
  /**
    * The value of the host header in the HTTP health check request. If left empty (default value), the IP on behalf of which this health check is performed
    * will be used.
    */
  var host: js.UndefOr[String] = js.undefined
  /** The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535. */
  var port: js.UndefOr[Double] = js.undefined
  /** Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. */
  var portName: js.UndefOr[String] = js.undefined
  /** Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE. */
  var proxyHeader: js.UndefOr[String] = js.undefined
  /** The request path of the HTTP health check request. The default value is /. */
  var requestPath: js.UndefOr[String] = js.undefined
}

object HTTPHealthCheck_ {
  @scala.inline
  def apply(
    host: String = null,
    port: js.UndefOr[Double] = js.undefined,
    portName: String = null,
    proxyHeader: String = null,
    requestPath: String = null
  ): HTTPHealthCheck_ = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (portName != null) __obj.updateDynamic("portName")(portName.asInstanceOf[js.Any])
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader.asInstanceOf[js.Any])
    if (requestPath != null) __obj.updateDynamic("requestPath")(requestPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPHealthCheck_]
  }
}

