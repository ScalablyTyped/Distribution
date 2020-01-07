package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MaintenancePolicy defines the maintenance policy to be used for the
  * cluster.
  */
@js.native
trait Schema$MaintenancePolicy extends js.Object {
  /**
    * Specifies the maintenance window in which maintenance may be performed.
    */
  var window: js.UndefOr[Schema$MaintenanceWindow] = js.native
}

object Schema$MaintenancePolicy {
  @scala.inline
  def apply(window: Schema$MaintenanceWindow = null): Schema$MaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MaintenancePolicy]
  }
}

