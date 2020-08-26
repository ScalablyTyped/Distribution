package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchMediaItemsRequest extends js.Object {
  /**
    * Identifier of an album. If populated, lists all media items in
    * specified album. Can't set in conjunction with any filters.
    */
  var albumId: js.UndefOr[String] = js.native
  /**
    * Filters to apply to the request. Can't be set in conjunction with an
    * `albumId`.
    */
  var filters: js.UndefOr[Filters] = js.native
  /**
    * Maximum number of media items to return in the response. Fewer media items
    * might be returned than the specified number. The default `pageSize` is 25,
    * the maximum is 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A continuation token to get the next page of the results. Adding this to
    * the request returns the rows after the `pageToken`. The `pageToken` should
    * be the value returned in the `nextPageToken` parameter in the response to
    * the `searchMediaItems` request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object SearchMediaItemsRequest {
  @scala.inline
  def apply(): SearchMediaItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchMediaItemsRequest]
  }
  @scala.inline
  implicit class SearchMediaItemsRequestOps[Self <: SearchMediaItemsRequest] (val x: Self) extends AnyVal {
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
    def setAlbumId(value: String): Self = this.set("albumId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbumId: Self = this.set("albumId", js.undefined)
    @scala.inline
    def setFilters(value: Filters): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

