package typings.firebaseMessaging.messagePayloadMod

import typings.std.NotificationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationDetails extends NotificationOptions {
  var click_action: js.UndefOr[String] = js.native
  var title: String = js.native
}

object NotificationDetails {
  @scala.inline
  def apply(title: String): NotificationDetails = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationDetails]
  }
  @scala.inline
  implicit class NotificationDetailsOps[Self <: NotificationDetails] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick_action(value: String): Self = this.set("click_action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClick_action: Self = this.set("click_action", js.undefined)
  }
  
}

