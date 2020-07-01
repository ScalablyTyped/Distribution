package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Health checking configuration for VM instances. Unhealthy instances are
  * killed and replaced with new instances. Only applicable for instances in
  * App Engine flexible environment.
  */
@js.native
trait SchemaHealthCheck extends js.Object {
  /**
    * Interval between health checks.
    */
  var checkInterval: js.UndefOr[String] = js.native
  /**
    * Whether to explicitly disable health checks for this instance.
    */
  var disableHealthCheck: js.UndefOr[Boolean] = js.native
  /**
    * Number of consecutive successful health checks required before receiving
    * traffic.
    */
  var healthyThreshold: js.UndefOr[Double] = js.native
  /**
    * Host header to send when performing an HTTP health check. Example:
    * &quot;myapp.appspot.com&quot;
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Number of consecutive failed health checks required before an instance is
    * restarted.
    */
  var restartThreshold: js.UndefOr[Double] = js.native
  /**
    * Time before the health check is considered failed.
    */
  var timeout: js.UndefOr[String] = js.native
  /**
    * Number of consecutive failed health checks required before removing
    * traffic.
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.native
}

object SchemaHealthCheck {
  @scala.inline
  def apply(
    checkInterval: String = null,
    disableHealthCheck: js.UndefOr[Boolean] = js.undefined,
    healthyThreshold: js.UndefOr[Double] = js.undefined,
    host: String = null,
    restartThreshold: js.UndefOr[Double] = js.undefined,
    timeout: String = null,
    unhealthyThreshold: js.UndefOr[Double] = js.undefined
  ): SchemaHealthCheck = {
    val __obj = js.Dynamic.literal()
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHealthCheck)) __obj.updateDynamic("disableHealthCheck")(disableHealthCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(healthyThreshold)) __obj.updateDynamic("healthyThreshold")(healthyThreshold.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(restartThreshold)) __obj.updateDynamic("restartThreshold")(restartThreshold.get.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(unhealthyThreshold)) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHealthCheck]
  }
}

