package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchMediaItemsRequest extends js.Object {
  /**
    * Identifier of an album. If populated, lists all media items in
    * specified album. Can't set in conjunction with any filters.
    */
  var albumId: js.UndefOr[String] = js.undefined
  /**
    * Filters to apply to the request. Can't be set in conjunction with an
    * `albumId`.
    */
  var filters: js.UndefOr[Filters] = js.undefined
  /**
    * Maximum number of media items to return in the response. Fewer media items
    * might be returned than the specified number. The default `pageSize` is 25,
    * the maximum is 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * A continuation token to get the next page of the results. Adding this to
    * the request returns the rows after the `pageToken`. The `pageToken` should
    * be the value returned in the `nextPageToken` parameter in the response to
    * the `searchMediaItems` request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object SearchMediaItemsRequest {
  @scala.inline
  def apply(
    albumId: String = null,
    filters: Filters = null,
    pageSize: Int | Double = null,
    pageToken: String = null
  ): SearchMediaItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (albumId != null) __obj.updateDynamic("albumId")(albumId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchMediaItemsRequest]
  }
}

