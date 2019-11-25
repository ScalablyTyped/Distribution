package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryPickup extends js.Object {
  var pickupMethod: js.UndefOr[String] = js.undefined
  var pickupSla: js.UndefOr[String] = js.undefined
}

object InventoryPickup {
  @scala.inline
  def apply(pickupMethod: String = null, pickupSla: String = null): InventoryPickup = {
    val __obj = js.Dynamic.literal()
    if (pickupMethod != null) __obj.updateDynamic("pickupMethod")(pickupMethod.asInstanceOf[js.Any])
    if (pickupSla != null) __obj.updateDynamic("pickupSla")(pickupSla.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryPickup]
  }
}

