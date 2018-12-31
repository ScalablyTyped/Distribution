package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheck extends js.Object {
  /** Interval between health checks. */
  var checkInterval: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to explicitly disable health checks for this instance. */
  var disableHealthCheck: js.UndefOr[scala.Boolean] = js.undefined
  /** Number of consecutive successful health checks required before receiving traffic. */
  var healthyThreshold: js.UndefOr[scala.Double] = js.undefined
  /** Host header to send when performing an HTTP health check. Example: "myapp.appspot.com" */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** Number of consecutive failed health checks required before an instance is restarted. */
  var restartThreshold: js.UndefOr[scala.Double] = js.undefined
  /** Time before the health check is considered failed. */
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  /** Number of consecutive failed health checks required before removing traffic. */
  var unhealthyThreshold: js.UndefOr[scala.Double] = js.undefined
}

