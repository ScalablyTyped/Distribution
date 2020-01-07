package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Health checking configuration for VM instances. Unhealthy instances are
  * killed and replaced with new instances.
  */
@js.native
trait Schema$LivenessCheck extends js.Object {
  /**
    * Interval between health checks.
    */
  var checkInterval: js.UndefOr[String] = js.native
  /**
    * Number of consecutive failed checks required before considering the VM
    * unhealthy.
    */
  var failureThreshold: js.UndefOr[Double] = js.native
  /**
    * Host header to send when performing a HTTP Liveness check. Example:
    * &quot;myapp.appspot.com&quot;
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The initial delay before starting to execute the checks.
    */
  var initialDelay: js.UndefOr[String] = js.native
  /**
    * The request path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Number of consecutive successful checks required before considering the
    * VM healthy.
    */
  var successThreshold: js.UndefOr[Double] = js.native
  /**
    * Time before the check is considered failed.
    */
  var timeout: js.UndefOr[String] = js.native
}

object Schema$LivenessCheck {
  @scala.inline
  def apply(
    checkInterval: String = null,
    failureThreshold: Int | Double = null,
    host: String = null,
    initialDelay: String = null,
    path: String = null,
    successThreshold: Int | Double = null,
    timeout: String = null
  ): Schema$LivenessCheck = {
    val __obj = js.Dynamic.literal()
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (successThreshold != null) __obj.updateDynamic("successThreshold")(successThreshold.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LivenessCheck]
  }
}

