package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$HTTPSHealthCheck extends js.Object {
  /**
    * The value of the host header in the HTTPS health check request. If left
    * empty (default value), the IP on behalf of which this health check is
    * performed will be used.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The TCP port number for the health check request. The default value is
    * 443. Valid values are 1 through 65535.
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
    * for health checking.   If not specified, HTTPS health check follows
    * behavior specified in port and portName fields.
    */
  var portSpecification: js.UndefOr[String] = js.native
  /**
    * Specifies the type of proxy header to append before sending data to the
    * backend, either NONE or PROXY_V1. The default is NONE.
    */
  var proxyHeader: js.UndefOr[String] = js.native
  /**
    * The request path of the HTTPS health check request. The default value is
    * /.
    */
  var requestPath: js.UndefOr[String] = js.native
  /**
    * The string to match anywhere in the first 1024 bytes of the response
    * body. If left empty (the default value), the status code determines
    * health. The response data can only be ASCII.
    */
  var response: js.UndefOr[String] = js.native
}

object Schema$HTTPSHealthCheck {
  @scala.inline
  def apply(
    host: String = null,
    port: Int | Double = null,
    portName: String = null,
    portSpecification: String = null,
    proxyHeader: String = null,
    requestPath: String = null,
    response: String = null
  ): Schema$HTTPSHealthCheck = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (portName != null) __obj.updateDynamic("portName")(portName.asInstanceOf[js.Any])
    if (portSpecification != null) __obj.updateDynamic("portSpecification")(portSpecification.asInstanceOf[js.Any])
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader.asInstanceOf[js.Any])
    if (requestPath != null) __obj.updateDynamic("requestPath")(requestPath.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HTTPSHealthCheck]
  }
}

/**
  * An HttpsHealthCheck resource. This resource defines a template for how
  * individual instances should be checked for health, via HTTPS.
  */
@js.native
trait Schema$HttpsHealthCheck extends js.Object {
  /**
    * How often (in seconds) to send a health check. The default value is 5
    * seconds.
    */
  var checkIntervalSec: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A so-far unhealthy instance will be marked healthy after this many
    * consecutive successes. The default value is 2.
    */
  var healthyThreshold: js.UndefOr[Double] = js.native
  /**
    * The value of the host header in the HTTPS health check request. If left
    * empty (default value), the public IP on behalf of which this health check
    * is performed will be used.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The TCP port number for the HTTPS health check request. The default value
    * is 443.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * The request path of the HTTPS health check request. The default value is
    * &quot;/&quot;.
    */
  var requestPath: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * How long (in seconds) to wait before claiming failure. The default value
    * is 5 seconds. It is invalid for timeoutSec to have a greater value than
    * checkIntervalSec.
    */
  var timeoutSec: js.UndefOr[Double] = js.native
  /**
    * A so-far healthy instance will be marked unhealthy after this many
    * consecutive failures. The default value is 2.
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.native
}

object Schema$HttpsHealthCheck {
  @scala.inline
  def apply(
    checkIntervalSec: Int | Double = null,
    creationTimestamp: String = null,
    description: String = null,
    healthyThreshold: Int | Double = null,
    host: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    port: Int | Double = null,
    requestPath: String = null,
    selfLink: String = null,
    timeoutSec: Int | Double = null,
    unhealthyThreshold: Int | Double = null
  ): Schema$HttpsHealthCheck = {
    val __obj = js.Dynamic.literal()
    if (checkIntervalSec != null) __obj.updateDynamic("checkIntervalSec")(checkIntervalSec.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (healthyThreshold != null) __obj.updateDynamic("healthyThreshold")(healthyThreshold.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (requestPath != null) __obj.updateDynamic("requestPath")(requestPath.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (timeoutSec != null) __obj.updateDynamic("timeoutSec")(timeoutSec.asInstanceOf[js.Any])
    if (unhealthyThreshold != null) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HttpsHealthCheck]
  }
}

