package typings.googleVisualization.google.visualization

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAxis extends StObject {
  
  var allowContainerBoundaryTextCufoff: js.UndefOr[Boolean] = js.native
  
  var baseline: js.UndefOr[Double] = js.native
  
  // This option is only supported for a continuous axis. https://developers.google.com/chart/interactive/docs/customizing_axes#Terminology
  var baselineColor: js.UndefOr[String] = js.native
  
  // google's documentation on this is wrong, specifies it as a number. The color of the baseline for the horizontal axis. Can be any HTML color string, for example: 'red' or '#00cc00'
  var direction: js.UndefOr[Double] = js.native
  
  // The direction in which the values along the horizontal axis grow. Specify -1 to reverse the order of the values.
  var format: js.UndefOr[String] = js.native
  
  // icu pattern set http://icu-project.org/apiref/icu4c/classDecimalFormat.html#_details
  var gridlines: js.UndefOr[ChartGridlines] = js.native
  
  var logScale: js.UndefOr[Boolean] = js.native
  
  var maxAlternation: js.UndefOr[Double] = js.native
  
  var maxTextLines: js.UndefOr[Double] = js.native
  
  var maxValue: js.UndefOr[Double | Date | js.Array[Double]] = js.native
  
  var minTextSpacing: js.UndefOr[Double] = js.native
  
  var minValue: js.UndefOr[Double | Date | js.Array[Double]] = js.native
  
  var minorGridlines: js.UndefOr[ChartGridlines] = js.native
  
  var showTextEvery: js.UndefOr[Double] = js.native
  
  var slantedText: js.UndefOr[Boolean] = js.native
  
  var slantedTextAngle: js.UndefOr[Double] = js.native
  
  var textPosition: js.UndefOr[String] = js.native
  
  var textStyle: js.UndefOr[ChartTextStyle] = js.native
  
  var ticks: js.UndefOr[js.Array[_]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.native
  
  var viewWindow: js.UndefOr[ChartViewWindow] = js.native
  
  var viewWindowMode: js.UndefOr[String] = js.native
}
object ChartAxis {
  
  @scala.inline
  def apply(): ChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxis]
  }
  
  @scala.inline
  implicit class ChartAxisMutableBuilder[Self <: ChartAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowContainerBoundaryTextCufoff(value: Boolean): Self = StObject.set(x, "allowContainerBoundaryTextCufoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowContainerBoundaryTextCufoffUndefined: Self = StObject.set(x, "allowContainerBoundaryTextCufoff", js.undefined)
    
    @scala.inline
    def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineColor(value: String): Self = StObject.set(x, "baselineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineColorUndefined: Self = StObject.set(x, "baselineColor", js.undefined)
    
    @scala.inline
    def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGridlines(value: ChartGridlines): Self = StObject.set(x, "gridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridlinesUndefined: Self = StObject.set(x, "gridlines", js.undefined)
    
    @scala.inline
    def setLogScale(value: Boolean): Self = StObject.set(x, "logScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogScaleUndefined: Self = StObject.set(x, "logScale", js.undefined)
    
    @scala.inline
    def setMaxAlternation(value: Double): Self = StObject.set(x, "maxAlternation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAlternationUndefined: Self = StObject.set(x, "maxAlternation", js.undefined)
    
    @scala.inline
    def setMaxTextLines(value: Double): Self = StObject.set(x, "maxTextLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTextLinesUndefined: Self = StObject.set(x, "maxTextLines", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double | Date | js.Array[Double]): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMaxValueVarargs(value: Double*): Self = StObject.set(x, "maxValue", js.Array(value :_*))
    
    @scala.inline
    def setMinTextSpacing(value: Double): Self = StObject.set(x, "minTextSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTextSpacingUndefined: Self = StObject.set(x, "minTextSpacing", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double | Date | js.Array[Double]): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setMinValueVarargs(value: Double*): Self = StObject.set(x, "minValue", js.Array(value :_*))
    
    @scala.inline
    def setMinorGridlines(value: ChartGridlines): Self = StObject.set(x, "minorGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorGridlinesUndefined: Self = StObject.set(x, "minorGridlines", js.undefined)
    
    @scala.inline
    def setShowTextEvery(value: Double): Self = StObject.set(x, "showTextEvery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTextEveryUndefined: Self = StObject.set(x, "showTextEvery", js.undefined)
    
    @scala.inline
    def setSlantedText(value: Boolean): Self = StObject.set(x, "slantedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlantedTextAngle(value: Double): Self = StObject.set(x, "slantedTextAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlantedTextAngleUndefined: Self = StObject.set(x, "slantedTextAngle", js.undefined)
    
    @scala.inline
    def setSlantedTextUndefined: Self = StObject.set(x, "slantedText", js.undefined)
    
    @scala.inline
    def setTextPosition(value: String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
    
    @scala.inline
    def setTextStyle(value: ChartTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTicks(value: js.Array[_]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: js.Any*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextStyle(value: ChartTextStyle): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setViewWindow(value: ChartViewWindow): Self = StObject.set(x, "viewWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewWindowMode(value: String): Self = StObject.set(x, "viewWindowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewWindowModeUndefined: Self = StObject.set(x, "viewWindowMode", js.undefined)
    
    @scala.inline
    def setViewWindowUndefined: Self = StObject.set(x, "viewWindow", js.undefined)
  }
}
