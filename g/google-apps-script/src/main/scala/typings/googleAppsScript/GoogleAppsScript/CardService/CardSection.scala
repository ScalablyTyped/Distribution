package typings.googleAppsScript.GoogleAppsScript.CardService

import typings.googleAppsScript.GoogleAppsScript.Integer
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
@js.native
trait CardSection extends js.Object {
  def addWidget(widget: Widget): CardSection = js.native
  def setCollapsible(collapsible: Boolean): CardSection = js.native
  def setHeader(header: String): CardSection = js.native
  def setNumUncollapsibleWidgets(numUncollapsibleWidgets: Integer): CardSection = js.native
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
  implicit class CardSectionOps[Self <: CardSection] (val x: Self) extends AnyVal {
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
    def setAddWidget(value: Widget => CardSection): Self = this.set("addWidget", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCollapsible(value: Boolean => CardSection): Self = this.set("setCollapsible", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHeader(value: String => CardSection): Self = this.set("setHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setSetNumUncollapsibleWidgets(value: Integer => CardSection): Self = this.set("setNumUncollapsibleWidgets", js.Any.fromFunction1(value))
  }
  
}

