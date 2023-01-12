package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.SeriesColor
import typings.devextreme.mod.DevExpress.common.charts.LegendHoverMode
import typings.devextreme.mod.DevExpress.common.charts.RelativePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartLegend
  extends StObject
     with BaseChartLegend {
  
  /**
    * Specifies the text for a hint that appears when a user hovers the mouse pointer over a legend item.
    */
  var customizeHint: js.UndefOr[js.Function1[/* seriesInfo */ SeriesColor, String]] = js.undefined
  
  /**
    * Specifies a callback function that returns the text to be displayed by a legend item.
    */
  var customizeText: js.UndefOr[js.Function1[/* seriesInfo */ SeriesColor, String]] = js.undefined
  
  /**
    * Specifies what series elements to highlight when a corresponding item in the legend is hovered over.
    */
  var hoverMode: js.UndefOr[LegendHoverMode] = js.undefined
  
  /**
    * Specifies whether the legend is located outside or inside the chart&apos;s plot.
    */
  var position: js.UndefOr[RelativePosition] = js.undefined
}
object dxChartLegend {
  
  inline def apply(): dxChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartLegend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartLegend] (val x: Self) extends AnyVal {
    
    inline def setCustomizeHint(value: /* seriesInfo */ SeriesColor => String): Self = StObject.set(x, "customizeHint", js.Any.fromFunction1(value))
    
    inline def setCustomizeHintUndefined: Self = StObject.set(x, "customizeHint", js.undefined)
    
    inline def setCustomizeText(value: /* seriesInfo */ SeriesColor => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setHoverMode(value: LegendHoverMode): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setPosition(value: RelativePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
