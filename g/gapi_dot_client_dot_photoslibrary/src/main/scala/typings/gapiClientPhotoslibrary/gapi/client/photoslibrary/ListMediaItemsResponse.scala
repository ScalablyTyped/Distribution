package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMediaItemsResponse extends js.Object {
  /** Output only. List of media items in the user's library. */
  var mediaItems: js.UndefOr[js.Array[MediaItem]] = js.undefined
  /**
    * Output only. Token to use to get the next set of media items. Its presence
    * is the only reliable indicator of more media items being available in the
    * next request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListMediaItemsResponse {
  @scala.inline
  def apply(mediaItems: js.Array[MediaItem] = null, nextPageToken: String = null): ListMediaItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (mediaItems != null) __obj.updateDynamic("mediaItems")(mediaItems.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMediaItemsResponse]
  }
}

