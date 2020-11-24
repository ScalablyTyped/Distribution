package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationsButton extends js.Object {
  
  var counterLabel: String = js.native
  
  var notificationsButton: String = js.native
}
object NotificationsButton {
  
  @scala.inline
  def apply(counterLabel: String, notificationsButton: String): NotificationsButton = {
    val __obj = js.Dynamic.literal(counterLabel = counterLabel.asInstanceOf[js.Any], notificationsButton = notificationsButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsButton]
  }
  
  @scala.inline
  implicit class NotificationsButtonOps[Self <: NotificationsButton] (val x: Self) extends AnyVal {
    
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
    def setCounterLabel(value: String): Self = this.set("counterLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsButton(value: String): Self = this.set("notificationsButton", value.asInstanceOf[js.Any])
  }
}
