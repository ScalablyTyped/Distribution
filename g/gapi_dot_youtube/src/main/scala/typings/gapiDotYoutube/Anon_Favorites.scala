package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Favorites extends js.Object {
  /**
    * The ID of the playlist that contains the channels favorite videos.
    */
  var favorites: String
  /**
    * The ID of the playlist that contains the channels liked videos.
    */
  var likes: String
  /**
    * The ID of the playlist that contains the channels uploaded videos.
    */
  var uploads: String
  /**
    * The ID of the playlist that contains the channels watch history.
    */
  var watchHistory: String
  /**
    * The ID of the channels watch later playlist.
    */
  var watchLater: String
}

object Anon_Favorites {
  @scala.inline
  def apply(favorites: String, likes: String, uploads: String, watchHistory: String, watchLater: String): Anon_Favorites = {
    val __obj = js.Dynamic.literal(favorites = favorites.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], uploads = uploads.asInstanceOf[js.Any], watchHistory = watchHistory.asInstanceOf[js.Any], watchLater = watchLater.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Favorites]
  }
}

