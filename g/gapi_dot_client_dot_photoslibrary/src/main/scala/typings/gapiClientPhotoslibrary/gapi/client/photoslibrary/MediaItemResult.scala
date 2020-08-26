package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaItemResult extends js.Object {
  /**
    * Media item retrieved from the user's library. It's populated if no errors
    * occurred and the media item was fetched successfully.
    */
  var mediaItem: js.UndefOr[MediaItem] = js.native
  /**
    * If an error occurred while accessing this media item, this field
    * is populated with information related to the error. For details regarding
    * this field, see Status.
    */
  var status: js.UndefOr[Status] = js.native
}

object MediaItemResult {
  @scala.inline
  def apply(): MediaItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaItemResult]
  }
  @scala.inline
  implicit class MediaItemResultOps[Self <: MediaItemResult] (val x: Self) extends AnyVal {
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
    def setMediaItem(value: MediaItem): Self = this.set("mediaItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaItem: Self = this.set("mediaItem", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

