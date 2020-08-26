package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelContentDetailsRelatedPlaylists extends js.Object {
  var favorites: js.UndefOr[String] = js.native
  var likes: js.UndefOr[String] = js.native
  var uploads: js.UndefOr[String] = js.native
  var watchHistory: js.UndefOr[String] = js.native
  var watchLater: js.UndefOr[String] = js.native
}

object ChannelContentDetailsRelatedPlaylists {
  @scala.inline
  def apply(): ChannelContentDetailsRelatedPlaylists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelContentDetailsRelatedPlaylists]
  }
  @scala.inline
  implicit class ChannelContentDetailsRelatedPlaylistsOps[Self <: ChannelContentDetailsRelatedPlaylists] (val x: Self) extends AnyVal {
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
    def setFavorites(value: String): Self = this.set("favorites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFavorites: Self = this.set("favorites", js.undefined)
    @scala.inline
    def setLikes(value: String): Self = this.set("likes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLikes: Self = this.set("likes", js.undefined)
    @scala.inline
    def setUploads(value: String): Self = this.set("uploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploads: Self = this.set("uploads", js.undefined)
    @scala.inline
    def setWatchHistory(value: String): Self = this.set("watchHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchHistory: Self = this.set("watchHistory", js.undefined)
    @scala.inline
    def setWatchLater(value: String): Self = this.set("watchLater", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchLater: Self = this.set("watchLater", js.undefined)
  }
  
}

