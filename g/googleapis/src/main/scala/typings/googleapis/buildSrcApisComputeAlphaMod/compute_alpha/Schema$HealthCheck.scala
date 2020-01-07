package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An HealthCheck resource. This resource defines a template for how
  * individual virtual machines should be checked for health, via one of the
  * supported protocols.
  */
@js.native
trait Schema$HealthCheck extends js.Object {
  /**
    * How often (in seconds) to send a health check. The default value is 5
    * seconds.
    */
  var checkIntervalSec: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Creation timestamp in 3339 text format.
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
  var http2HealthCheck: js.UndefOr[Schema$HTTP2HealthCheck] = js.native
  var httpHealthCheck: js.UndefOr[Schema$HTTPHealthCheck] = js.native
  var httpsHealthCheck: js.UndefOr[Schema$HTTPSHealthCheck] = js.native
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
    * [Output Only] Region where the health check resides. Not applicable to
    * global health checks.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  var sslHealthCheck: js.UndefOr[Schema$SSLHealthCheck] = js.native
  var tcpHealthCheck: js.UndefOr[Schema$TCPHealthCheck] = js.native
  /**
    * How long (in seconds) to wait before claiming failure. The default value
    * is 5 seconds. It is invalid for timeoutSec to have greater value than
    * checkIntervalSec.
    */
  var timeoutSec: js.UndefOr[Double] = js.native
  /**
    * Specifies the type of the healthCheck, either TCP, SSL, HTTP or HTTPS. If
    * not specified, the default is TCP. Exactly one of the protocol-specific
    * health check field must be specified, which must match type field.
    */
  var `type`: js.UndefOr[String] = js.native
  var udpHealthCheck: js.UndefOr[Schema$UDPHealthCheck] = js.native
  /**
    * A so-far healthy instance will be marked unhealthy after this many
    * consecutive failures. The default value is 2.
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.native
}

object Schema$HealthCheck {
  @scala.inline
  def apply(
    checkIntervalSec: Int | Double = null,
    creationTimestamp: String = null,
    description: String = null,
    healthyThreshold: Int | Double = null,
    http2HealthCheck: Schema$HTTP2HealthCheck = null,
    httpHealthCheck: Schema$HTTPHealthCheck = null,
    httpsHealthCheck: Schema$HTTPSHealthCheck = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    region: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    sslHealthCheck: Schema$SSLHealthCheck = null,
    tcpHealthCheck: Schema$TCPHealthCheck = null,
    timeoutSec: Int | Double = null,
    `type`: String = null,
    udpHealthCheck: Schema$UDPHealthCheck = null,
    unhealthyThreshold: Int | Double = null
  ): Schema$HealthCheck = {
    val __obj = js.Dynamic.literal()
    if (checkIntervalSec != null) __obj.updateDynamic("checkIntervalSec")(checkIntervalSec.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (healthyThreshold != null) __obj.updateDynamic("healthyThreshold")(healthyThreshold.asInstanceOf[js.Any])
    if (http2HealthCheck != null) __obj.updateDynamic("http2HealthCheck")(http2HealthCheck.asInstanceOf[js.Any])
    if (httpHealthCheck != null) __obj.updateDynamic("httpHealthCheck")(httpHealthCheck.asInstanceOf[js.Any])
    if (httpsHealthCheck != null) __obj.updateDynamic("httpsHealthCheck")(httpsHealthCheck.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (sslHealthCheck != null) __obj.updateDynamic("sslHealthCheck")(sslHealthCheck.asInstanceOf[js.Any])
    if (tcpHealthCheck != null) __obj.updateDynamic("tcpHealthCheck")(tcpHealthCheck.asInstanceOf[js.Any])
    if (timeoutSec != null) __obj.updateDynamic("timeoutSec")(timeoutSec.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (udpHealthCheck != null) __obj.updateDynamic("udpHealthCheck")(udpHealthCheck.asInstanceOf[js.Any])
    if (unhealthyThreshold != null) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HealthCheck]
  }
}

