package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramShapeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramAddShapeFromToolboxArgs extends StObject {
  
  /**
    * The type of the processed shape.
    */
  var shapeType: js.UndefOr[DiagramShapeType | String] = js.undefined
}
object dxDiagramAddShapeFromToolboxArgs {
  
  inline def apply(): dxDiagramAddShapeFromToolboxArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramAddShapeFromToolboxArgs]
  }
  
  extension [Self <: dxDiagramAddShapeFromToolboxArgs](x: Self) {
    
    inline def setShapeType(value: DiagramShapeType | String): Self = StObject.set(x, "shapeType", value.asInstanceOf[js.Any])
    
    inline def setShapeTypeUndefined: Self = StObject.set(x, "shapeType", js.undefined)
  }
}
