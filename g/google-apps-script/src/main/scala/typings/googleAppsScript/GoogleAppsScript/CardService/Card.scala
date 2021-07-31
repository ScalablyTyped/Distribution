package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Card extends StObject {
  
  def printJson(): String
}
object Card {
  
  @scala.inline
  def apply(printJson: () => String): Card = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[Card]
  }
  
  @scala.inline
  implicit class CardMutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
  }
}
