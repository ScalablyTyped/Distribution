package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response object that may be returned from a callback function (e.g., a form response handler)
  * to perform one or more actions on the client. Some combinations of actions are not supported.
  *
  *     // An action that opens a link
  *     var actionResponse = CardService.newActionResponseBuilder()
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com"))
  *         .build();
  *
  *     // An action that shows a notification.
  *     var actionResponse = CardService.newActionResponseBuilder()
  *         .setNotification(CardService.newNotification()
  *             .setText("Some info to display to user"))
  *         .build();
  *
  *     // An action that shows an additional card. It also sets a flag to indicate that the original
  *     // state data has changed.
  *
  *     var cardBuilder = CardService.newCardBuilder();
  *     // Build card ...
  *     var actionResponse = CardService.newActionResponseBuilder()
  *         .setNavigation(CardService.newNavigation()
  *             .pushCard(cardBuilder.build()))
  *         .setStateChanged(true)
  *         .build();
  */
@js.native
trait ActionResponse extends js.Object {
  def printJson(): String = js.native
}

object ActionResponse {
  @scala.inline
  def apply(printJson: () => String): ActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[ActionResponse]
  }
  @scala.inline
  implicit class ActionResponseOps[Self <: ActionResponse] (val x: Self) extends AnyVal {
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
    def setPrintJson(value: () => String): Self = this.set("printJson", js.Any.fromFunction0(value))
  }
  
}

