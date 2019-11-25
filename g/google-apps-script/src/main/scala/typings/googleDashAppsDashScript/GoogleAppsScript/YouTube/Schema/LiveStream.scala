package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStream extends js.Object {
  var cdn: js.UndefOr[CdnSettings] = js.undefined
  var contentDetails: js.UndefOr[LiveStreamContentDetails] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var snippet: js.UndefOr[LiveStreamSnippet] = js.undefined
  var status: js.UndefOr[LiveStreamStatus] = js.undefined
}

object LiveStream {
  @scala.inline
  def apply(
    cdn: CdnSettings = null,
    contentDetails: LiveStreamContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: LiveStreamSnippet = null,
    status: LiveStreamStatus = null
  ): LiveStream = {
    val __obj = js.Dynamic.literal()
    if (cdn != null) __obj.updateDynamic("cdn")(cdn.asInstanceOf[js.Any])
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveStream]
  }
}

