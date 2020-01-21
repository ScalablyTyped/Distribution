package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreateMediaItemsRequest extends js.Object {
  /**
    * Identifier of the album where the media items are added. The media items
    * are also added to the user's library. This is an optional field.
    */
  var albumId: js.UndefOr[String] = js.undefined
  /**
    * Position in the album where the media items are added. If not
    * specified, the media items are added to the end of the album (as per
    * the default value, that is, `LAST_IN_ALBUM`). The request fails if this
    * field is set and the `albumId` is not specified. The request will also fail
    * if you set the field and are not the owner of the shared album.
    */
  var albumPosition: js.UndefOr[AlbumPosition] = js.undefined
  /** List of media items to be created. */
  var newMediaItems: js.UndefOr[js.Array[NewMediaItem]] = js.undefined
}

object BatchCreateMediaItemsRequest {
  @scala.inline
  def apply(
    albumId: String = null,
    albumPosition: AlbumPosition = null,
    newMediaItems: js.Array[NewMediaItem] = null
  ): BatchCreateMediaItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (albumId != null) __obj.updateDynamic("albumId")(albumId.asInstanceOf[js.Any])
    if (albumPosition != null) __obj.updateDynamic("albumPosition")(albumPosition.asInstanceOf[js.Any])
    if (newMediaItems != null) __obj.updateDynamic("newMediaItems")(newMediaItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateMediaItemsRequest]
  }
}

