package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateMediaItemsRequest extends js.Object {
  /**
    * Identifier of the album where the media items are added. The media items
    * are also added to the user's library. This is an optional field.
    */
  var albumId: js.UndefOr[String] = js.native
  /**
    * Position in the album where the media items are added. If not
    * specified, the media items are added to the end of the album (as per
    * the default value, that is, `LAST_IN_ALBUM`). The request fails if this
    * field is set and the `albumId` is not specified. The request will also fail
    * if you set the field and are not the owner of the shared album.
    */
  var albumPosition: js.UndefOr[AlbumPosition] = js.native
  /** List of media items to be created. */
  var newMediaItems: js.UndefOr[js.Array[NewMediaItem]] = js.native
}

object BatchCreateMediaItemsRequest {
  @scala.inline
  def apply(): BatchCreateMediaItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateMediaItemsRequest]
  }
  @scala.inline
  implicit class BatchCreateMediaItemsRequestOps[Self <: BatchCreateMediaItemsRequest] (val x: Self) extends AnyVal {
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
    def setAlbumPosition(value: AlbumPosition): Self = this.set("albumPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbumPosition: Self = this.set("albumPosition", js.undefined)
    @scala.inline
    def setNewMediaItemsVarargs(value: NewMediaItem*): Self = this.set("newMediaItems", js.Array(value :_*))
    @scala.inline
    def setNewMediaItems(value: js.Array[NewMediaItem]): Self = this.set("newMediaItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewMediaItems: Self = this.set("newMediaItems", js.undefined)
  }
  
}

