package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartSeriesTypes extends StObject {
  
  /**
    * An object that defines configuration properties for polar chart series.
    */
  var CommonPolarChartSeries: js.UndefOr[dxPolarChartSeriesTypesCommonPolarChartSeries] = js.undefined
  
  /**
    * An object defining a series of the area type.
    */
  var areapolarseries: js.UndefOr[dxPolarChartSeriesTypesAreapolarseries] = js.undefined
  
  /**
    * An object defining a series of the bar type.
    */
  var barpolarseries: js.UndefOr[dxPolarChartSeriesTypesBarpolarseries] = js.undefined
  
  /**
    * An object defining a series of the line type.
    */
  var linepolarseries: js.UndefOr[dxPolarChartSeriesTypesLinepolarseries] = js.undefined
  
  /**
    * An object defining a series of the scatter type.
    */
  var scatterpolarseries: js.UndefOr[Any] = js.undefined
  
  /**
    * An object defining a series of the stackedBar type.
    */
  var stackedbarpolarseries: js.UndefOr[dxPolarChartSeriesTypesStackedbarpolarseries] = js.undefined
}
object dxPolarChartSeriesTypes {
  
  inline def apply(): dxPolarChartSeriesTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypes]
  }
  
  extension [Self <: dxPolarChartSeriesTypes](x: Self) {
    
    inline def setAreapolarseries(value: dxPolarChartSeriesTypesAreapolarseries): Self = StObject.set(x, "areapolarseries", value.asInstanceOf[js.Any])
    
    inline def setAreapolarseriesUndefined: Self = StObject.set(x, "areapolarseries", js.undefined)
    
    inline def setBarpolarseries(value: dxPolarChartSeriesTypesBarpolarseries): Self = StObject.set(x, "barpolarseries", value.asInstanceOf[js.Any])
    
    inline def setBarpolarseriesUndefined: Self = StObject.set(x, "barpolarseries", js.undefined)
    
    inline def setCommonPolarChartSeries(value: dxPolarChartSeriesTypesCommonPolarChartSeries): Self = StObject.set(x, "CommonPolarChartSeries", value.asInstanceOf[js.Any])
    
    inline def setCommonPolarChartSeriesUndefined: Self = StObject.set(x, "CommonPolarChartSeries", js.undefined)
    
    inline def setLinepolarseries(value: dxPolarChartSeriesTypesLinepolarseries): Self = StObject.set(x, "linepolarseries", value.asInstanceOf[js.Any])
    
    inline def setLinepolarseriesUndefined: Self = StObject.set(x, "linepolarseries", js.undefined)
    
    inline def setScatterpolarseries(value: Any): Self = StObject.set(x, "scatterpolarseries", value.asInstanceOf[js.Any])
    
    inline def setScatterpolarseriesUndefined: Self = StObject.set(x, "scatterpolarseries", js.undefined)
    
    inline def setStackedbarpolarseries(value: dxPolarChartSeriesTypesStackedbarpolarseries): Self = StObject.set(x, "stackedbarpolarseries", value.asInstanceOf[js.Any])
    
    inline def setStackedbarpolarseriesUndefined: Self = StObject.set(x, "stackedbarpolarseries", js.undefined)
  }
}
