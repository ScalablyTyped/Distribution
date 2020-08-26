package typings.gapiClientYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Favorites extends js.Object {
  /**
    * The ID of the playlist that contains the channel"s favorite videos. Use the  playlistItems.insert and  playlistItems.delete to add or remove items from
    * that list.
    */
  var favorites: js.UndefOr[String] = js.native
  /**
    * The ID of the playlist that contains the channel"s liked videos. Use the   playlistItems.insert and  playlistItems.delete to add or remove items from
    * that list.
    */
  var likes: js.UndefOr[String] = js.native
  /**
    * The ID of the playlist that contains the channel"s uploaded videos. Use the  videos.insert method to upload new videos and the videos.delete method to
    * delete previously uploaded videos.
    */
  var uploads: js.UndefOr[String] = js.native
  /**
    * The ID of the playlist that contains the channel"s watch history. Use the  playlistItems.insert and  playlistItems.delete to add or remove items from
    * that list.
    */
  var watchHistory: js.UndefOr[String] = js.native
  /**
    * The ID of the playlist that contains the channel"s watch later playlist. Use the playlistItems.insert and  playlistItems.delete to add or remove items
    * from that list.
    */
  var watchLater: js.UndefOr[String] = js.native
}

object Favorites {
  @scala.inline
  def apply(): Favorites = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Favorites]
  }
  @scala.inline
  implicit class FavoritesOps[Self <: Favorites] (val x: Self) extends AnyVal {
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

