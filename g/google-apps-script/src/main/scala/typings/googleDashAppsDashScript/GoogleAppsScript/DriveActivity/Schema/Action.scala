package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var actor: js.UndefOr[Actor] = js.undefined
  var detail: js.UndefOr[ActionDetail] = js.undefined
  var target: js.UndefOr[Target] = js.undefined
  var timeRange: js.UndefOr[TimeRange] = js.undefined
  var timestamp: js.UndefOr[String] = js.undefined
}

object Action {
  @scala.inline
  def apply(
    actor: Actor = null,
    detail: ActionDetail = null,
    target: Target = null,
    timeRange: TimeRange = null,
    timestamp: String = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeRange != null) __obj.updateDynamic("timeRange")(timeRange.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

