package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$VideoCategoryListResponse extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Serialized EventId of the request which produced this response.
    */
  var eventId: js.UndefOr[String] = js.native
  /**
    * A list of video categories that can be associated with YouTube videos. In
    * this map, the video category ID is the map key, and its value is the
    * corresponding videoCategory resource.
    */
  var items: js.UndefOr[js.Array[Schema$VideoCategory]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#videoCategoryListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The token that can be used as the value of the pageToken parameter to
    * retrieve the next page in the result set.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  var pageInfo: js.UndefOr[Schema$PageInfo] = js.native
  /**
    * The token that can be used as the value of the pageToken parameter to
    * retrieve the previous page in the result set.
    */
  var prevPageToken: js.UndefOr[String] = js.native
  var tokenPagination: js.UndefOr[Schema$TokenPagination] = js.native
  /**
    * The visitorId identifies the visitor.
    */
  var visitorId: js.UndefOr[String] = js.native
}

object Schema$VideoCategoryListResponse {
  @scala.inline
  def apply(
    etag: String = null,
    eventId: String = null,
    items: js.Array[Schema$VideoCategory] = null,
    kind: String = null,
    nextPageToken: String = null,
    pageInfo: Schema$PageInfo = null,
    prevPageToken: String = null,
    tokenPagination: Schema$TokenPagination = null,
    visitorId: String = null
  ): Schema$VideoCategoryListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (eventId != null) __obj.updateDynamic("eventId")(eventId.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (prevPageToken != null) __obj.updateDynamic("prevPageToken")(prevPageToken.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoCategoryListResponse]
  }
}

