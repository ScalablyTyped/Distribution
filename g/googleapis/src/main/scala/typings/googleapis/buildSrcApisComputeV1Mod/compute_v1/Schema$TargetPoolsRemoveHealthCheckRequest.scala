package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetPoolsRemoveHealthCheckRequest extends js.Object {
  /**
    * Health check URL to be removed. This can be a full or valid partial URL.
    * For example, the following are valid URLs:   -
    * https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check
    * - projects/project/global/httpHealthChecks/health-check  -
    * global/httpHealthChecks/health-check
    */
  var healthChecks: js.UndefOr[js.Array[Schema$HealthCheckReference]] = js.native
}

object Schema$TargetPoolsRemoveHealthCheckRequest {
  @scala.inline
  def apply(healthChecks: js.Array[Schema$HealthCheckReference] = null): Schema$TargetPoolsRemoveHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetPoolsRemoveHealthCheckRequest]
  }
}

