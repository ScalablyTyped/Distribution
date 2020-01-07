package typings.googleapis.buildSrcApisYoutubeAnalyticsV1Mod.youtubeAnalytics_v1

import typings.googleapis.Anon_ItemCount
import typings.googleapis.Anon_PublishedAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Group extends js.Object {
  var contentDetails: js.UndefOr[Anon_ItemCount] = js.native
  var etag: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var snippet: js.UndefOr[Anon_PublishedAt] = js.native
}

object Schema$Group {
  @scala.inline
  def apply(
    contentDetails: Anon_ItemCount = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: Anon_PublishedAt = null
  ): Schema$Group = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Group]
  }
}

