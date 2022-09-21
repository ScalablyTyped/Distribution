package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramShapeCategory
import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramShapeType
import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramToolboxDisplayMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayMode extends StObject {
  
  /**
    * Specifies the category of shapes that are displayed in the group.
    */
  var category: js.UndefOr[DiagramShapeCategory | String] = js.undefined
  
  /**
    * Specifies how shapes are displayed in the toolbox.
    */
  var displayMode: js.UndefOr[DiagramToolboxDisplayMode] = js.undefined
  
  /**
    * Specifies whether the group is expanded.
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Lists the shapes in the group. The built-in shape types are shown in the Shape Types section.
    */
  var shapes: js.UndefOr[js.Array[DiagramShapeType | String]] = js.undefined
  
  /**
    * Specifies the group title in the toolbox.
    */
  var title: js.UndefOr[String] = js.undefined
}
object DisplayMode {
  
  inline def apply(): DisplayMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayMode]
  }
  
  extension [Self <: DisplayMode](x: Self) {
    
    inline def setCategory(value: DiagramShapeCategory | String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDisplayMode(value: DiagramToolboxDisplayMode): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setShapes(value: js.Array[DiagramShapeType | String]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    inline def setShapesVarargs(value: (DiagramShapeType | String)*): Self = StObject.set(x, "shapes", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
