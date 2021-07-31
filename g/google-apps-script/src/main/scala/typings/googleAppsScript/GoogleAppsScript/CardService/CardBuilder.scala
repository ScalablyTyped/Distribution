package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for Card objects.
  */
trait CardBuilder extends StObject {
  
  def addCardAction(cardAction: CardAction): CardBuilder
  
  def addSection(section: CardSection): CardBuilder
  
  def build(): Card
  
  def setHeader(cardHeader: CardHeader): CardBuilder
  
  def setName(name: String): CardBuilder
}
object CardBuilder {
  
  @scala.inline
  def apply(
    addCardAction: CardAction => CardBuilder,
    addSection: CardSection => CardBuilder,
    build: () => Card,
    setHeader: CardHeader => CardBuilder,
    setName: String => CardBuilder
  ): CardBuilder = {
    val __obj = js.Dynamic.literal(addCardAction = js.Any.fromFunction1(addCardAction), addSection = js.Any.fromFunction1(addSection), build = js.Any.fromFunction0(build), setHeader = js.Any.fromFunction1(setHeader), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[CardBuilder]
  }
  
  @scala.inline
  implicit class CardBuilderMutableBuilder[Self <: CardBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCardAction(value: CardAction => CardBuilder): Self = StObject.set(x, "addCardAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSection(value: CardSection => CardBuilder): Self = StObject.set(x, "addSection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuild(value: () => Card): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHeader(value: CardHeader => CardBuilder): Self = StObject.set(x, "setHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetName(value: String => CardBuilder): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
