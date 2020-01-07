package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetPoolsAddHealthCheckRequest extends js.Object {
  /**
    * The HttpHealthCheck to add to the target pool.
    */
  var healthChecks: js.UndefOr[js.Array[Schema$HealthCheckReference]] = js.native
}

object Schema$TargetPoolsAddHealthCheckRequest {
  @scala.inline
  def apply(healthChecks: js.Array[Schema$HealthCheckReference] = null): Schema$TargetPoolsAddHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetPoolsAddHealthCheckRequest]
  }
}

