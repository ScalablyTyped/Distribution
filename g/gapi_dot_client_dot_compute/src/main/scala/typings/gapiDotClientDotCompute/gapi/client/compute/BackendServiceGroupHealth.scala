package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServiceGroupHealth extends js.Object {
  var healthStatus: js.UndefOr[js.Array[HealthStatus]] = js.undefined
  /** [Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of backend services. */
  var kind: js.UndefOr[String] = js.undefined
}

object BackendServiceGroupHealth {
  @scala.inline
  def apply(healthStatus: js.Array[HealthStatus] = null, kind: String = null): BackendServiceGroupHealth = {
    val __obj = js.Dynamic.literal()
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[BackendServiceGroupHealth]
  }
}

