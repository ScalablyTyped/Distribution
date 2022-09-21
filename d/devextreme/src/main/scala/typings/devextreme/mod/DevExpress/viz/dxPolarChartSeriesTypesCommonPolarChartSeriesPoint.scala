package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Border
import typings.devextreme.anon.ColorVisible
import typings.devextreme.anon.Url
import typings.devextreme.mod.DevExpress.common.charts.PointInteractionMode
import typings.devextreme.mod.DevExpress.common.charts.PointSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartSeriesTypesCommonPolarChartSeriesPoint extends StObject {
  
  /**
    * Specifies border properties for points in the line and area series.
    */
  var border: js.UndefOr[ColorVisible] = js.undefined
  
  /**
    * Specifies the points color.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies what series points to highlight when a point is hovered over.
    */
  var hoverMode: js.UndefOr[PointInteractionMode] = js.undefined
  
  /**
    * An object defining configuration properties for a hovered point.
    */
  var hoverStyle: js.UndefOr[Border] = js.undefined
  
  /**
    * An object specifying the parameters of an image that is used as a point marker.
    */
  var image: js.UndefOr[String | Url] = js.undefined
  
  /**
    * Specifies what series points to highlight when a point is selected.
    */
  var selectionMode: js.UndefOr[PointInteractionMode] = js.undefined
  
  /**
    * An object defining configuration properties for a selected point.
    */
  var selectionStyle: js.UndefOr[Border] = js.undefined
  
  /**
    * Specifies the point diameter in pixels for those series that represent data points as symbols (not as bars for instance).
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a symbol for presenting points of the line and area series.
    */
  var symbol: js.UndefOr[PointSymbol] = js.undefined
  
  /**
    * Specifies the points visibility for a line and area series.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object dxPolarChartSeriesTypesCommonPolarChartSeriesPoint {
  
  inline def apply(): dxPolarChartSeriesTypesCommonPolarChartSeriesPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesCommonPolarChartSeriesPoint]
  }
  
  extension [Self <: dxPolarChartSeriesTypesCommonPolarChartSeriesPoint](x: Self) {
    
    inline def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHoverMode(value: PointInteractionMode): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setHoverStyle(value: Border): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setImage(value: String | Url): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSelectionMode(value: PointInteractionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionStyle(value: Border): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSymbol(value: PointSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
