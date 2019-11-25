package typings.gapiDotClientDotYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiDotClientDotYoutubeanalytics.Anon_ItemCount
import typings.gapiDotClientDotYoutubeanalytics.Anon_PublishedAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var contentDetails: js.UndefOr[Anon_ItemCount] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var snippet: js.UndefOr[Anon_PublishedAt] = js.undefined
}

object Group {
  @scala.inline
  def apply(
    contentDetails: Anon_ItemCount = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: Anon_PublishedAt = null
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

