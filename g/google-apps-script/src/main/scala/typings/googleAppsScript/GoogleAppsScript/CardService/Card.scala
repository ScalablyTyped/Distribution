package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait Card extends js.Object {
  
  def printJson(): String = js.native
}
object Card {
  
  @scala.inline
  def apply(printJson: () => String): Card = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[Card]
  }
  
  @scala.inline
  implicit class CardOps[Self <: Card] (val x: Self) extends AnyVal {
    
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
