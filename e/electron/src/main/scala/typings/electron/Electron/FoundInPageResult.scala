package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoundInPageResult extends StObject {
  
  /**
    * Position of the active match.
    */
  var activeMatchOrdinal: Double = js.native
  
  var finalUpdate: Boolean = js.native
  
  /**
    * Number of Matches.
    */
  var matches: Double = js.native
  
  var requestId: Double = js.native
  
  /**
    * Coordinates of first match region.
    */
  var selectionArea: Rectangle = js.native
}
object FoundInPageResult {
  
  @scala.inline
  def apply(
    activeMatchOrdinal: Double,
    finalUpdate: Boolean,
    matches: Double,
    requestId: Double,
    selectionArea: Rectangle
  ): FoundInPageResult = {
    val __obj = js.Dynamic.literal(activeMatchOrdinal = activeMatchOrdinal.asInstanceOf[js.Any], finalUpdate = finalUpdate.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], selectionArea = selectionArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoundInPageResult]
  }
  
  @scala.inline
  implicit class FoundInPageResultMutableBuilder[Self <: FoundInPageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveMatchOrdinal(value: Double): Self = StObject.set(x, "activeMatchOrdinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalUpdate(value: Boolean): Self = StObject.set(x, "finalUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatches(value: Double): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionArea(value: Rectangle): Self = StObject.set(x, "selectionArea", value.asInstanceOf[js.Any])
  }
}
