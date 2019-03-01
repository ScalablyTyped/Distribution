package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardBuilder extends js.Object {
  def addCardAction(cardAction: CardAction): CardBuilder
  def addSection(section: CardSection): CardBuilder
  def build(): Card
  def setHeader(cardHeader: CardHeader): CardBuilder
  def setName(name: java.lang.String): CardBuilder
}

object CardBuilder {
  @scala.inline
  def apply(
    addCardAction: js.Function1[CardAction, CardBuilder],
    addSection: js.Function1[CardSection, CardBuilder],
    build: js.Function0[Card],
    setHeader: js.Function1[CardHeader, CardBuilder],
    setName: js.Function1[java.lang.String, CardBuilder]
  ): CardBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addCardAction")(addCardAction)
    __obj.updateDynamic("addSection")(addSection)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("setHeader")(setHeader)
    __obj.updateDynamic("setName")(setName)
    __obj.asInstanceOf[CardBuilder]
  }
}

