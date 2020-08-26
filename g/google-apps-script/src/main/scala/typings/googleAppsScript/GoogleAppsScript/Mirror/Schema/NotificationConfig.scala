package typings.googleAppsScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfig extends js.Object {
  var deliveryTime: js.UndefOr[String] = js.native
  var level: js.UndefOr[String] = js.native
}

object NotificationConfig {
  @scala.inline
  def apply(): NotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfig]
  }
  @scala.inline
  implicit class NotificationConfigOps[Self <: NotificationConfig] (val x: Self) extends AnyVal {
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
    def setDeliveryTime(value: String): Self = this.set("deliveryTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryTime: Self = this.set("deliveryTime", js.undefined)
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

