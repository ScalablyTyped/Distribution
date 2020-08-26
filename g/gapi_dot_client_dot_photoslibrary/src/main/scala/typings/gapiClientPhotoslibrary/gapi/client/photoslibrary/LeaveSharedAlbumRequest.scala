package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaveSharedAlbumRequest extends js.Object {
  /** Token to leave the shared album on behalf of the user. */
  var shareToken: js.UndefOr[String] = js.native
}

object LeaveSharedAlbumRequest {
  @scala.inline
  def apply(): LeaveSharedAlbumRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaveSharedAlbumRequest]
  }
  @scala.inline
  implicit class LeaveSharedAlbumRequestOps[Self <: LeaveSharedAlbumRequest] (val x: Self) extends AnyVal {
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
    def setShareToken(value: String): Self = this.set("shareToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareToken: Self = this.set("shareToken", js.undefined)
  }
  
}

