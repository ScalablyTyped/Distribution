package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonSet extends js.Object {
  def addButton(button: Button): ButtonSet
}

object ButtonSet {
  @scala.inline
  def apply(addButton: js.Function1[Button, ButtonSet]): ButtonSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addButton")(addButton)
    __obj.asInstanceOf[ButtonSet]
  }
}

