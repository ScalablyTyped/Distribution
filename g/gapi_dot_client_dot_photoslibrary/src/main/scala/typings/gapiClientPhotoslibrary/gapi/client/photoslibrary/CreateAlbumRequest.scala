package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAlbumRequest extends js.Object {
  /** The album to be created. */
  var album: js.UndefOr[Album] = js.native
}

object CreateAlbumRequest {
  @scala.inline
  def apply(): CreateAlbumRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAlbumRequest]
  }
  @scala.inline
  implicit class CreateAlbumRequestOps[Self <: CreateAlbumRequest] (val x: Self) extends AnyVal {
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
    def setAlbum(value: Album): Self = this.set("album", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbum: Self = this.set("album", js.undefined)
  }
  
}

