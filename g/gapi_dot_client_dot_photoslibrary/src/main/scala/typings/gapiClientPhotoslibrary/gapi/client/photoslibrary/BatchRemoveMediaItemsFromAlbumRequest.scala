package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRemoveMediaItemsFromAlbumRequest extends js.Object {
  /**
    * Identifiers of the MediaItems to be
    * removed.
    *
    * Must not contain repeated identifiers and cannot be empty. The maximum
    * number of media items that can be removed in one call is 50.
    */
  var mediaItemIds: js.UndefOr[js.Array[String]] = js.undefined
}

object BatchRemoveMediaItemsFromAlbumRequest {
  @scala.inline
  def apply(mediaItemIds: js.Array[String] = null): BatchRemoveMediaItemsFromAlbumRequest = {
    val __obj = js.Dynamic.literal()
    if (mediaItemIds != null) __obj.updateDynamic("mediaItemIds")(mediaItemIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRemoveMediaItemsFromAlbumRequest]
  }
}

