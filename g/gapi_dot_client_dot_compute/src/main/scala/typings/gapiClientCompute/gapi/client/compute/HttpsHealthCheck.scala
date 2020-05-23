package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsHealthCheck extends js.Object {
  /** How often (in seconds) to send a health check. The default value is 5 seconds. */
  var checkIntervalSec: js.UndefOr[Double] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2. */
  var healthyThreshold: js.UndefOr[Double] = js.undefined
  /**
    * The value of the host header in the HTTPS health check request. If left empty (default value), the public IP on behalf of which this health check is
    * performed will be used.
    */
  var host: js.UndefOr[String] = js.undefined
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
  /** The TCP port number for the HTTPS health check request. The default value is 443. */
  var port: js.UndefOr[Double] = js.undefined
  /** The request path of the HTTPS health check request. The default value is "/". */
  var requestPath: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /**
    * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have a greater value than
    * checkIntervalSec.
    */
  var timeoutSec: js.UndefOr[Double] = js.undefined
  /** A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2. */
  var unhealthyThreshold: js.UndefOr[Double] = js.undefined
}

object HttpsHealthCheck {
  @scala.inline
  def apply(
    checkIntervalSec: js.UndefOr[Double] = js.undefined,
    creationTimestamp: String = null,
    description: String = null,
    healthyThreshold: js.UndefOr[Double] = js.undefined,
    host: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    port: js.UndefOr[Double] = js.undefined,
    requestPath: String = null,
    selfLink: String = null,
    timeoutSec: js.UndefOr[Double] = js.undefined,
    unhealthyThreshold: js.UndefOr[Double] = js.undefined
  ): HttpsHealthCheck = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkIntervalSec)) __obj.updateDynamic("checkIntervalSec")(checkIntervalSec.get.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(healthyThreshold)) __obj.updateDynamic("healthyThreshold")(healthyThreshold.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (requestPath != null) __obj.updateDynamic("requestPath")(requestPath.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutSec)) __obj.updateDynamic("timeoutSec")(timeoutSec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unhealthyThreshold)) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpsHealthCheck]
  }
}

