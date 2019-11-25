package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoLiveStreamingDetails extends js.Object {
  var activeLiveChatId: js.UndefOr[String] = js.undefined
  var actualEndTime: js.UndefOr[String] = js.undefined
  var actualStartTime: js.UndefOr[String] = js.undefined
  var concurrentViewers: js.UndefOr[String] = js.undefined
  var scheduledEndTime: js.UndefOr[String] = js.undefined
  var scheduledStartTime: js.UndefOr[String] = js.undefined
}

object VideoLiveStreamingDetails {
  @scala.inline
  def apply(
    activeLiveChatId: String = null,
    actualEndTime: String = null,
    actualStartTime: String = null,
    concurrentViewers: String = null,
    scheduledEndTime: String = null,
    scheduledStartTime: String = null
  ): VideoLiveStreamingDetails = {
    val __obj = js.Dynamic.literal()
    if (activeLiveChatId != null) __obj.updateDynamic("activeLiveChatId")(activeLiveChatId.asInstanceOf[js.Any])
    if (actualEndTime != null) __obj.updateDynamic("actualEndTime")(actualEndTime.asInstanceOf[js.Any])
    if (actualStartTime != null) __obj.updateDynamic("actualStartTime")(actualStartTime.asInstanceOf[js.Any])
    if (concurrentViewers != null) __obj.updateDynamic("concurrentViewers")(concurrentViewers.asInstanceOf[js.Any])
    if (scheduledEndTime != null) __obj.updateDynamic("scheduledEndTime")(scheduledEndTime.asInstanceOf[js.Any])
    if (scheduledStartTime != null) __obj.updateDynamic("scheduledStartTime")(scheduledStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoLiveStreamingDetails]
  }
}

