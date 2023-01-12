package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  /**
    * Position of the active match.
    */
  var activeMatchOrdinal: Double
  
  var finalUpdate: Boolean
  
  /**
    * Number of Matches.
    */
  var matches: Double
  
  var requestId: Double
  
  /**
    * Coordinates of first match region.
    */
  var selectionArea: Rectangle
}
object Result {
  
  inline def apply(
    activeMatchOrdinal: Double,
    finalUpdate: Boolean,
    matches: Double,
    requestId: Double,
    selectionArea: Rectangle
  ): Result = {
    val __obj = js.Dynamic.literal(activeMatchOrdinal = activeMatchOrdinal.asInstanceOf[js.Any], finalUpdate = finalUpdate.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], selectionArea = selectionArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    inline def setActiveMatchOrdinal(value: Double): Self = StObject.set(x, "activeMatchOrdinal", value.asInstanceOf[js.Any])
    
    inline def setFinalUpdate(value: Boolean): Self = StObject.set(x, "finalUpdate", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: Double): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setSelectionArea(value: Rectangle): Self = StObject.set(x, "selectionArea", value.asInstanceOf[js.Any])
  }
}
