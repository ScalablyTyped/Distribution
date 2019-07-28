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
    val __obj = js.Dynamic.literal(favorites = favorites, likes = likes, uploads = uploads, watchHistory = watchHistory, watchLater = watchLater)
  
    __obj.asInstanceOf[Anon_Favorites]
  }
}

