package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryPickup extends js.Object {
  var pickupMethod: js.UndefOr[String] = js.native
  var pickupSla: js.UndefOr[String] = js.native
}

object InventoryPickup {
  @scala.inline
  def apply(): InventoryPickup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryPickup]
  }
  @scala.inline
  implicit class InventoryPickupOps[Self <: InventoryPickup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPickupMethod(value: String): Self = this.set("pickupMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickupMethod: Self = this.set("pickupMethod", js.undefined)
    @scala.inline
    def setPickupSla(value: String): Self = this.set("pickupSla", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickupSla: Self = this.set("pickupSla", js.undefined)
  }
  
}

