package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseChartLegendItem
  extends StObject
     with BaseLegendItem {
  
  /**
    * The series that the item represents on the legend.
    */
  var series: js.UndefOr[baseSeriesObject] = js.undefined
}
object BaseChartLegendItem {
  
  inline def apply(): BaseChartLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartLegendItem]
  }
  
  extension [Self <: BaseChartLegendItem](x: Self) {
    
    inline def setSeries(value: baseSeriesObject): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
  }
}
