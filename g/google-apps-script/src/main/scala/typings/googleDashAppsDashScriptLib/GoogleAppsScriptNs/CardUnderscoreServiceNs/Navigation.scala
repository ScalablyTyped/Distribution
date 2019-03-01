package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigation extends js.Object {
  def popCard(): Navigation
  def popToNamedCard(cardName: java.lang.String): Navigation
  def popToRoot(): Navigation
  def printJson(): java.lang.String
  def pushCard(card: Card): Navigation
  def updateCard(card: Card): Navigation
}

object Navigation {
  @scala.inline
  def apply(
    popCard: js.Function0[Navigation],
    popToNamedCard: js.Function1[java.lang.String, Navigation],
    popToRoot: js.Function0[Navigation],
    printJson: js.Function0[java.lang.String],
    pushCard: js.Function1[Card, Navigation],
    updateCard: js.Function1[Card, Navigation]
  ): Navigation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("popCard")(popCard)
    __obj.updateDynamic("popToNamedCard")(popToNamedCard)
    __obj.updateDynamic("popToRoot")(popToRoot)
    __obj.updateDynamic("printJson")(printJson)
    __obj.updateDynamic("pushCard")(pushCard)
    __obj.updateDynamic("updateCard")(updateCard)
    __obj.asInstanceOf[Navigation]
  }
}

