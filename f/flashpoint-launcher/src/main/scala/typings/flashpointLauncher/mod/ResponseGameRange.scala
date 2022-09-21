package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseGameRange[T /* <: Boolean */] extends StObject {
  
  /** Games found within the range. */
  var games: js.Array[Game | ViewGame]
  
  /** Number of games requested. */
  var length: js.UndefOr[Double] = js.undefined
  
  /** Index of the first game. */
  var start: Double
}
object ResponseGameRange {
  
  inline def apply[T /* <: Boolean */](games: js.Array[Game | ViewGame], start: Double): ResponseGameRange[T] = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseGameRange[T]]
  }
  
  extension [Self <: ResponseGameRange[?], T /* <: Boolean */](x: Self & ResponseGameRange[T]) {
    
    inline def setGames(value: js.Array[Game | ViewGame]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    inline def setGamesVarargs(value: (Game | ViewGame)*): Self = StObject.set(x, "games", js.Array(value*))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
