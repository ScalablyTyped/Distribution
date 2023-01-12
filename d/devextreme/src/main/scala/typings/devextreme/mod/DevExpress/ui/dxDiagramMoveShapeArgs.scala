package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramMoveShapeArgs extends StObject {
  
  /**
    * The new shape position.
    */
  var newPosition: js.UndefOr[Y] = js.undefined
  
  /**
    * The previous shape position.
    */
  var oldPosition: js.UndefOr[Y] = js.undefined
  
  /**
    * The processed shape.
    */
  var shape: js.UndefOr[dxDiagramShape] = js.undefined
}
object dxDiagramMoveShapeArgs {
  
  inline def apply(): dxDiagramMoveShapeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramMoveShapeArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxDiagramMoveShapeArgs] (val x: Self) extends AnyVal {
    
    inline def setNewPosition(value: Y): Self = StObject.set(x, "newPosition", value.asInstanceOf[js.Any])
    
    inline def setNewPositionUndefined: Self = StObject.set(x, "newPosition", js.undefined)
    
    inline def setOldPosition(value: Y): Self = StObject.set(x, "oldPosition", value.asInstanceOf[js.Any])
    
    inline def setOldPositionUndefined: Self = StObject.set(x, "oldPosition", js.undefined)
    
    inline def setShape(value: dxDiagramShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
