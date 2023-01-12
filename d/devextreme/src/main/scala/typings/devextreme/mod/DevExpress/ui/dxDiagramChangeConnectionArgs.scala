package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramConnectorPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramChangeConnectionArgs extends StObject {
  
  /**
    * The index of the processed point in the shape&apos;s connection point collection.
    */
  var connectionPointIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The processed connector.
    */
  var connector: js.UndefOr[dxDiagramConnector] = js.undefined
  
  /**
    * The position of the connector in the processed point.
    */
  var connectorPosition: js.UndefOr[DiagramConnectorPosition] = js.undefined
  
  /**
    * The new connected shape.
    */
  var newShape: js.UndefOr[dxDiagramShape] = js.undefined
  
  /**
    * The previous connected shape.
    */
  var oldShape: js.UndefOr[dxDiagramShape] = js.undefined
}
object dxDiagramChangeConnectionArgs {
  
  inline def apply(): dxDiagramChangeConnectionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramChangeConnectionArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxDiagramChangeConnectionArgs] (val x: Self) extends AnyVal {
    
    inline def setConnectionPointIndex(value: Double): Self = StObject.set(x, "connectionPointIndex", value.asInstanceOf[js.Any])
    
    inline def setConnectionPointIndexUndefined: Self = StObject.set(x, "connectionPointIndex", js.undefined)
    
    inline def setConnector(value: dxDiagramConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorPosition(value: DiagramConnectorPosition): Self = StObject.set(x, "connectorPosition", value.asInstanceOf[js.Any])
    
    inline def setConnectorPositionUndefined: Self = StObject.set(x, "connectorPosition", js.undefined)
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setNewShape(value: dxDiagramShape): Self = StObject.set(x, "newShape", value.asInstanceOf[js.Any])
    
    inline def setNewShapeUndefined: Self = StObject.set(x, "newShape", js.undefined)
    
    inline def setOldShape(value: dxDiagramShape): Self = StObject.set(x, "oldShape", value.asInstanceOf[js.Any])
    
    inline def setOldShapeUndefined: Self = StObject.set(x, "oldShape", js.undefined)
  }
}
