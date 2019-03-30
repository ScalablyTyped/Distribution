package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var actor: js.UndefOr[Actor] = js.undefined
  var detail: js.UndefOr[ActionDetail] = js.undefined
  var target: js.UndefOr[Target] = js.undefined
  var timeRange: js.UndefOr[TimeRange] = js.undefined
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
}

object Action {
  @scala.inline
  def apply(
    actor: Actor = null,
    detail: ActionDetail = null,
    target: Target = null,
    timeRange: TimeRange = null,
    timestamp: java.lang.String = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (target != null) __obj.updateDynamic("target")(target)
    if (timeRange != null) __obj.updateDynamic("timeRange")(timeRange)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[Action]
  }
}

