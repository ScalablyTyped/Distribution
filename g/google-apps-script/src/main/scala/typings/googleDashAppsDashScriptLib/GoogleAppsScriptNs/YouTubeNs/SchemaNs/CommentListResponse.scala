package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentListResponse extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var eventId: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[Comment]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  var tokenPagination: js.UndefOr[js.Any] = js.undefined
   // Schema.TokenPagination
  var visitorId: js.UndefOr[java.lang.String] = js.undefined
}

object CommentListResponse {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    eventId: java.lang.String = null,
    items: js.Array[Comment] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    pageInfo: PageInfo = null,
    tokenPagination: js.Any = null,
    visitorId: java.lang.String = null
  ): CommentListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination)
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId)
    __obj.asInstanceOf[CommentListResponse]
  }
}

