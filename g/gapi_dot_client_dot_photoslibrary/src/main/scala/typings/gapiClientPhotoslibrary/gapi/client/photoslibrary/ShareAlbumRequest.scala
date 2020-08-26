package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareAlbumRequest extends js.Object {
  /** Options to be set when converting the album to a shared album. */
  var sharedAlbumOptions: js.UndefOr[SharedAlbumOptions] = js.native
}

object ShareAlbumRequest {
  @scala.inline
  def apply(): ShareAlbumRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareAlbumRequest]
  }
  @scala.inline
  implicit class ShareAlbumRequestOps[Self <: ShareAlbumRequest] (val x: Self) extends AnyVal {
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
    def setSharedAlbumOptions(value: SharedAlbumOptions): Self = this.set("sharedAlbumOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedAlbumOptions: Self = this.set("sharedAlbumOptions", js.undefined)
  }
  
}

