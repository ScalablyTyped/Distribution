package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  def printJson(): java.lang.String
}

object Card {
  @scala.inline
  def apply(printJson: js.Function0[java.lang.String]): Card = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printJson")(printJson)
    __obj.asInstanceOf[Card]
  }
}

