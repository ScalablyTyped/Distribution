package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait UniversalActionResponse extends js.Object {
  
  def printJson(): String = js.native
}
object UniversalActionResponse {
  
  @scala.inline
  def apply(printJson: () => String): UniversalActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[UniversalActionResponse]
  }
  
  @scala.inline
  implicit class UniversalActionResponseOps[Self <: UniversalActionResponse] (val x: Self) extends AnyVal {
    
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
