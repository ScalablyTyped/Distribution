package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A helper object that controls card navigation. See the card navigation guide for more details.
  */
@js.native
trait Navigation extends js.Object {
  def popCard(): Navigation = js.native
  def popToNamedCard(cardName: String): Navigation = js.native
  def popToRoot(): Navigation = js.native
  def printJson(): String = js.native
  def pushCard(card: Card): Navigation = js.native
  def updateCard(card: Card): Navigation = js.native
}

object Navigation {
  @scala.inline
  def apply(
    popCard: () => Navigation,
    popToNamedCard: String => Navigation,
    popToRoot: () => Navigation,
    printJson: () => String,
    pushCard: Card => Navigation,
    updateCard: Card => Navigation
  ): Navigation = {
    val __obj = js.Dynamic.literal(popCard = js.Any.fromFunction0(popCard), popToNamedCard = js.Any.fromFunction1(popToNamedCard), popToRoot = js.Any.fromFunction0(popToRoot), printJson = js.Any.fromFunction0(printJson), pushCard = js.Any.fromFunction1(pushCard), updateCard = js.Any.fromFunction1(updateCard))
    __obj.asInstanceOf[Navigation]
  }
  @scala.inline
  implicit class NavigationOps[Self <: Navigation] (val x: Self) extends AnyVal {
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
    def setPopCard(value: () => Navigation): Self = this.set("popCard", js.Any.fromFunction0(value))
    @scala.inline
    def setPopToNamedCard(value: String => Navigation): Self = this.set("popToNamedCard", js.Any.fromFunction1(value))
    @scala.inline
    def setPopToRoot(value: () => Navigation): Self = this.set("popToRoot", js.Any.fromFunction0(value))
    @scala.inline
    def setPrintJson(value: () => String): Self = this.set("printJson", js.Any.fromFunction0(value))
    @scala.inline
    def setPushCard(value: Card => Navigation): Self = this.set("pushCard", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateCard(value: Card => Navigation): Self = this.set("updateCard", js.Any.fromFunction1(value))
  }
  
}

