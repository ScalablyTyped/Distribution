package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPoolsRemoveHealthCheckRequest extends js.Object {
  /**
    * Health check URL to be removed. This can be a full or valid partial URL. For example, the following are valid URLs:
    * - https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check
    * - projects/project/global/httpHealthChecks/health-check
    * - global/httpHealthChecks/health-check
    */
  var healthChecks: js.UndefOr[js.Array[HealthCheckReference]] = js.undefined
}

object TargetPoolsRemoveHealthCheckRequest {
  @scala.inline
  def apply(healthChecks: js.Array[HealthCheckReference] = null): TargetPoolsRemoveHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks)
    __obj.asInstanceOf[TargetPoolsRemoveHealthCheckRequest]
  }
}

