package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheck extends js.Object {
  /** How often (in seconds) to send a health check. The default value is 5 seconds. */
  var checkIntervalSec: js.UndefOr[Double] = js.undefined
  /** [Output Only] Creation timestamp in 3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2. */
  var healthyThreshold: js.UndefOr[Double] = js.undefined
  var httpHealthCheck: js.UndefOr[HTTPHealthCheck] = js.undefined
  var httpsHealthCheck: js.UndefOr[HTTPSHealthCheck] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** Type of the resource. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  var sslHealthCheck: js.UndefOr[SSLHealthCheck] = js.undefined
  var tcpHealthCheck: js.UndefOr[TCPHealthCheck] = js.undefined
  /**
    * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than
    * checkIntervalSec.
    */
  var timeoutSec: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the type of the healthCheck, either TCP, SSL, HTTP or HTTPS. If not specified, the default is TCP. Exactly one of the protocol-specific
    * health check field must be specified, which must match type field.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2. */
  var unhealthyThreshold: js.UndefOr[Double] = js.undefined
}

object HealthCheck {
  @scala.inline
  def apply(
    checkIntervalSec: Int | Double = null,
    creationTimestamp: String = null,
    description: String = null,
    healthyThreshold: Int | Double = null,
    httpHealthCheck: HTTPHealthCheck = null,
    httpsHealthCheck: HTTPSHealthCheck = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    selfLink: String = null,
    sslHealthCheck: SSLHealthCheck = null,
    tcpHealthCheck: TCPHealthCheck = null,
    timeoutSec: Int | Double = null,
    `type`: String = null,
    unhealthyThreshold: Int | Double = null
  ): HealthCheck = {
    val __obj = js.Dynamic.literal()
    if (checkIntervalSec != null) __obj.updateDynamic("checkIntervalSec")(checkIntervalSec.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (healthyThreshold != null) __obj.updateDynamic("healthyThreshold")(healthyThreshold.asInstanceOf[js.Any])
    if (httpHealthCheck != null) __obj.updateDynamic("httpHealthCheck")(httpHealthCheck)
    if (httpsHealthCheck != null) __obj.updateDynamic("httpsHealthCheck")(httpsHealthCheck)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (sslHealthCheck != null) __obj.updateDynamic("sslHealthCheck")(sslHealthCheck)
    if (tcpHealthCheck != null) __obj.updateDynamic("tcpHealthCheck")(tcpHealthCheck)
    if (timeoutSec != null) __obj.updateDynamic("timeoutSec")(timeoutSec.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unhealthyThreshold != null) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheck]
  }
}

