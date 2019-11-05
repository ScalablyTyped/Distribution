package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

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
trait Notification extends js.Object {
  def setText(text: String): Notification
}

object Notification {
  @scala.inline
  def apply(setText: String => Notification): Notification = {
    val __obj = js.Dynamic.literal(setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[Notification]
  }
}

