package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SearchListResponse extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[java.lang.String] = js.undefined
  /** A list of results that match the search criteria. */
  var items: js.UndefOr[js.Array[SearchResult]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#searchListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  /** The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set. */
  var prevPageToken: js.UndefOr[java.lang.String] = js.undefined
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
  var tokenPagination: js.UndefOr[js.Any] = js.undefined
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[java.lang.String] = js.undefined
}

