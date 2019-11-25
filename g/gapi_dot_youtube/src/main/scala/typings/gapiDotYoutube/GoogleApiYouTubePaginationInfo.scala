package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubePaginationInfo[T] extends js.Object {
  /**
    * The ETag of the response.
    */
  var etag: String
  /**
    * A list of activities, or events, that match the request criteria.
    */
  var items: js.Array[T]
  /**
    * The type of the API response. For this operation, the value will be youtube#activityListResponse.
    */
  var kind: String
  /**
    * The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.
    */
  var nextPageToken: String
  /**
    * The pageInfo object encapsulates paging information for the result set.
    */
  var pageInfo: Anon_ResultsPerPage
  /**
    * The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set.
    */
  var prevPageToken: String
}

object GoogleApiYouTubePaginationInfo {
  @scala.inline
  def apply[T](
    etag: String,
    items: js.Array[T],
    kind: String,
    nextPageToken: String,
    pageInfo: Anon_ResultsPerPage,
    prevPageToken: String
  ): GoogleApiYouTubePaginationInfo[T] = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any], prevPageToken = prevPageToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiYouTubePaginationInfo[T]]
  }
}

