package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastStatus extends js.Object {
  var lifeCycleStatus: js.UndefOr[java.lang.String] = js.undefined
  var liveBroadcastPriority: js.UndefOr[java.lang.String] = js.undefined
  var privacyStatus: js.UndefOr[java.lang.String] = js.undefined
  var recordingStatus: js.UndefOr[java.lang.String] = js.undefined
}

object LiveBroadcastStatus {
  @scala.inline
  def apply(
    lifeCycleStatus: java.lang.String = null,
    liveBroadcastPriority: java.lang.String = null,
    privacyStatus: java.lang.String = null,
    recordingStatus: java.lang.String = null
  ): LiveBroadcastStatus = {
    val __obj = js.Dynamic.literal()
    if (lifeCycleStatus != null) __obj.updateDynamic("lifeCycleStatus")(lifeCycleStatus)
    if (liveBroadcastPriority != null) __obj.updateDynamic("liveBroadcastPriority")(liveBroadcastPriority)
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus)
    if (recordingStatus != null) __obj.updateDynamic("recordingStatus")(recordingStatus)
    __obj.asInstanceOf[LiveBroadcastStatus]
  }
}

