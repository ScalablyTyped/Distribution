package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastStatus extends js.Object {
  /** The broadcast's status. The status can be updated using the API's liveBroadcasts.transition method. */
  var lifeCycleStatus: js.UndefOr[java.lang.String] = js.undefined
  /** Priority of the live broadcast event (internal state). */
  var liveBroadcastPriority: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The broadcast's privacy status. Note that the broadcast represents exactly one YouTube video, so the privacy settings are identical to those supported
    * for videos. In addition, you can set this field by modifying the broadcast resource or by setting the privacyStatus field of the corresponding video
    * resource.
    */
  var privacyStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The broadcast's recording status. */
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

