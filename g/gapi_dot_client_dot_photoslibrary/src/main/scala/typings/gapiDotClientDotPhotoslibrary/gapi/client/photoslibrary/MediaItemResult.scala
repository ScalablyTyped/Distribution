package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaItemResult extends js.Object {
  /**
    * Media item retrieved from the user's library. It's populated if no errors
    * occurred and the media item was fetched successfully.
    */
  var mediaItem: js.UndefOr[MediaItem] = js.undefined
  /**
    * If an error occurred while accessing this media item, this field
    * is populated with information related to the error. For details regarding
    * this field, see Status.
    */
  var status: js.UndefOr[Status] = js.undefined
}

object MediaItemResult {
  @scala.inline
  def apply(mediaItem: MediaItem = null, status: Status = null): MediaItemResult = {
    val __obj = js.Dynamic.literal()
    if (mediaItem != null) __obj.updateDynamic("mediaItem")(mediaItem.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaItemResult]
  }
}

