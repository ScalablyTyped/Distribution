package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveActivity extends js.Object {
  var actions: js.UndefOr[js.Array[Action]] = js.undefined
  var actors: js.UndefOr[js.Array[Actor]] = js.undefined
  var primaryActionDetail: js.UndefOr[ActionDetail] = js.undefined
  var targets: js.UndefOr[js.Array[Target]] = js.undefined
  var timeRange: js.UndefOr[TimeRange] = js.undefined
  var timestamp: js.UndefOr[String] = js.undefined
}

object DriveActivity {
  @scala.inline
  def apply(
    actions: js.Array[Action] = null,
    actors: js.Array[Actor] = null,
    primaryActionDetail: ActionDetail = null,
    targets: js.Array[Target] = null,
    timeRange: TimeRange = null,
    timestamp: String = null
  ): DriveActivity = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (actors != null) __obj.updateDynamic("actors")(actors.asInstanceOf[js.Any])
    if (primaryActionDetail != null) __obj.updateDynamic("primaryActionDetail")(primaryActionDetail.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (timeRange != null) __obj.updateDynamic("timeRange")(timeRange.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveActivity]
  }
}

