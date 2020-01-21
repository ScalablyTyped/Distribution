package typings.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiClientYoutubeanalytics.AnonItemCount
import typings.gapiClientYoutubeanalytics.AnonPublishedAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var contentDetails: js.UndefOr[AnonItemCount] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var snippet: js.UndefOr[AnonPublishedAt] = js.undefined
}

object Group {
  @scala.inline
  def apply(
    contentDetails: AnonItemCount = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: AnonPublishedAt = null
  ): Group = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

