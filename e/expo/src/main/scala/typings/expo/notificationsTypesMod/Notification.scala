package typings.expo.notificationsTypesMod

import typings.expo.expoStrings.received
import typings.expo.expoStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends js.Object {
  var data: js.Any = js.native
  var isMultiple: Boolean = js.native
  var origin: selected | received = js.native
  var remote: Boolean = js.native
}

object Notification {
  @scala.inline
  def apply(data: js.Any, isMultiple: Boolean, origin: selected | received, remote: Boolean): Notification = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isMultiple = isMultiple.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMultiple(value: Boolean): Self = this.set("isMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: selected | received): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemote(value: Boolean): Self = this.set("remote", value.asInstanceOf[js.Any])
  }
  
}

