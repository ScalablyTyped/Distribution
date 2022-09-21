package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.viz.dxChart.ChartTooltipLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartTooltip
  extends StObject
     with BaseChartTooltip {
  
  /**
    * Specifies whether the tooltip must be located in the center of a series point or on its edge. Applies to bar-like and bubble series only.
    */
  var location: js.UndefOr[ChartTooltipLocation] = js.undefined
}
object dxChartTooltip {
  
  inline def apply(): dxChartTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartTooltip]
  }
  
  extension [Self <: dxChartTooltip](x: Self) {
    
    inline def setLocation(value: ChartTooltipLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
