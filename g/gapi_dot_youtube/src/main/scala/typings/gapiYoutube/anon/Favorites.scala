package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Favorites extends js.Object {
  /**
    * The ID of the playlist that contains the channels favorite videos.
    */
  var favorites: String = js.native
  /**
    * The ID of the playlist that contains the channels liked videos.
    */
  var likes: String = js.native
  /**
    * The ID of the playlist that contains the channels uploaded videos.
    */
  var uploads: String = js.native
  /**
    * The ID of the playlist that contains the channels watch history.
    */
  var watchHistory: String = js.native
  /**
    * The ID of the channels watch later playlist.
    */
  var watchLater: String = js.native
}

object Favorites {
  @scala.inline
  def apply(favorites: String, likes: String, uploads: String, watchHistory: String, watchLater: String): Favorites = {
    val __obj = js.Dynamic.literal(favorites = favorites.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], uploads = uploads.asInstanceOf[js.Any], watchHistory = watchHistory.asInstanceOf[js.Any], watchLater = watchLater.asInstanceOf[js.Any])
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
    def setLikes(value: String): Self = this.set("likes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploads(value: String): Self = this.set("uploads", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatchHistory(value: String): Self = this.set("watchHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatchLater(value: String): Self = this.set("watchLater", value.asInstanceOf[js.Any])
  }
  
}

