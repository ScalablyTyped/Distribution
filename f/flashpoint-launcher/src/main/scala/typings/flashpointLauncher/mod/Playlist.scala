package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Playlist extends StObject {
  
  /** Author of the playlist. */
  var author: String
  
  /** Description of the playlist. */
  var description: String
  
  /** Attribute for if playlist contains games not suitable for children */
  var extreme: Boolean
  
  /** Games in this playlist */
  var games: js.Array[PlaylistGame]
  
  /** Icon of the playlist (Base64 encoded image). */
  var icon: String
  
  /** ID of the playlist (unique identifier) */
  var id: String
  
  /** Route of the library this playlist is for. */
  var library: String
  
  /** Title of the playlist. */
  var title: String
}
object Playlist {
  
  inline def apply(
    author: String,
    description: String,
    extreme: Boolean,
    games: js.Array[PlaylistGame],
    icon: String,
    id: String,
    library: String,
    title: String
  ): Playlist = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], extreme = extreme.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Playlist]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Playlist] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExtreme(value: Boolean): Self = StObject.set(x, "extreme", value.asInstanceOf[js.Any])
    
    inline def setGames(value: js.Array[PlaylistGame]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    inline def setGamesVarargs(value: PlaylistGame*): Self = StObject.set(x, "games", js.Array(value*))
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: String): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
