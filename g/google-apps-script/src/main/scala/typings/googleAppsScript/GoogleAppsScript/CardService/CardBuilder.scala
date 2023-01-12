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
  
  def setDisplayStyle(displayStyle: DisplayStyle): CardBuilder
  
  def setFixedFooter(fixedFooter: FixedFooter): CardBuilder
  
  def setHeader(cardHeader: CardHeader): CardBuilder
  
  def setName(name: String): CardBuilder
  
  def setPeekCardHeader(peekCardHeader: CardHeader): CardBuilder
}
object CardBuilder {
  
  inline def apply(
    addCardAction: CardAction => CardBuilder,
    addSection: CardSection => CardBuilder,
    build: () => Card,
    setDisplayStyle: DisplayStyle => CardBuilder,
    setFixedFooter: FixedFooter => CardBuilder,
    setHeader: CardHeader => CardBuilder,
    setName: String => CardBuilder,
    setPeekCardHeader: CardHeader => CardBuilder
  ): CardBuilder = {
    val __obj = js.Dynamic.literal(addCardAction = js.Any.fromFunction1(addCardAction), addSection = js.Any.fromFunction1(addSection), build = js.Any.fromFunction0(build), setDisplayStyle = js.Any.fromFunction1(setDisplayStyle), setFixedFooter = js.Any.fromFunction1(setFixedFooter), setHeader = js.Any.fromFunction1(setHeader), setName = js.Any.fromFunction1(setName), setPeekCardHeader = js.Any.fromFunction1(setPeekCardHeader))
    __obj.asInstanceOf[CardBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardBuilder] (val x: Self) extends AnyVal {
    
    inline def setAddCardAction(value: CardAction => CardBuilder): Self = StObject.set(x, "addCardAction", js.Any.fromFunction1(value))
    
    inline def setAddSection(value: CardSection => CardBuilder): Self = StObject.set(x, "addSection", js.Any.fromFunction1(value))
    
    inline def setBuild(value: () => Card): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setSetDisplayStyle(value: DisplayStyle => CardBuilder): Self = StObject.set(x, "setDisplayStyle", js.Any.fromFunction1(value))
    
    inline def setSetFixedFooter(value: FixedFooter => CardBuilder): Self = StObject.set(x, "setFixedFooter", js.Any.fromFunction1(value))
    
    inline def setSetHeader(value: CardHeader => CardBuilder): Self = StObject.set(x, "setHeader", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => CardBuilder): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setSetPeekCardHeader(value: CardHeader => CardBuilder): Self = StObject.set(x, "setPeekCardHeader", js.Any.fromFunction1(value))
  }
}
