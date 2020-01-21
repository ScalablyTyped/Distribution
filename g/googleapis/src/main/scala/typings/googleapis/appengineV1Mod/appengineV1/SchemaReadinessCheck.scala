package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Readiness checking configuration for VM instances. Unhealthy instances are
  * removed from traffic rotation.
  */
@js.native
trait SchemaReadinessCheck extends js.Object {
  /**
    * A maximum time limit on application initialization, measured from moment
    * the application successfully replies to a healthcheck until it is ready
    * to serve traffic.
    */
  var appStartTimeout: js.UndefOr[String] = js.native
  /**
    * Interval between health checks.
    */
  var checkInterval: js.UndefOr[String] = js.native
  /**
    * Number of consecutive failed checks required before removing traffic.
    */
  var failureThreshold: js.UndefOr[Double] = js.native
  /**
    * Host header to send when performing a HTTP Readiness check. Example:
    * &quot;myapp.appspot.com&quot;
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The request path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Number of consecutive successful checks required before receiving
    * traffic.
    */
  var successThreshold: js.UndefOr[Double] = js.native
  /**
    * Time before the check is considered failed.
    */
  var timeout: js.UndefOr[String] = js.native
}

object SchemaReadinessCheck {
  @scala.inline
  def apply(
    appStartTimeout: String = null,
    checkInterval: String = null,
    failureThreshold: Int | Double = null,
    host: String = null,
    path: String = null,
    successThreshold: Int | Double = null,
    timeout: String = null
  ): SchemaReadinessCheck = {
    val __obj = js.Dynamic.literal()
    if (appStartTimeout != null) __obj.updateDynamic("appStartTimeout")(appStartTimeout.asInstanceOf[js.Any])
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (successThreshold != null) __obj.updateDynamic("successThreshold")(successThreshold.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReadinessCheck]
  }
}

