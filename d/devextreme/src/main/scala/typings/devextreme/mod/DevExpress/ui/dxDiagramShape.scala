package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.HeightWidth
import typings.devextreme.anon.Y
import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramShapeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramShape
  extends StObject
     with dxDiagramItem {
  
  /**
    * Gets an array of attached connector identifiers.
    */
  var attachedConnectorIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Gets identifiers of shapes stored in the container.
    */
  var containerChildItemIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Gets whether the container is expanded.
    */
  var containerExpanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the identifier of the container that stores the shape.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the position of the top left shape corner relative to the top left corner of the diagram work area.
    */
  var position: js.UndefOr[Y] = js.undefined
  
  /**
    * Specifies the shape size.
    */
  var size: js.UndefOr[HeightWidth] = js.undefined
  
  /**
    * Specifies the shape&apos;s text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the shape type. The built-in shape types are shown in the Shape Types section.
    */
  var `type`: js.UndefOr[DiagramShapeType | String] = js.undefined
}
object dxDiagramShape {
  
  inline def apply(): dxDiagramShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramShape]
  }
  
  extension [Self <: dxDiagramShape](x: Self) {
    
    inline def setAttachedConnectorIds(value: js.Array[String]): Self = StObject.set(x, "attachedConnectorIds", value.asInstanceOf[js.Any])
    
    inline def setAttachedConnectorIdsUndefined: Self = StObject.set(x, "attachedConnectorIds", js.undefined)
    
    inline def setAttachedConnectorIdsVarargs(value: String*): Self = StObject.set(x, "attachedConnectorIds", js.Array(value*))
    
    inline def setContainerChildItemIds(value: js.Array[String]): Self = StObject.set(x, "containerChildItemIds", value.asInstanceOf[js.Any])
    
    inline def setContainerChildItemIdsUndefined: Self = StObject.set(x, "containerChildItemIds", js.undefined)
    
    inline def setContainerChildItemIdsVarargs(value: String*): Self = StObject.set(x, "containerChildItemIds", js.Array(value*))
    
    inline def setContainerExpanded(value: Boolean): Self = StObject.set(x, "containerExpanded", value.asInstanceOf[js.Any])
    
    inline def setContainerExpandedUndefined: Self = StObject.set(x, "containerExpanded", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setPosition(value: Y): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSize(value: HeightWidth): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: DiagramShapeType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
