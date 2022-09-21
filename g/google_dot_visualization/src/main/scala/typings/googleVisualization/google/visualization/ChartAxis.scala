package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartAxis extends StObject {
  
  var allowContainerBoundaryTextCutoff: js.UndefOr[Boolean] = js.undefined
  
  var baseline: js.UndefOr[Double] = js.undefined
  
  // This option is only supported for a continuous axis. https://developers.google.com/chart/interactive/docs/customizing_axes#Terminology
  var baselineColor: js.UndefOr[String] = js.undefined
  
  // google's documentation on this is wrong, specifies it as a number. The color of the baseline for the horizontal axis. Can be any HTML color string, for example: 'red' or '#00cc00'
  var direction: js.UndefOr[Double] = js.undefined
  
  // The direction in which the values along the horizontal axis grow. Specify -1 to reverse the order of the values.
  var format: js.UndefOr[String] = js.undefined
  
  // icu pattern set http://icu-project.org/apiref/icu4c/classDecimalFormat.html#_details
  var gridlines: js.UndefOr[ChartGridlines] = js.undefined
  
  var logScale: js.UndefOr[Boolean] = js.undefined
  
  var maxAlternation: js.UndefOr[Double] = js.undefined
  
  var maxTextLines: js.UndefOr[Double] = js.undefined
  
  var maxValue: js.UndefOr[Double | js.Date | js.Array[Double]] = js.undefined
  
  var minTextSpacing: js.UndefOr[Double] = js.undefined
  
  var minValue: js.UndefOr[Double | js.Date | js.Array[Double]] = js.undefined
  
  var minorGridlines: js.UndefOr[ChartGridlines] = js.undefined
  
  var showTextEvery: js.UndefOr[Double] = js.undefined
  
  var slantedText: js.UndefOr[Boolean] = js.undefined
  
  var slantedTextAngle: js.UndefOr[Double] = js.undefined
  
  var textPosition: js.UndefOr[String] = js.undefined
  
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
  
  var ticks: js.UndefOr[js.Array[Any]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  
  var viewWindow: js.UndefOr[ChartViewWindow] = js.undefined
  
  var viewWindowMode: js.UndefOr[String] = js.undefined
}
object ChartAxis {
  
  inline def apply(): ChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxis]
  }
  
  extension [Self <: ChartAxis](x: Self) {
    
    inline def setAllowContainerBoundaryTextCutoff(value: Boolean): Self = StObject.set(x, "allowContainerBoundaryTextCutoff", value.asInstanceOf[js.Any])
    
    inline def setAllowContainerBoundaryTextCutoffUndefined: Self = StObject.set(x, "allowContainerBoundaryTextCutoff", js.undefined)
    
    inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineColor(value: String): Self = StObject.set(x, "baselineColor", value.asInstanceOf[js.Any])
    
    inline def setBaselineColorUndefined: Self = StObject.set(x, "baselineColor", js.undefined)
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGridlines(value: ChartGridlines): Self = StObject.set(x, "gridlines", value.asInstanceOf[js.Any])
    
    inline def setGridlinesUndefined: Self = StObject.set(x, "gridlines", js.undefined)
    
    inline def setLogScale(value: Boolean): Self = StObject.set(x, "logScale", value.asInstanceOf[js.Any])
    
    inline def setLogScaleUndefined: Self = StObject.set(x, "logScale", js.undefined)
    
    inline def setMaxAlternation(value: Double): Self = StObject.set(x, "maxAlternation", value.asInstanceOf[js.Any])
    
    inline def setMaxAlternationUndefined: Self = StObject.set(x, "maxAlternation", js.undefined)
    
    inline def setMaxTextLines(value: Double): Self = StObject.set(x, "maxTextLines", value.asInstanceOf[js.Any])
    
    inline def setMaxTextLinesUndefined: Self = StObject.set(x, "maxTextLines", js.undefined)
    
    inline def setMaxValue(value: Double | js.Date | js.Array[Double]): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMaxValueVarargs(value: Double*): Self = StObject.set(x, "maxValue", js.Array(value*))
    
    inline def setMinTextSpacing(value: Double): Self = StObject.set(x, "minTextSpacing", value.asInstanceOf[js.Any])
    
    inline def setMinTextSpacingUndefined: Self = StObject.set(x, "minTextSpacing", js.undefined)
    
    inline def setMinValue(value: Double | js.Date | js.Array[Double]): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setMinValueVarargs(value: Double*): Self = StObject.set(x, "minValue", js.Array(value*))
    
    inline def setMinorGridlines(value: ChartGridlines): Self = StObject.set(x, "minorGridlines", value.asInstanceOf[js.Any])
    
    inline def setMinorGridlinesUndefined: Self = StObject.set(x, "minorGridlines", js.undefined)
    
    inline def setShowTextEvery(value: Double): Self = StObject.set(x, "showTextEvery", value.asInstanceOf[js.Any])
    
    inline def setShowTextEveryUndefined: Self = StObject.set(x, "showTextEvery", js.undefined)
    
    inline def setSlantedText(value: Boolean): Self = StObject.set(x, "slantedText", value.asInstanceOf[js.Any])
    
    inline def setSlantedTextAngle(value: Double): Self = StObject.set(x, "slantedTextAngle", value.asInstanceOf[js.Any])
    
    inline def setSlantedTextAngleUndefined: Self = StObject.set(x, "slantedTextAngle", js.undefined)
    
    inline def setSlantedTextUndefined: Self = StObject.set(x, "slantedText", js.undefined)
    
    inline def setTextPosition(value: String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
    
    inline def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
    
    inline def setTextStyle(value: ChartTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTicks(value: js.Array[Any]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setTicksVarargs(value: Any*): Self = StObject.set(x, "ticks", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleTextStyle(value: ChartTextStyle): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setViewWindow(value: ChartViewWindow): Self = StObject.set(x, "viewWindow", value.asInstanceOf[js.Any])
    
    inline def setViewWindowMode(value: String): Self = StObject.set(x, "viewWindowMode", value.asInstanceOf[js.Any])
    
    inline def setViewWindowModeUndefined: Self = StObject.set(x, "viewWindowMode", js.undefined)
    
    inline def setViewWindowUndefined: Self = StObject.set(x, "viewWindow", js.undefined)
  }
}
