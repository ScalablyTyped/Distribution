package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A context card that represents a single view in the
  * UI.
  *
  *     var cardSection = CardService.newCardSection();
  *     // Finish building the card section ...
  *
  *     var card = CardService.newCardBuilder()
  *         .setName("Card name")
  *         .setHeader(CardService.newCardHeader().setTitle("Card title"))
  *         .addSection(cardSection)
  *         .build();
  */
trait Card extends js.Object {
  def printJson(): String
}

object Card {
  @scala.inline
  def apply(printJson: () => String): Card = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
  
    __obj.asInstanceOf[Card]
  }
}

