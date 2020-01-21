package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for Card objects.
  */
trait CardBuilder extends js.Object {
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
}

