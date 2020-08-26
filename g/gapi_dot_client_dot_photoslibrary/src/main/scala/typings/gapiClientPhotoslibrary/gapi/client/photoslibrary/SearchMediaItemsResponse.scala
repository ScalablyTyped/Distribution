package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchMediaItemsResponse extends js.Object {
  /** Output only. List of media items that match the search parameters. */
  var mediaItems: js.UndefOr[js.Array[MediaItem]] = js.native
  /**
    * Output only. Use this token to get the next set of media items. Its
    * presence is the only reliable indicator of more media items being available
    * in the next request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SearchMediaItemsResponse {
  @scala.inline
  def apply(): SearchMediaItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchMediaItemsResponse]
  }
  @scala.inline
  implicit class SearchMediaItemsResponseOps[Self <: SearchMediaItemsResponse] (val x: Self) extends AnyVal {
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
    def setMediaItemsVarargs(value: MediaItem*): Self = this.set("mediaItems", js.Array(value :_*))
    @scala.inline
    def setMediaItems(value: js.Array[MediaItem]): Self = this.set("mediaItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaItems: Self = this.set("mediaItems", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

