package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A notification shown to the user as a response to interacting with a UI element.
  *
  *     var action = CardService.newAction().setFunctionName("notificationCallback");
  *     CardService.newTextButton().setText('Save').setOnClickAction(action);
  *
  *     // ...
  *
  *     function notificationCallback() {
  *       return CardService.newActionResponseBuilder()
  *           .setNotification(CardService.newNotification()
  *               .setText("Some info to display to user"))
  *           .build();
  *     }
  */
@js.native
trait Notification extends js.Object {
  def setText(text: String): Notification = js.native
}

object Notification {
  @scala.inline
  def apply(setText: String => Notification): Notification = {
    val __obj = js.Dynamic.literal(setText = js.Any.fromFunction1(setText))
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
    def setSetText(value: String => Notification): Self = this.set("setText", js.Any.fromFunction1(value))
  }
  
}

