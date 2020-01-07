package typings.googleapis.buildSrcApisYoutubeAnalyticsV1Mod.youtubeAnalytics_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A paginated list of grouList resources returned in response to a
  * youtubeAnalytics.groupApi.list request.
  */
@js.native
trait Schema$GroupListResponse extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Schema$Group]] = js.native
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GroupListResponse {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Schema$Group] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$GroupListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupListResponse]
  }
}

