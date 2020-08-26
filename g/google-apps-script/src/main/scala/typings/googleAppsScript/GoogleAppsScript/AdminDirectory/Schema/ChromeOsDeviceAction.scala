package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOsDeviceAction extends js.Object {
  var action: js.UndefOr[String] = js.native
  var deprovisionReason: js.UndefOr[String] = js.native
}

object ChromeOsDeviceAction {
  @scala.inline
  def apply(): ChromeOsDeviceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsDeviceAction]
  }
  @scala.inline
  implicit class ChromeOsDeviceActionOps[Self <: ChromeOsDeviceAction] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setDeprovisionReason(value: String): Self = this.set("deprovisionReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprovisionReason: Self = this.set("deprovisionReason", js.undefined)
  }
  
}

