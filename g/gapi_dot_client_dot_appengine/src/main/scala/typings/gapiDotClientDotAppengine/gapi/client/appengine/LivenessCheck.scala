package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LivenessCheck extends js.Object {
  /** Interval between health checks. */
  var checkInterval: js.UndefOr[String] = js.undefined
  /** Number of consecutive failed checks required before considering the VM unhealthy. */
  var failureThreshold: js.UndefOr[Double] = js.undefined
  /** Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com" */
  var host: js.UndefOr[String] = js.undefined
  /** The initial delay before starting to execute the checks. */
  var initialDelay: js.UndefOr[String] = js.undefined
  /** The request path. */
  var path: js.UndefOr[String] = js.undefined
  /** Number of consecutive successful checks required before considering the VM healthy. */
  var successThreshold: js.UndefOr[Double] = js.undefined
  /** Time before the check is considered failed. */
  var timeout: js.UndefOr[String] = js.undefined
}

object LivenessCheck {
  @scala.inline
  def apply(
    checkInterval: String = null,
    failureThreshold: Int | Double = null,
    host: String = null,
    initialDelay: String = null,
    path: String = null,
    successThreshold: Int | Double = null,
    timeout: String = null
  ): LivenessCheck = {
    val __obj = js.Dynamic.literal()
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (successThreshold != null) __obj.updateDynamic("successThreshold")(successThreshold.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivenessCheck]
  }
}

