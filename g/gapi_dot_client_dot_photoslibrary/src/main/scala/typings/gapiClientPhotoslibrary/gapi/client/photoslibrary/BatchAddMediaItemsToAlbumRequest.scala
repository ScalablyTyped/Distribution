package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAddMediaItemsToAlbumRequest extends js.Object {
  /**
    * Identifiers of the MediaItems to be
    * added.
    * The maximum number of media items that can be added in one call is 50.
    */
  var mediaItemIds: js.UndefOr[js.Array[String]] = js.undefined
}

object BatchAddMediaItemsToAlbumRequest {
  @scala.inline
  def apply(mediaItemIds: js.Array[String] = null): BatchAddMediaItemsToAlbumRequest = {
    val __obj = js.Dynamic.literal()
    if (mediaItemIds != null) __obj.updateDynamic("mediaItemIds")(mediaItemIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAddMediaItemsToAlbumRequest]
  }
}

