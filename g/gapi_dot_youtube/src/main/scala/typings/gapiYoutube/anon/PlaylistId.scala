package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistId extends StObject {
  
  /**
    * The value that YouTube uses to uniquely identify the playlist.
    */
  var playlistId: String = js.native
  
  /**
    * The value that YouTube uses to uniquely identify the item in the playlist.
    */
  var playlistItemId: String = js.native
  
  /**
    *  The resourceId object contains information that identifies the resource that was added to the playlist.
    */
  var resourceId: Kind = js.native
}
object PlaylistId {
  
  @scala.inline
  def apply(playlistId: String, playlistItemId: String, resourceId: Kind): PlaylistId = {
    val __obj = js.Dynamic.literal(playlistId = playlistId.asInstanceOf[js.Any], playlistItemId = playlistItemId.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistId]
  }
  
  @scala.inline
  implicit class PlaylistIdMutableBuilder[Self <: PlaylistId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistItemId(value: String): Self = StObject.set(x, "playlistItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: Kind): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
  }
}
