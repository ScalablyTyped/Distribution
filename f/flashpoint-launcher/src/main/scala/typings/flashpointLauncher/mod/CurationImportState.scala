package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurationImportState extends StObject {
  
  /** Files / Folders being copied, and to where */
  var contentToMove: js.Array[js.Array[String]]
  
  /** Path of the curation */
  var curationPath: String
  
  /** Game being imported */
  var game: Game
}
object CurationImportState {
  
  inline def apply(contentToMove: js.Array[js.Array[String]], curationPath: String, game: Game): CurationImportState = {
    val __obj = js.Dynamic.literal(contentToMove = contentToMove.asInstanceOf[js.Any], curationPath = curationPath.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurationImportState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurationImportState] (val x: Self) extends AnyVal {
    
    inline def setContentToMove(value: js.Array[js.Array[String]]): Self = StObject.set(x, "contentToMove", value.asInstanceOf[js.Any])
    
    inline def setContentToMoveVarargs(value: js.Array[String]*): Self = StObject.set(x, "contentToMove", js.Array(value*))
    
    inline def setCurationPath(value: String): Self = StObject.set(x, "curationPath", value.asInstanceOf[js.Any])
    
    inline def setGame(value: Game): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
  }
}
