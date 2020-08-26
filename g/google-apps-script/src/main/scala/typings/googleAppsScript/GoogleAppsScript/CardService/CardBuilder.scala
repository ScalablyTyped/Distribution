package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for Card objects.
  */
@js.native
trait CardBuilder extends js.Object {
  def addCardAction(cardAction: CardAction): CardBuilder = js.native
  def addSection(section: CardSection): CardBuilder = js.native
  def build(): Card = js.native
  def setHeader(cardHeader: CardHeader): CardBuilder = js.native
  def setName(name: String): CardBuilder = js.native
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
  implicit class CardBuilderOps[Self <: CardBuilder] (val x: Self) extends AnyVal {
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
    def setAddCardAction(value: CardAction => CardBuilder): Self = this.set("addCardAction", js.Any.fromFunction1(value))
    @scala.inline
    def setAddSection(value: CardSection => CardBuilder): Self = this.set("addSection", js.Any.fromFunction1(value))
    @scala.inline
    def setBuild(value: () => Card): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setSetHeader(value: CardHeader => CardBuilder): Self = this.set("setHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setSetName(value: String => CardBuilder): Self = this.set("setName", js.Any.fromFunction1(value))
  }
  
}

