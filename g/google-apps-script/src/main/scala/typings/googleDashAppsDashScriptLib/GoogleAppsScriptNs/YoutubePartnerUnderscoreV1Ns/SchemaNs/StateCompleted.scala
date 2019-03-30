package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateCompleted extends js.Object {
  var state: js.UndefOr[java.lang.String] = js.undefined
  var timeCompleted: js.UndefOr[java.lang.String] = js.undefined
}

object StateCompleted {
  @scala.inline
  def apply(state: java.lang.String = null, timeCompleted: java.lang.String = null): StateCompleted = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state)
    if (timeCompleted != null) __obj.updateDynamic("timeCompleted")(timeCompleted)
    __obj.asInstanceOf[StateCompleted]
  }
}

