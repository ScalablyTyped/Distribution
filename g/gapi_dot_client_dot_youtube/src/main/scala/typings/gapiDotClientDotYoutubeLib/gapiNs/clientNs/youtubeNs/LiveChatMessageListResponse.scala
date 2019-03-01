package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessageListResponse extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[java.lang.String] = js.undefined
  /** A list of live chat messages. */
  var items: js.UndefOr[js.Array[LiveChatMessage]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveChatMessageListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time when the underlying stream went offline. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var offlineAt: js.UndefOr[java.lang.String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  /** The amount of time the client should wait before polling again. */
  var pollingIntervalMillis: js.UndefOr[scala.Double] = js.undefined
  var tokenPagination: js.UndefOr[js.Any] = js.undefined
  /** The visitorId identifies the visitor. */
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

