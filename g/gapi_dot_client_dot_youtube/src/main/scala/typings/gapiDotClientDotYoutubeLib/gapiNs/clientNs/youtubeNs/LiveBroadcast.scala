package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

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
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube assigns to uniquely identify the broadcast. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveBroadcast". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
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

