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

