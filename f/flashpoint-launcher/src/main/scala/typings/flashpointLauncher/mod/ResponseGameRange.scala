package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseGameRange[T /* <: Boolean */] extends StObject {
  
  /** Games found within the range. */
  var games: /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<flashpoint-launcher.flashpoint-launcher.ViewGame> : std.Array<flashpoint-launcher.flashpoint-launcher.Game> */ js.Any
  
  /** Number of games requested. */
  var length: js.UndefOr[Double] = js.undefined
  
  /** Index of the first game. */
  var start: Double
}
object ResponseGameRange {
  
  inline def apply[T /* <: Boolean */](
    games: /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<flashpoint-launcher.flashpoint-launcher.ViewGame> : std.Array<flashpoint-launcher.flashpoint-launcher.Game> */ js.Any,
    start: Double
  ): ResponseGameRange[T] = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseGameRange[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseGameRange[?], T /* <: Boolean */] (val x: Self & ResponseGameRange[T]) extends AnyVal {
    
    inline def setGames(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<flashpoint-launcher.flashpoint-launcher.ViewGame> : std.Array<flashpoint-launcher.flashpoint-launcher.Game> */ js.Any
    ): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
