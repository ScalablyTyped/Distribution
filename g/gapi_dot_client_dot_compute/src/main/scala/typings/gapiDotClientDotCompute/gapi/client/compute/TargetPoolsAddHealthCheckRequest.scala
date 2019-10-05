package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPoolsAddHealthCheckRequest extends js.Object {
  /** The HttpHealthCheck to add to the target pool. */
  var healthChecks: js.UndefOr[js.Array[HealthCheckReference]] = js.undefined
}

object TargetPoolsAddHealthCheckRequest {
  @scala.inline
  def apply(healthChecks: js.Array[HealthCheckReference] = null): TargetPoolsAddHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks)
    __obj.asInstanceOf[TargetPoolsAddHealthCheckRequest]
  }
}

