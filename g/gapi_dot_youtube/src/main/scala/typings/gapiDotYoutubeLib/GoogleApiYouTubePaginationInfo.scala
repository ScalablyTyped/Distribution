package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubePaginationInfo[T] extends js.Object {
  /**
    * The ETag of the response.
    */
  var etag: java.lang.String
  /**
    * A list of activities, or events, that match the request criteria.
    */
  var items: js.Array[T]
  /**
    * The type of the API response. For this operation, the value will be youtube#activityListResponse.
    */
  var kind: java.lang.String
  /**
    * The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.
    */
  var nextPageToken: java.lang.String
  /**
    * The pageInfo object encapsulates paging information for the result set.
    */
  var pageInfo: Anon_ResultsPerPage
  /**
    * The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set.
    */
  var prevPageToken: java.lang.String
}

object GoogleApiYouTubePaginationInfo {
  @scala.inline
  def apply[T](
    etag: java.lang.String,
    items: js.Array[T],
    kind: java.lang.String,
    nextPageToken: java.lang.String,
    pageInfo: Anon_ResultsPerPage,
    prevPageToken: java.lang.String
  ): GoogleApiYouTubePaginationInfo[T] = {
    val __obj = js.Dynamic.literal(etag = etag, items = items, kind = kind, nextPageToken = nextPageToken, pageInfo = pageInfo, prevPageToken = prevPageToken)
  
    __obj.asInstanceOf[GoogleApiYouTubePaginationInfo[T]]
  }
}

