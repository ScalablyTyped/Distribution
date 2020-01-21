package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetPoolsRemoveHealthCheckRequest extends js.Object {
  /**
    * Health check URL to be removed. This can be a full or valid partial URL.
    * For example, the following are valid URLs:   -
    * https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check
    * - projects/project/global/httpHealthChecks/health-check  -
    * global/httpHealthChecks/health-check
    */
  var healthChecks: js.UndefOr[js.Array[SchemaHealthCheckReference]] = js.native
}

object SchemaTargetPoolsRemoveHealthCheckRequest {
  @scala.inline
  def apply(healthChecks: js.Array[SchemaHealthCheckReference] = null): SchemaTargetPoolsRemoveHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetPoolsRemoveHealthCheckRequest]
  }
}

