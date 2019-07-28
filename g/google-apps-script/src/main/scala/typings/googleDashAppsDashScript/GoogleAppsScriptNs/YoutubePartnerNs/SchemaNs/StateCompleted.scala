package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateCompleted extends js.Object {
  var state: js.UndefOr[String] = js.undefined
  var timeCompleted: js.UndefOr[String] = js.undefined
}

object StateCompleted {
  @scala.inline
  def apply(state: String = null, timeCompleted: String = null): StateCompleted = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state)
    if (timeCompleted != null) __obj.updateDynamic("timeCompleted")(timeCompleted)
    __obj.asInstanceOf[StateCompleted]
  }
}

