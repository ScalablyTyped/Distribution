package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPoolInstanceHealth extends js.Object {
  var healthStatus: js.UndefOr[js.Array[HealthStatus]] = js.undefined
  /** [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance. */
  var kind: js.UndefOr[String] = js.undefined
}

object TargetPoolInstanceHealth {
  @scala.inline
  def apply(healthStatus: js.Array[HealthStatus] = null, kind: String = null): TargetPoolInstanceHealth = {
    val __obj = js.Dynamic.literal()
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[TargetPoolInstanceHealth]
  }
}

