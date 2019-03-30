package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessageListResponse extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var eventId: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[LiveChatMessage]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var offlineAt: js.UndefOr[java.lang.String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  var pollingIntervalMillis: js.UndefOr[scala.Double] = js.undefined
  var tokenPagination: js.UndefOr[js.Any] = js.undefined
   // Schema.TokenPagination
  var visitorId: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatMessageListResponse {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    eventId: java.lang.String = null,
    items: js.Array[LiveChatMessage] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    offlineAt: java.lang.String = null,
    pageInfo: PageInfo = null,
    pollingIntervalMillis: scala.Int | scala.Double = null,
    tokenPagination: js.Any = null,
    visitorId: java.lang.String = null
  ): LiveChatMessageListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (offlineAt != null) __obj.updateDynamic("offlineAt")(offlineAt)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    if (pollingIntervalMillis != null) __obj.updateDynamic("pollingIntervalMillis")(pollingIntervalMillis.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination)
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId)
    __obj.asInstanceOf[LiveChatMessageListResponse]
  }
}

