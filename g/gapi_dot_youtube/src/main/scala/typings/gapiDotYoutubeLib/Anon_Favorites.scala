package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Favorites extends js.Object {
  /**
    * The ID of the playlist that contains the channels favorite videos.
    */
  var favorites: java.lang.String
  /**
    * The ID of the playlist that contains the channels liked videos.
    */
  var likes: java.lang.String
  /**
    * The ID of the playlist that contains the channels uploaded videos.
    */
  var uploads: java.lang.String
  /**
    * The ID of the playlist that contains the channels watch history.
    */
  var watchHistory: java.lang.String
  /**
    * The ID of the channels watch later playlist.
    */
  var watchLater: java.lang.String
}

object Anon_Favorites {
  @scala.inline
  def apply(
    favorites: java.lang.String,
    likes: java.lang.String,
    uploads: java.lang.String,
    watchHistory: java.lang.String,
    watchLater: java.lang.String
  ): Anon_Favorites = {
    val __obj = js.Dynamic.literal(favorites = favorites, likes = likes, uploads = uploads, watchHistory = watchHistory, watchLater = watchLater)
  
    __obj.asInstanceOf[Anon_Favorites]
  }
}

