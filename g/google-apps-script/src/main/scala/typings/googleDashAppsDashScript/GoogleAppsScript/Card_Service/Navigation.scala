package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigation extends js.Object {
  def popCard(): Navigation
  def popToNamedCard(cardName: String): Navigation
  def popToRoot(): Navigation
  def printJson(): String
  def pushCard(card: Card): Navigation
  def updateCard(card: Card): Navigation
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
}

