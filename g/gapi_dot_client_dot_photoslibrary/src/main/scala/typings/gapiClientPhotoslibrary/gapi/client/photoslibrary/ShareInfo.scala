package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareInfo extends js.Object {
  /**
    * True if the user has joined the album. This is always true for the owner
    * of the shared album.
    */
  var isJoined: js.UndefOr[Boolean] = js.native
  /** True if the user owns the album. */
  var isOwned: js.UndefOr[Boolean] = js.native
  /**
    * A token that can be used by other users to join this shared album via the
    * API.
    */
  var shareToken: js.UndefOr[String] = js.native
  /**
    * A link to the album that's now shared on the Google Photos website and app.
    * Anyone with the link can access this shared album and see all of the items
    * present in the album.
    */
  var shareableUrl: js.UndefOr[String] = js.native
  /** Options that control the sharing of an album. */
  var sharedAlbumOptions: js.UndefOr[SharedAlbumOptions] = js.native
}

object ShareInfo {
  @scala.inline
  def apply(): ShareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareInfo]
  }
  @scala.inline
  implicit class ShareInfoOps[Self <: ShareInfo] (val x: Self) extends AnyVal {
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
    def setIsJoined(value: Boolean): Self = this.set("isJoined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsJoined: Self = this.set("isJoined", js.undefined)
    @scala.inline
    def setIsOwned(value: Boolean): Self = this.set("isOwned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOwned: Self = this.set("isOwned", js.undefined)
    @scala.inline
    def setShareToken(value: String): Self = this.set("shareToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareToken: Self = this.set("shareToken", js.undefined)
    @scala.inline
    def setShareableUrl(value: String): Self = this.set("shareableUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareableUrl: Self = this.set("shareableUrl", js.undefined)
    @scala.inline
    def setSharedAlbumOptions(value: SharedAlbumOptions): Self = this.set("sharedAlbumOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedAlbumOptions: Self = this.set("sharedAlbumOptions", js.undefined)
  }
  
}

