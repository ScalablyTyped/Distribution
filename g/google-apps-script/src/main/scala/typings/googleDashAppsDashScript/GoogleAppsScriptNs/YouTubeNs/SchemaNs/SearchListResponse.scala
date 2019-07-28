package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchListResponse extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var eventId: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[SearchResult]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  var prevPageToken: js.UndefOr[String] = js.undefined
  var regionCode: js.UndefOr[String] = js.undefined
  var tokenPagination: js.UndefOr[js.Any] = js.undefined
   // Schema.TokenPagination
  var visitorId: js.UndefOr[String] = js.undefined
}

object SearchListResponse {
  @scala.inline
  def apply(
    etag: String = null,
    eventId: String = null,
    items: js.Array[SearchResult] = null,
    kind: String = null,
    nextPageToken: String = null,
    pageInfo: PageInfo = null,
    prevPageToken: String = null,
    regionCode: String = null,
    tokenPagination: js.Any = null,
    visitorId: String = null
  ): SearchListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    if (prevPageToken != null) __obj.updateDynamic("prevPageToken")(prevPageToken)
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode)
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination)
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId)
    __obj.asInstanceOf[SearchListResponse]
  }
}

