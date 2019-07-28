package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheckReference extends js.Object {
  var healthCheck: js.UndefOr[String] = js.undefined
}

object HealthCheckReference {
  @scala.inline
  def apply(healthCheck: String = null): HealthCheckReference = {
    val __obj = js.Dynamic.literal()
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck)
    __obj.asInstanceOf[HealthCheckReference]
  }
}

