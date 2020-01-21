package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetPoolsAddHealthCheckRequest extends js.Object {
  /**
    * The HttpHealthCheck to add to the target pool.
    */
  var healthChecks: js.UndefOr[js.Array[SchemaHealthCheckReference]] = js.native
}

object SchemaTargetPoolsAddHealthCheckRequest {
  @scala.inline
  def apply(healthChecks: js.Array[SchemaHealthCheckReference] = null): SchemaTargetPoolsAddHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetPoolsAddHealthCheckRequest]
  }
}

