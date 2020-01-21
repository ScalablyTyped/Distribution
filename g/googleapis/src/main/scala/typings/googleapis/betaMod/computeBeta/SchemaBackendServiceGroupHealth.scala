package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBackendServiceGroupHealth extends js.Object {
  /**
    * Health state of the backend instances or endpoints in requested instance
    * or network endpoint group, determined based on configured health checks.
    */
  var healthStatus: js.UndefOr[js.Array[SchemaHealthStatus]] = js.native
  /**
    * [Output Only] Type of resource. Always compute#backendServiceGroupHealth
    * for the health of backend services.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBackendServiceGroupHealth {
  @scala.inline
  def apply(healthStatus: js.Array[SchemaHealthStatus] = null, kind: String = null): SchemaBackendServiceGroupHealth = {
    val __obj = js.Dynamic.literal()
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackendServiceGroupHealth]
  }
}

