package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartSeriesTypesLinepolarseries
  extends StObject
     with dxPolarChartSeriesTypesCommonPolarChartSeries {
  
  /**
    * Specifies series elements to be highlighted when a user points to the series.
    */
  @JSName("hoverMode")
  var hoverMode_dxPolarChartSeriesTypesLinepolarseries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user selects the series.
    */
  @JSName("selectionMode")
  var selectionMode_dxPolarChartSeriesTypesLinepolarseries: js.UndefOr[includePoints | excludePoints | none] = js.undefined
}
object dxPolarChartSeriesTypesLinepolarseries {
  
  inline def apply(): dxPolarChartSeriesTypesLinepolarseries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesLinepolarseries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPolarChartSeriesTypesLinepolarseries] (val x: Self) extends AnyVal {
    
    inline def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setSelectionMode(value: includePoints | excludePoints | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
  }
}
