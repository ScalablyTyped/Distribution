package typings.gapiYoutube

import typings.gapiYoutube.anon.ResultsPerPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubePaginationInfo[T] extends js.Object {
  /**
    * The ETag of the response.
    */
  var etag: String = js.native
  /**
    * A list of activities, or events, that match the request criteria.
    */
  var items: js.Array[T] = js.native
  /**
    * The type of the API response. For this operation, the value will be youtube#activityListResponse.
    */
  var kind: String = js.native
  /**
    * The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.
    */
  var nextPageToken: String = js.native
  /**
    * The pageInfo object encapsulates paging information for the result set.
    */
  var pageInfo: ResultsPerPage = js.native
  /**
    * The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set.
    */
  var prevPageToken: String = js.native
}

object GoogleApiYouTubePaginationInfo {
  @scala.inline
  def apply[T](
    etag: String,
    items: js.Array[T],
    kind: String,
    nextPageToken: String,
    pageInfo: ResultsPerPage,
    prevPageToken: String
  ): GoogleApiYouTubePaginationInfo[T] = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any], prevPageToken = prevPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubePaginationInfo[T]]
  }
  @scala.inline
  implicit class GoogleApiYouTubePaginationInfoOps[Self <: GoogleApiYouTubePaginationInfo[_], T] (val x: Self with GoogleApiYouTubePaginationInfo[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageInfo(value: ResultsPerPage): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevPageToken(value: String): Self = this.set("prevPageToken", value.asInstanceOf[js.Any])
  }
  
}

