package typings.gapiDotClientDotContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenancePolicy extends js.Object {
  /** Specifies the maintenance window in which maintenance may be performed. */
  var window: js.UndefOr[MaintenanceWindow] = js.undefined
}

object MaintenancePolicy {
  @scala.inline
  def apply(window: MaintenanceWindow = null): MaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenancePolicy]
  }
}

