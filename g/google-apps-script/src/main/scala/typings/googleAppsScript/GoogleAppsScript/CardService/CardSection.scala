package typings.googleAppsScript.GoogleAppsScript.CardService

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A card section holds groups of widgets and provides visual separation between them.
  *
  *     var image = CardService.newImage();
  *     // Build image ...
  *     var textParagraph = CardService.newTextParagraph();
  *     // Build text paragraph ...
  *
  *     var cardSection = CardService.newCardSection()
  *         .setHeader("Section header")
  *         .addWidget(image)
  *         .addWidget(textParagraph);
  */
trait CardSection extends StObject {
  
  def addWidget(widget: Widget): CardSection
  
  def setCollapsible(collapsible: Boolean): CardSection
  
  def setHeader(header: String): CardSection
  
  def setNumUncollapsibleWidgets(numUncollapsibleWidgets: Integer): CardSection
}
object CardSection {
  
  @scala.inline
  def apply(
    addWidget: Widget => CardSection,
    setCollapsible: Boolean => CardSection,
    setHeader: String => CardSection,
    setNumUncollapsibleWidgets: Integer => CardSection
  ): CardSection = {
    val __obj = js.Dynamic.literal(addWidget = js.Any.fromFunction1(addWidget), setCollapsible = js.Any.fromFunction1(setCollapsible), setHeader = js.Any.fromFunction1(setHeader), setNumUncollapsibleWidgets = js.Any.fromFunction1(setNumUncollapsibleWidgets))
    __obj.asInstanceOf[CardSection]
  }
  
  @scala.inline
  implicit class CardSectionMutableBuilder[Self <: CardSection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddWidget(value: Widget => CardSection): Self = StObject.set(x, "addWidget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCollapsible(value: Boolean => CardSection): Self = StObject.set(x, "setCollapsible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeader(value: String => CardSection): Self = StObject.set(x, "setHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNumUncollapsibleWidgets(value: Integer => CardSection): Self = StObject.set(x, "setNumUncollapsibleWidgets", js.Any.fromFunction1(value))
  }
}
