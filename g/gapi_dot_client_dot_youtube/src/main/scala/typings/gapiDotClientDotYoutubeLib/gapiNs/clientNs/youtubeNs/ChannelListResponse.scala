package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelListResponse extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[java.lang.String] = js.undefined
  /** A list of channels that match the request criteria. */
  var items: js.UndefOr[js.Array[Channel]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#channelListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  /** The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set. */
  var prevPageToken: js.UndefOr[java.lang.String] = js.undefined
  var tokenPagination: js.UndefOr[js.Any] = js.undefined
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelListResponse {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    eventId: java.lang.String = null,
    items: js.Array[Channel] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    pageInfo: PageInfo = null,
    prevPageToken: java.lang.String = null,
    tokenPagination: js.Any = null,
    visitorId: java.lang.String = null
  ): ChannelListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    if (prevPageToken != null) __obj.updateDynamic("prevPageToken")(prevPageToken)
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination)
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId)
    __obj.asInstanceOf[ChannelListResponse]
  }
}

