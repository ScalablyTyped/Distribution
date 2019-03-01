package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheckReference extends js.Object {
  var healthCheck: js.UndefOr[java.lang.String] = js.undefined
}

object HealthCheckReference {
  @scala.inline
  def apply(healthCheck: java.lang.String = null): HealthCheckReference = {
    val __obj = js.Dynamic.literal()
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck)
    __obj.asInstanceOf[HealthCheckReference]
  }
}

