package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for ordering games. */
trait FilterGameOpts extends StObject {
  
  /** Playlist to limit the results to (no playlist limit will be applied if undefined). */
  var playlistId: js.UndefOr[String] = js.undefined
  
  /** Search query to filter by */
  var searchQuery: js.UndefOr[ParsedSearch] = js.undefined
}
object FilterGameOpts {
  
  inline def apply(): FilterGameOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterGameOpts]
  }
  
  extension [Self <: FilterGameOpts](x: Self) {
    
    inline def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
    
    inline def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
    
    inline def setSearchQuery(value: ParsedSearch): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    
    inline def setSearchQueryUndefined: Self = StObject.set(x, "searchQuery", js.undefined)
  }
}
