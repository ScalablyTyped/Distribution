package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HealthCheck extends js.Object {
  /** How often (in seconds) to send a health check. The default value is 5 seconds. */
  var checkIntervalSec: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] Creation timestamp in 3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2. */
  var healthyThreshold: js.UndefOr[scala.Double] = js.undefined
  var httpHealthCheck: js.UndefOr[HTTPHealthCheck] = js.undefined
  var httpsHealthCheck: js.UndefOr[HTTPSHealthCheck] = js.undefined
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
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var sslHealthCheck: js.UndefOr[SSLHealthCheck] = js.undefined
  var tcpHealthCheck: js.UndefOr[TCPHealthCheck] = js.undefined
  /**
               * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than
               * checkIntervalSec.
               */
  var timeoutSec: js.UndefOr[scala.Double] = js.undefined
  /**
               * Specifies the type of the healthCheck, either TCP, SSL, HTTP or HTTPS. If not specified, the default is TCP. Exactly one of the protocol-specific
               * health check field must be specified, which must match type field.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2. */
  var unhealthyThreshold: js.UndefOr[scala.Double] = js.undefined
}

