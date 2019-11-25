package typings.gapiDotClientDotCompute.gapi.client.compute

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
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheckReference]
  }
}

