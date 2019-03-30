package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateHistory extends js.Object {
  var actorUserId: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var stateTimestamp: js.UndefOr[java.lang.String] = js.undefined
}

object StateHistory {
  @scala.inline
  def apply(
    actorUserId: java.lang.String = null,
    state: java.lang.String = null,
    stateTimestamp: java.lang.String = null
  ): StateHistory = {
    val __obj = js.Dynamic.literal()
    if (actorUserId != null) __obj.updateDynamic("actorUserId")(actorUserId)
    if (state != null) __obj.updateDynamic("state")(state)
    if (stateTimestamp != null) __obj.updateDynamic("stateTimestamp")(stateTimestamp)
    __obj.asInstanceOf[StateHistory]
  }
}

