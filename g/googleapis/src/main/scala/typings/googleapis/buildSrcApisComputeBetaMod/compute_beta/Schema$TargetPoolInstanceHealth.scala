package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetPoolInstanceHealth extends js.Object {
  var healthStatus: js.UndefOr[js.Array[Schema$HealthStatus]] = js.native
  /**
    * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth
    * when checking the health of an instance.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$TargetPoolInstanceHealth {
  @scala.inline
  def apply(healthStatus: js.Array[Schema$HealthStatus] = null, kind: String = null): Schema$TargetPoolInstanceHealth = {
    val __obj = js.Dynamic.literal()
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetPoolInstanceHealth]
  }
}

