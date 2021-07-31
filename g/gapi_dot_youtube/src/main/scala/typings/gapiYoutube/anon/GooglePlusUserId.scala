package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePlusUserId extends StObject {
  
  /**
    * The googlePlusUserId object identifies the Google+ profile ID associated with this channel.
    */
  var googlePlusUserId: String
  
  /**
    * The relatedPlaylists object is a map that identifies playlists associated with the channel, such as the channels uploaded videos or favorite videos. You can retrieve any of these playlists using the playlists.list method.
    */
  var relatedPlaylists: Favorites
}
object GooglePlusUserId {
  
  @scala.inline
  def apply(googlePlusUserId: String, relatedPlaylists: Favorites): GooglePlusUserId = {
    val __obj = js.Dynamic.literal(googlePlusUserId = googlePlusUserId.asInstanceOf[js.Any], relatedPlaylists = relatedPlaylists.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePlusUserId]
  }
  
  @scala.inline
  implicit class GooglePlusUserIdMutableBuilder[Self <: GooglePlusUserId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGooglePlusUserId(value: String): Self = StObject.set(x, "googlePlusUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedPlaylists(value: Favorites): Self = StObject.set(x, "relatedPlaylists", value.asInstanceOf[js.Any])
  }
}
