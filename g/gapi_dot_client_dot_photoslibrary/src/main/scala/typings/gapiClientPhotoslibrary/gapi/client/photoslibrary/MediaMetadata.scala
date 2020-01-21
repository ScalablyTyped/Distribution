package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaMetadata extends js.Object {
  /**
    * Time when the media item was first created (not when it was uploaded to
    * Google Photos).
    */
  var creationTime: js.UndefOr[String] = js.undefined
  /** Original height (in pixels) of the media item. */
  var height: js.UndefOr[String] = js.undefined
  /** Metadata for a photo media type. */
  var photo: js.UndefOr[Photo] = js.undefined
  /** Metadata for a video media type. */
  var video: js.UndefOr[Video] = js.undefined
  /** Original width (in pixels) of the media item. */
  var width: js.UndefOr[String] = js.undefined
}

object MediaMetadata {
  @scala.inline
  def apply(
    creationTime: String = null,
    height: String = null,
    photo: Photo = null,
    video: Video = null,
    width: String = null
  ): MediaMetadata = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaMetadata]
  }
}

