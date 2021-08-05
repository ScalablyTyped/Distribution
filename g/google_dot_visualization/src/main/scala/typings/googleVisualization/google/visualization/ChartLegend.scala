package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLegend extends StObject {
  
  var alignment: js.UndefOr[ChartLegendAlignment] = js.undefined
  
  var maxLines: js.UndefOr[Double] = js.undefined
  
  var numberFormat: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[ChartLegendPosition] = js.undefined
  
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
}
object ChartLegend {
  
  inline def apply(): ChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegend]
  }
  
  extension [Self <: ChartLegend](x: Self) {
    
    inline def setAlignment(value: ChartLegendAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setPosition(value: ChartLegendPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTextStyle(value: ChartTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
