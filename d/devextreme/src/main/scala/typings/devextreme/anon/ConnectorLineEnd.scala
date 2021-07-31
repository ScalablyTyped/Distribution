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
  
  @scala.inline
  def apply(): ConnectorLineEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorLineEnd]
  }
  
  @scala.inline
  implicit class ConnectorLineEndMutableBuilder[Self <: ConnectorLineEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorLineEnd(value: none | arrow | outlinedTriangle | filledTriangle): Self = StObject.set(x, "connectorLineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorLineEndUndefined: Self = StObject.set(x, "connectorLineEnd", js.undefined)
    
    @scala.inline
    def setConnectorLineStart(value: none | arrow | outlinedTriangle | filledTriangle): Self = StObject.set(x, "connectorLineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorLineStartUndefined: Self = StObject.set(x, "connectorLineStart", js.undefined)
    
    @scala.inline
    def setConnectorLineType(value: straight | orthogonal): Self = StObject.set(x, "connectorLineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorLineTypeUndefined: Self = StObject.set(x, "connectorLineType", js.undefined)
    
    @scala.inline
    def setShapeMaxHeight(value: Double): Self = StObject.set(x, "shapeMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeMaxHeightUndefined: Self = StObject.set(x, "shapeMaxHeight", js.undefined)
    
    @scala.inline
    def setShapeMaxWidth(value: Double): Self = StObject.set(x, "shapeMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeMaxWidthUndefined: Self = StObject.set(x, "shapeMaxWidth", js.undefined)
    
    @scala.inline
    def setShapeMinHeight(value: Double): Self = StObject.set(x, "shapeMinHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeMinHeightUndefined: Self = StObject.set(x, "shapeMinHeight", js.undefined)
    
    @scala.inline
    def setShapeMinWidth(value: Double): Self = StObject.set(x, "shapeMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeMinWidthUndefined: Self = StObject.set(x, "shapeMinWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTextStyle(value: js.Any): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
