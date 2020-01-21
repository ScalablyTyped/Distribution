package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetPoolInstanceHealth extends js.Object {
  var healthStatus: js.UndefOr[js.Array[SchemaHealthStatus]] = js.native
  /**
    * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth
    * when checking the health of an instance.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaTargetPoolInstanceHealth {
  @scala.inline
  def apply(healthStatus: js.Array[SchemaHealthStatus] = null, kind: String = null): SchemaTargetPoolInstanceHealth = {
    val __obj = js.Dynamic.literal()
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetPoolInstanceHealth]
  }
}

