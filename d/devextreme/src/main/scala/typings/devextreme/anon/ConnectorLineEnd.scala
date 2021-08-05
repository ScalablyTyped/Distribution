package typings.devextreme.anon

import typings.devextreme.devextremeStrings.arrow
import typings.devextreme.devextremeStrings.filledTriangle
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.orthogonal
import typings.devextreme.devextremeStrings.outlinedTriangle
import typings.devextreme.devextremeStrings.straight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorLineEnd extends StObject {
  
  var connectorLineEnd: js.UndefOr[none | arrow | outlinedTriangle | filledTriangle] = js.undefined
  
  var connectorLineStart: js.UndefOr[none | arrow | outlinedTriangle | filledTriangle] = js.undefined
  
  var connectorLineType: js.UndefOr[straight | orthogonal] = js.undefined
  
  var shapeMaxHeight: js.UndefOr[Double] = js.undefined
  
  var shapeMaxWidth: js.UndefOr[Double] = js.undefined
  
  var shapeMinHeight: js.UndefOr[Double] = js.undefined
  
  var shapeMinWidth: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[js.Any] = js.undefined
  
  var textStyle: js.UndefOr[js.Any] = js.undefined
}
object ConnectorLineEnd {
  
  inline def apply(): ConnectorLineEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorLineEnd]
  }
  
  extension [Self <: ConnectorLineEnd](x: Self) {
    
    inline def setConnectorLineEnd(value: none | arrow | outlinedTriangle | filledTriangle): Self = StObject.set(x, "connectorLineEnd", value.asInstanceOf[js.Any])
    
    inline def setConnectorLineEndUndefined: Self = StObject.set(x, "connectorLineEnd", js.undefined)
    
    inline def setConnectorLineStart(value: none | arrow | outlinedTriangle | filledTriangle): Self = StObject.set(x, "connectorLineStart", value.asInstanceOf[js.Any])
    
    inline def setConnectorLineStartUndefined: Self = StObject.set(x, "connectorLineStart", js.undefined)
    
    inline def setConnectorLineType(value: straight | orthogonal): Self = StObject.set(x, "connectorLineType", value.asInstanceOf[js.Any])
    
    inline def setConnectorLineTypeUndefined: Self = StObject.set(x, "connectorLineType", js.undefined)
    
    inline def setShapeMaxHeight(value: Double): Self = StObject.set(x, "shapeMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setShapeMaxHeightUndefined: Self = StObject.set(x, "shapeMaxHeight", js.undefined)
    
    inline def setShapeMaxWidth(value: Double): Self = StObject.set(x, "shapeMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setShapeMaxWidthUndefined: Self = StObject.set(x, "shapeMaxWidth", js.undefined)
    
    inline def setShapeMinHeight(value: Double): Self = StObject.set(x, "shapeMinHeight", value.asInstanceOf[js.Any])
    
    inline def setShapeMinHeightUndefined: Self = StObject.set(x, "shapeMinHeight", js.undefined)
    
    inline def setShapeMinWidth(value: Double): Self = StObject.set(x, "shapeMinWidth", value.asInstanceOf[js.Any])
    
    inline def setShapeMinWidthUndefined: Self = StObject.set(x, "shapeMinWidth", js.undefined)
    
    inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTextStyle(value: js.Any): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
