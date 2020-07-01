package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaHealthChecksScopedList extends js.Object {
  /**
    * A list of HealthChecks contained in this scope.
    */
  var healthChecks: js.UndefOr[js.Array[SchemaHealthCheck]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaHealthChecksScopedList {
  @scala.inline
  def apply(healthChecks: js.Array[SchemaHealthCheck] = null, warning: Code = null): SchemaHealthChecksScopedList = {
    val __obj = js.Dynamic.literal()
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHealthChecksScopedList]
  }
}

