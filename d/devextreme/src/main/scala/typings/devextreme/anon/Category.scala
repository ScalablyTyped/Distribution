package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramShapeCategory
import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramShapeType
import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramToolboxDisplayMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  /**
    * Specifies the category of shapes that are displayed in the context toolbox.
    */
  var category: js.UndefOr[DiagramShapeCategory | String] = js.undefined
  
  /**
    * Specifies how shapes are displayed in the context toolbox.
    */
  var displayMode: js.UndefOr[DiagramToolboxDisplayMode] = js.undefined
  
  /**
    * Specifies the context toolbox&apos;s availability.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the number of shape icons in a row.
    */
  var shapeIconsPerRow: js.UndefOr[Double] = js.undefined
  
  /**
    * Lists the shapes that are displayed in the context toolbox. The built-in shape types are shown in the Shape Types section.
    */
  var shapes: js.UndefOr[js.Array[DiagramShapeType | String]] = js.undefined
  
  /**
    * Specifies the context toolbox&apos;s width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Category {
  
  inline def apply(): Category = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: DiagramShapeCategory | String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDisplayMode(value: DiagramToolboxDisplayMode): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setShapeIconsPerRow(value: Double): Self = StObject.set(x, "shapeIconsPerRow", value.asInstanceOf[js.Any])
    
    inline def setShapeIconsPerRowUndefined: Self = StObject.set(x, "shapeIconsPerRow", js.undefined)
    
    inline def setShapes(value: js.Array[DiagramShapeType | String]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    inline def setShapesVarargs(value: (DiagramShapeType | String)*): Self = StObject.set(x, "shapes", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
