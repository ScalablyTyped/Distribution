package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Favorites extends StObject {
  
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
  implicit class FavoritesMutableBuilder[Self <: Favorites] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFavorites(value: String): Self = StObject.set(x, "favorites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikes(value: String): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploads(value: String): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchHistory(value: String): Self = StObject.set(x, "watchHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchLater(value: String): Self = StObject.set(x, "watchLater", value.asInstanceOf[js.Any])
  }
}
