package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A liveBroadcast resource represents an event that will be streamed, via
  * live video, on YouTube.
  */
@js.native
trait Schema$LiveBroadcast extends js.Object {
  /**
    * The contentDetails object contains information about the event&#39;s
    * video content, such as whether the content can be shown in an embedded
    * video player or if it will be archived and therefore available for
    * viewing after the event has concluded.
    */
  var contentDetails: js.UndefOr[Schema$LiveBroadcastContentDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube assigns to uniquely identify the broadcast.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#liveBroadcast&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the event, including its
    * title, description, start time, and end time.
    */
  var snippet: js.UndefOr[Schema$LiveBroadcastSnippet] = js.native
  /**
    * The statistics object contains info about the event&#39;s current stats.
    * These include concurrent viewers and total chat count. Statistics can
    * change (in either direction) during the lifetime of an event. Statistics
    * are only returned while the event is live.
    */
  var statistics: js.UndefOr[Schema$LiveBroadcastStatistics] = js.native
  /**
    * The status object contains information about the event&#39;s status.
    */
  var status: js.UndefOr[Schema$LiveBroadcastStatus] = js.native
}

object Schema$LiveBroadcast {
  @scala.inline
  def apply(
    contentDetails: Schema$LiveBroadcastContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: Schema$LiveBroadcastSnippet = null,
    statistics: Schema$LiveBroadcastStatistics = null,
    status: Schema$LiveBroadcastStatus = null
  ): Schema$LiveBroadcast = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveBroadcast]
  }
}

