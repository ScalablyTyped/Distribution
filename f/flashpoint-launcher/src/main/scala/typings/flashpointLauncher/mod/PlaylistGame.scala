package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistGame extends StObject {
  
  /** Game this represents (either ID or Game will exist) */
  var game: js.UndefOr[Game] = js.undefined
  
  /** Game this represents (either ID or Game will exist) */
  var gameId: js.UndefOr[String] = js.undefined
  
  /** Internal ID of the playlist game entry */
  var id: js.UndefOr[String] = js.undefined
  
  /** Notes for the game inside the playlist specifically */
  var notes: String
  
  /** Order priority of the game in the playlist */
  var order: Double
  
  /** Playlist which owns this game (either ID or Playlist will exist) */
  var playlist: js.UndefOr[Playlist] = js.undefined
  
  /** Playlist which owns this game (either ID or Playlist will exist) */
  var playlistId: js.UndefOr[String] = js.undefined
}
object PlaylistGame {
  
  inline def apply(notes: String, order: Double): PlaylistGame = {
    val __obj = js.Dynamic.literal(notes = notes.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistGame]
  }
  
  extension [Self <: PlaylistGame](x: Self) {
    
    inline def setGame(value: Game): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
    
    inline def setGameId(value: String): Self = StObject.set(x, "gameId", value.asInstanceOf[js.Any])
    
    inline def setGameIdUndefined: Self = StObject.set(x, "gameId", js.undefined)
    
    inline def setGameUndefined: Self = StObject.set(x, "game", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setPlaylist(value: Playlist): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
    
    inline def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
    
    inline def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
    
    inline def setPlaylistUndefined: Self = StObject.set(x, "playlist", js.undefined)
  }
}
