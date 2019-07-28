package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcast extends js.Object {
  /**
    * The contentDetails object contains information about the event's video content, such as whether the content can be shown in an embedded video player or
    * if it will be archived and therefore available for viewing after the event has concluded.
    */
  var contentDetails: js.UndefOr[LiveBroadcastContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube assigns to uniquely identify the broadcast. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveBroadcast". */
  var kind: js.UndefOr[String] = js.undefined
  /** The snippet object contains basic details about the event, including its title, description, start time, and end time. */
  var snippet: js.UndefOr[LiveBroadcastSnippet] = js.undefined
  /**
    * The statistics object contains info about the event's current stats. These include concurrent viewers and total chat count. Statistics can change (in
    * either direction) during the lifetime of an event. Statistics are only returned while the event is live.
    */
  var statistics: js.UndefOr[LiveBroadcastStatistics] = js.undefined
  /** The status object contains information about the event's status. */
  var status: js.UndefOr[LiveBroadcastStatus] = js.undefined
}

object LiveBroadcast {
  @scala.inline
  def apply(
    contentDetails: LiveBroadcastContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: LiveBroadcastSnippet = null,
    statistics: LiveBroadcastStatistics = null,
    status: LiveBroadcastStatus = null
  ): LiveBroadcast = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[LiveBroadcast]
  }
}

