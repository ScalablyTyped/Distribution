package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPSHealthCheck extends js.Object {
  /**
    * The value of the host header in the HTTPS health check request. If left empty (default value), the IP on behalf of which this health check is performed
    * will be used.
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535. */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. */
  var portName: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE. */
  var proxyHeader: js.UndefOr[java.lang.String] = js.undefined
  /** The request path of the HTTPS health check request. The default value is /. */
  var requestPath: js.UndefOr[java.lang.String] = js.undefined
}

trait HttpsHealthCheck extends js.Object {
  /** How often (in seconds) to send a health check. The default value is 5 seconds. */
  var checkIntervalSec: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2. */
  var healthyThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * The value of the host header in the HTTPS health check request. If left empty (default value), the public IP on behalf of which this health check is
    * performed will be used.
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the resource. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The TCP port number for the HTTPS health check request. The default value is 443. */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** The request path of the HTTPS health check request. The default value is "/". */
  var requestPath: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have a greater value than
    * checkIntervalSec.
    */
  var timeoutSec: js.UndefOr[scala.Double] = js.undefined
  /** A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2. */
  var unhealthyThreshold: js.UndefOr[scala.Double] = js.undefined
}

object HTTPSHealthCheck {
  @scala.inline
  def apply(
    host: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    portName: java.lang.String = null,
    proxyHeader: java.lang.String = null,
    requestPath: java.lang.String = null
  ): HTTPSHealthCheck = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (portName != null) __obj.updateDynamic("portName")(portName)
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader)
    if (requestPath != null) __obj.updateDynamic("requestPath")(requestPath)
    __obj.asInstanceOf[HTTPSHealthCheck]
  }
}

object HttpsHealthCheck {
  @scala.inline
  def apply(
    checkIntervalSec: scala.Int | scala.Double = null,
    creationTimestamp: java.lang.String = null,
    description: java.lang.String = null,
    healthyThreshold: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    requestPath: java.lang.String = null,
    selfLink: java.lang.String = null,
    timeoutSec: scala.Int | scala.Double = null,
    unhealthyThreshold: scala.Int | scala.Double = null
  ): HttpsHealthCheck = {
    val __obj = js.Dynamic.literal()
    if (checkIntervalSec != null) __obj.updateDynamic("checkIntervalSec")(checkIntervalSec.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (healthyThreshold != null) __obj.updateDynamic("healthyThreshold")(healthyThreshold.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (requestPath != null) __obj.updateDynamic("requestPath")(requestPath)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (timeoutSec != null) __obj.updateDynamic("timeoutSec")(timeoutSec.asInstanceOf[js.Any])
    if (unhealthyThreshold != null) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpsHealthCheck]
  }
}

