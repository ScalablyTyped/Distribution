package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartSeries
  extends StObject
     with dxPieChartSeriesTypesCommonPieChartSeries {
  
  /**
    * Specifies the name that identifies the series.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies data about a series.
    */
  var tag: js.UndefOr[Any] = js.undefined
}
object PieChartSeries {
  
  inline def apply(): PieChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartSeries]
  }
  
  extension [Self <: PieChartSeries](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTag(value: Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
