package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$HealthChecksScopedList extends js.Object {
  /**
    * A list of HealthChecks contained in this scope.
    */
  var healthChecks: js.UndefOr[js.Array[Schema$HealthCheck]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$HealthChecksScopedList {
  @scala.inline
  def apply(healthChecks: js.Array[Schema$HealthCheck] = null, warning: Anon_Code = null): Schema$HealthChecksScopedList = {
    val __obj = js.Dynamic.literal()
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HealthChecksScopedList]
  }
}

