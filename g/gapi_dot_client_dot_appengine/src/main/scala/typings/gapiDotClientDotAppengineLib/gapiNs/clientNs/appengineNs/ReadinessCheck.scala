package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadinessCheck extends js.Object {
  /**
    * A maximum time limit on application initialization, measured from moment the application successfully replies to a healthcheck until it is ready to
    * serve traffic.
    */
  var appStartTimeout: js.UndefOr[java.lang.String] = js.undefined
  /** Interval between health checks. */
  var checkInterval: js.UndefOr[java.lang.String] = js.undefined
  /** Number of consecutive failed checks required before removing traffic. */
  var failureThreshold: js.UndefOr[scala.Double] = js.undefined
  /** Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com" */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** The request path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Number of consecutive successful checks required before receiving traffic. */
  var successThreshold: js.UndefOr[scala.Double] = js.undefined
  /** Time before the check is considered failed. */
  var timeout: js.UndefOr[java.lang.String] = js.undefined
}

object ReadinessCheck {
  @scala.inline
  def apply(
    appStartTimeout: java.lang.String = null,
    checkInterval: java.lang.String = null,
    failureThreshold: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    path: java.lang.String = null,
    successThreshold: scala.Int | scala.Double = null,
    timeout: java.lang.String = null
  ): ReadinessCheck = {
    val __obj = js.Dynamic.literal()
    if (appStartTimeout != null) __obj.updateDynamic("appStartTimeout")(appStartTimeout)
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval)
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    if (successThreshold != null) __obj.updateDynamic("successThreshold")(successThreshold.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[ReadinessCheck]
  }
}

