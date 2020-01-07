package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TCPHealthCheck extends js.Object {
  /**
    * The TCP port number for the health check request. The default value
    * is 80. Valid values are 1 through 65535.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Port name as defined in InstanceGroup#NamedPort#name. If both port and
    * port_name are defined, port takes precedence.
    */
  var portName: js.UndefOr[String] = js.native
  /**
    * Specifies how port is selected for health checking, can be one of
    * following values: USE_FIXED_PORT: The port number in port is used for
    * health checking. USE_NAMED_PORT: The portName is used for health
    * checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified
    * for each network endpoint is used for health checking. For other
    * backends, the port or named port specified in the Backend Service is used
    * for health checking.   If not specified, TCP health check follows
    * behavior specified in port and portName fields.
    */
  var portSpecification: js.UndefOr[String] = js.native
  /**
    * Specifies the type of proxy header to append before sending data to the
    * backend, either NONE or PROXY_V1. The default is NONE.
    */
  var proxyHeader: js.UndefOr[String] = js.native
  /**
    * The application data to send once the TCP connection has been established
    * (default value is empty). If both request and response are empty, the
    * connection establishment alone will indicate health. The request data can
    * only be ASCII.
    */
  var request: js.UndefOr[String] = js.native
  /**
    * The bytes to match against the beginning of the response data. If left
    * empty (the default value), any response will indicate health. The
    * response data can only be ASCII.
    */
  var response: js.UndefOr[String] = js.native
}

object Schema$TCPHealthCheck {
  @scala.inline
  def apply(
    port: Int | Double = null,
    portName: String = null,
    portSpecification: String = null,
    proxyHeader: String = null,
    request: String = null,
    response: String = null
  ): Schema$TCPHealthCheck = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (portName != null) __obj.updateDynamic("portName")(portName.asInstanceOf[js.Any])
    if (portSpecification != null) __obj.updateDynamic("portSpecification")(portSpecification.asInstanceOf[js.Any])
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TCPHealthCheck]
  }
}

