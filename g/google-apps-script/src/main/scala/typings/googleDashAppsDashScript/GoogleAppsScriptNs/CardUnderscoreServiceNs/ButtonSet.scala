package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonSet extends js.Object {
  def addButton(button: Button): ButtonSet
}

object ButtonSet {
  @scala.inline
  def apply(addButton: Button => ButtonSet): ButtonSet = {
    val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1(addButton))
  
    __obj.asInstanceOf[ButtonSet]
  }
}

