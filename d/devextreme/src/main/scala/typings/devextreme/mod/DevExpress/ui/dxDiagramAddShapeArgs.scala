package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramAddShapeArgs extends StObject {
  
  /**
    * A position where the shape is being added.
    */
  var position: js.UndefOr[Y] = js.undefined
  
  /**
    * The processed shape.
    */
  var shape: js.UndefOr[dxDiagramShape] = js.undefined
}
object dxDiagramAddShapeArgs {
  
  inline def apply(): dxDiagramAddShapeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramAddShapeArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxDiagramAddShapeArgs] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: Y): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShape(value: dxDiagramShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
