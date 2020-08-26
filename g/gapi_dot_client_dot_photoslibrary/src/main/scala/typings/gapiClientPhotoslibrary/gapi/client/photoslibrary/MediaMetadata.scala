package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaMetadata extends js.Object {
  /**
    * Time when the media item was first created (not when it was uploaded to
    * Google Photos).
    */
  var creationTime: js.UndefOr[String] = js.native
  /** Original height (in pixels) of the media item. */
  var height: js.UndefOr[String] = js.native
  /** Metadata for a photo media type. */
  var photo: js.UndefOr[Photo] = js.native
  /** Metadata for a video media type. */
  var video: js.UndefOr[Video] = js.native
  /** Original width (in pixels) of the media item. */
  var width: js.UndefOr[String] = js.native
}

object MediaMetadata {
  @scala.inline
  def apply(): MediaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaMetadata]
  }
  @scala.inline
  implicit class MediaMetadataOps[Self <: MediaMetadata] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPhoto(value: Photo): Self = this.set("photo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    @scala.inline
    def setVideo(value: Video): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

