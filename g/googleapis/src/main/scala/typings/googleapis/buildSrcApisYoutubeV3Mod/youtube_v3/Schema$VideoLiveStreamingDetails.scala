package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the live streaming metadata.
  */
@js.native
trait Schema$VideoLiveStreamingDetails extends js.Object {
  /**
    * The ID of the currently active live chat attached to this video. This
    * field is filled only if the video is a currently live broadcast that has
    * live chat. Once the broadcast transitions to complete this field will be
    * removed and the live chat closed down. For persistent broadcasts that
    * live chat id will no longer be tied to this video but rather to the new
    * video being displayed at the persistent page.
    */
  var activeLiveChatId: js.UndefOr[String] = js.native
  /**
    * The time that the broadcast actually ended. The value is specified in ISO
    * 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. This value will not be available
    * until the broadcast is over.
    */
  var actualEndTime: js.UndefOr[String] = js.native
  /**
    * The time that the broadcast actually started. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. This value will not be
    * available until the broadcast begins.
    */
  var actualStartTime: js.UndefOr[String] = js.native
  /**
    * The number of viewers currently watching the broadcast. The property and
    * its value will be present if the broadcast has current viewers and the
    * broadcast owner has not hidden the viewcount for the video. Note that
    * YouTube stops tracking the number of concurrent viewers for a broadcast
    * when the broadcast ends. So, this property would not identify the number
    * of viewers watching an archived video of a live broadcast that already
    * ended.
    */
  var concurrentViewers: js.UndefOr[String] = js.native
  /**
    * The time that the broadcast is scheduled to end. The value is specified
    * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. If the value is empty or the
    * property is not present, then the broadcast is scheduled to continue
    * indefinitely.
    */
  var scheduledEndTime: js.UndefOr[String] = js.native
  /**
    * The time that the broadcast is scheduled to begin. The value is specified
    * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var scheduledStartTime: js.UndefOr[String] = js.native
}

object Schema$VideoLiveStreamingDetails {
  @scala.inline
  def apply(
    activeLiveChatId: String = null,
    actualEndTime: String = null,
    actualStartTime: String = null,
    concurrentViewers: String = null,
    scheduledEndTime: String = null,
    scheduledStartTime: String = null
  ): Schema$VideoLiveStreamingDetails = {
    val __obj = js.Dynamic.literal()
    if (activeLiveChatId != null) __obj.updateDynamic("activeLiveChatId")(activeLiveChatId.asInstanceOf[js.Any])
    if (actualEndTime != null) __obj.updateDynamic("actualEndTime")(actualEndTime.asInstanceOf[js.Any])
    if (actualStartTime != null) __obj.updateDynamic("actualStartTime")(actualStartTime.asInstanceOf[js.Any])
    if (concurrentViewers != null) __obj.updateDynamic("concurrentViewers")(concurrentViewers.asInstanceOf[js.Any])
    if (scheduledEndTime != null) __obj.updateDynamic("scheduledEndTime")(scheduledEndTime.asInstanceOf[js.Any])
    if (scheduledStartTime != null) __obj.updateDynamic("scheduledStartTime")(scheduledStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoLiveStreamingDetails]
  }
}

