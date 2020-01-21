package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFavorites extends js.Object {
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

object AnonFavorites {
  @scala.inline
  def apply(favorites: String, likes: String, uploads: String, watchHistory: String, watchLater: String): AnonFavorites = {
    val __obj = js.Dynamic.literal(favorites = favorites.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], uploads = uploads.asInstanceOf[js.Any], watchHistory = watchHistory.asInstanceOf[js.Any], watchLater = watchLater.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFavorites]
  }
}

