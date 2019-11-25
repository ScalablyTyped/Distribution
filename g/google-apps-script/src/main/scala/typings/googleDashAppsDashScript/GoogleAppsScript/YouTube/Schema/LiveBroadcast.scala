package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcast extends js.Object {
  var contentDetails: js.UndefOr[LiveBroadcastContentDetails] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var snippet: js.UndefOr[LiveBroadcastSnippet] = js.undefined
  var statistics: js.UndefOr[LiveBroadcastStatistics] = js.undefined
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
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveBroadcast]
  }
}

