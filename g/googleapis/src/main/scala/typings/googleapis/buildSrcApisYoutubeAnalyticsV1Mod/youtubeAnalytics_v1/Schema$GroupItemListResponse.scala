package typings.googleapis.buildSrcApisYoutubeAnalyticsV1Mod.youtubeAnalytics_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A paginated list of grouList resources returned in response to a
  * youtubeAnalytics.groupApi.list request.
  */
@js.native
trait Schema$GroupItemListResponse extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Schema$GroupItem]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object Schema$GroupItemListResponse {
  @scala.inline
  def apply(etag: String = null, items: js.Array[Schema$GroupItem] = null, kind: String = null): Schema$GroupItemListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupItemListResponse]
  }
}

