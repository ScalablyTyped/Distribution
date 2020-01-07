package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewMediaItemResult extends js.Object {
  /**
    * Media item created with the upload token. It's populated if no errors
    * occurred and the media item was created successfully.
    */
  var mediaItem: js.UndefOr[MediaItem] = js.undefined
  /**
    * If an error occurred during the creation of this media item, this field
    * is  populated with information related to the error. For details regarding
    * this field, see <a href="#Status">Status</a>.
    */
  var status: js.UndefOr[Status] = js.undefined
  /** The upload token used to create this new media item. */
  var uploadToken: js.UndefOr[String] = js.undefined
}

object NewMediaItemResult {
  @scala.inline
  def apply(mediaItem: MediaItem = null, status: Status = null, uploadToken: String = null): NewMediaItemResult = {
    val __obj = js.Dynamic.literal()
    if (mediaItem != null) __obj.updateDynamic("mediaItem")(mediaItem.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (uploadToken != null) __obj.updateDynamic("uploadToken")(uploadToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewMediaItemResult]
  }
}

