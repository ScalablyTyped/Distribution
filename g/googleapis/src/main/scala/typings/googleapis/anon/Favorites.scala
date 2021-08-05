package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Favorites extends StObject {
  
  var favorites: js.UndefOr[String] = js.undefined
  
  var likes: js.UndefOr[String] = js.undefined
  
  var uploads: js.UndefOr[String] = js.undefined
  
  var watchHistory: js.UndefOr[String] = js.undefined
  
  var watchLater: js.UndefOr[String] = js.undefined
}
object Favorites {
  
  inline def apply(): Favorites = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Favorites]
  }
  
  extension [Self <: Favorites](x: Self) {
    
    inline def setFavorites(value: String): Self = StObject.set(x, "favorites", value.asInstanceOf[js.Any])
    
    inline def setFavoritesUndefined: Self = StObject.set(x, "favorites", js.undefined)
    
    inline def setLikes(value: String): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
    
    inline def setLikesUndefined: Self = StObject.set(x, "likes", js.undefined)
    
    inline def setUploads(value: String): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
    
    inline def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
    
    inline def setWatchHistory(value: String): Self = StObject.set(x, "watchHistory", value.asInstanceOf[js.Any])
    
    inline def setWatchHistoryUndefined: Self = StObject.set(x, "watchHistory", js.undefined)
    
    inline def setWatchLater(value: String): Self = StObject.set(x, "watchLater", value.asInstanceOf[js.Any])
    
    inline def setWatchLaterUndefined: Self = StObject.set(x, "watchLater", js.undefined)
  }
}
