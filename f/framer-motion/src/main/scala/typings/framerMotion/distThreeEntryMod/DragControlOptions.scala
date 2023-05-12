package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragControlOptions extends StObject {
  
  var cursorProgress: js.UndefOr[Point] = js.undefined
  
  var snapToCursor: js.UndefOr[Boolean] = js.undefined
}
object DragControlOptions {
  
  inline def apply(): DragControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragControlOptions] (val x: Self) extends AnyVal {
    
    inline def setCursorProgress(value: Point): Self = StObject.set(x, "cursorProgress", value.asInstanceOf[js.Any])
    
    inline def setCursorProgressUndefined: Self = StObject.set(x, "cursorProgress", js.undefined)
    
    inline def setSnapToCursor(value: Boolean): Self = StObject.set(x, "snapToCursor", value.asInstanceOf[js.Any])
    
    inline def setSnapToCursorUndefined: Self = StObject.set(x, "snapToCursor", js.undefined)
  }
}
