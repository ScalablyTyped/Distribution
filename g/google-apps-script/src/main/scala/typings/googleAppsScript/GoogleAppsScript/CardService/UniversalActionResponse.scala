package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response object that may be returned from a method that creates universal action.
  *
  *     // A universal action that opens a link.
  *     var openLinkUniversalAction = CardService.newUniversalActionResponseBuilder()
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com"))
  *             .build();
  *
  *     var cardBuilder1 = CardService.newCardBuilder();
  *     var cardBuilder2 = CardService.newCardBuilder();
  *     // Finish building the cards ...
  *
  *     // A universal action that shows two static cards.
  *     var cardsUniversalAction = CardService.newUniversalActionResponseBuilder()
  *         .displayAddOnCards([
  *             cardBuilder1.build();
  *             cardBuilder2.build();
  *         ]).build();
  */
trait UniversalActionResponse extends js.Object {
  def printJson(): String
}

object UniversalActionResponse {
  @scala.inline
  def apply(printJson: () => String): UniversalActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
  
    __obj.asInstanceOf[UniversalActionResponse]
  }
}

