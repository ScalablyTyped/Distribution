package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastStatus extends js.Object {
  var lifeCycleStatus: js.UndefOr[String] = js.undefined
  var liveBroadcastPriority: js.UndefOr[String] = js.undefined
  var privacyStatus: js.UndefOr[String] = js.undefined
  var recordingStatus: js.UndefOr[String] = js.undefined
}

object LiveBroadcastStatus {
  @scala.inline
  def apply(
    lifeCycleStatus: String = null,
    liveBroadcastPriority: String = null,
    privacyStatus: String = null,
    recordingStatus: String = null
  ): LiveBroadcastStatus = {
    val __obj = js.Dynamic.literal()
    if (lifeCycleStatus != null) __obj.updateDynamic("lifeCycleStatus")(lifeCycleStatus.asInstanceOf[js.Any])
    if (liveBroadcastPriority != null) __obj.updateDynamic("liveBroadcastPriority")(liveBroadcastPriority.asInstanceOf[js.Any])
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus.asInstanceOf[js.Any])
    if (recordingStatus != null) __obj.updateDynamic("recordingStatus")(recordingStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveBroadcastStatus]
  }
}

