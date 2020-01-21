package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastStatus extends js.Object {
  /** The broadcast's status. The status can be updated using the API's liveBroadcasts.transition method. */
  var lifeCycleStatus: js.UndefOr[String] = js.undefined
  /** Priority of the live broadcast event (internal state). */
  var liveBroadcastPriority: js.UndefOr[String] = js.undefined
  /**
    * The broadcast's privacy status. Note that the broadcast represents exactly one YouTube video, so the privacy settings are identical to those supported
    * for videos. In addition, you can set this field by modifying the broadcast resource or by setting the privacyStatus field of the corresponding video
    * resource.
    */
  var privacyStatus: js.UndefOr[String] = js.undefined
  /** The broadcast's recording status. */
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

