package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait CardSection extends js.Object {
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
}

