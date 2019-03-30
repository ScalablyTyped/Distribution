package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryPickup extends js.Object {
  var pickupMethod: js.UndefOr[java.lang.String] = js.undefined
  var pickupSla: js.UndefOr[java.lang.String] = js.undefined
}

object InventoryPickup {
  @scala.inline
  def apply(pickupMethod: java.lang.String = null, pickupSla: java.lang.String = null): InventoryPickup = {
    val __obj = js.Dynamic.literal()
    if (pickupMethod != null) __obj.updateDynamic("pickupMethod")(pickupMethod)
    if (pickupSla != null) __obj.updateDynamic("pickupSla")(pickupSla)
    __obj.asInstanceOf[InventoryPickup]
  }
}

