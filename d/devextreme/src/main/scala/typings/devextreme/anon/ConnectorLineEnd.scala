package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramConnectorLineEnd
import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramConnectorLineType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorLineEnd extends StObject {
  
  /**
    * Specifies the default tip of a connector&apos;s end point.
    */
  var connectorLineEnd: js.UndefOr[DiagramConnectorLineEnd] = js.undefined
  
  /**
    * Specifies the default tip of a connector&apos;s start point.
    */
  var connectorLineStart: js.UndefOr[DiagramConnectorLineEnd] = js.undefined
  
  /**
    * Specifies the default type of a connector.
    */
  var connectorLineType: js.UndefOr[DiagramConnectorLineType] = js.undefined
  
  /**
    * Specifies the default maximum height of a shape.
    */
  var shapeMaxHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the default maximum width of a shape.
    */
  var shapeMaxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the default minimum height of a shape.
    */
  var shapeMinHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the default minimum width of a shape.
    */
  var shapeMinWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a default item style.
    */
  var style: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Specifies an item&apos;s default text style.
    */
  var textStyle: js.UndefOr[js.Object] = js.undefined
}
object ConnectorLineEnd {
  
  inline def apply(): ConnectorLineEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorLineEnd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectorLineEnd] (val x: Self) extends AnyVal {
    
    inline def setConnectorLineEnd(value: DiagramConnectorLineEnd): Self = StObject.set(x, "connectorLineEnd", value.asInstanceOf[js.Any])
    
    inline def setConnectorLineEndUndefined: Self = StObject.set(x, "connectorLineEnd", js.undefined)
    
    inline def setConnectorLineStart(value: DiagramConnectorLineEnd): Self = StObject.set(x, "connectorLineStart", value.asInstanceOf[js.Any])
    
    inline def setConnectorLineStartUndefined: Self = StObject.set(x, "connectorLineStart", js.undefined)
    
    inline def setConnectorLineType(value: DiagramConnectorLineType): Self = StObject.set(x, "connectorLineType", value.asInstanceOf[js.Any])
    
    inline def setConnectorLineTypeUndefined: Self = StObject.set(x, "connectorLineType", js.undefined)
    
    inline def setShapeMaxHeight(value: Double): Self = StObject.set(x, "shapeMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setShapeMaxHeightUndefined: Self = StObject.set(x, "shapeMaxHeight", js.undefined)
    
    inline def setShapeMaxWidth(value: Double): Self = StObject.set(x, "shapeMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setShapeMaxWidthUndefined: Self = StObject.set(x, "shapeMaxWidth", js.undefined)
    
    inline def setShapeMinHeight(value: Double): Self = StObject.set(x, "shapeMinHeight", value.asInstanceOf[js.Any])
    
    inline def setShapeMinHeightUndefined: Self = StObject.set(x, "shapeMinHeight", js.undefined)
    
    inline def setShapeMinWidth(value: Double): Self = StObject.set(x, "shapeMinWidth", value.asInstanceOf[js.Any])
    
    inline def setShapeMinWidthUndefined: Self = StObject.set(x, "shapeMinWidth", js.undefined)
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTextStyle(value: js.Object): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
