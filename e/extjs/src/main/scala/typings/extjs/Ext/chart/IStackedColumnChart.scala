package typings.extjs.Ext.chart

import typings.extjs.Ext.chart.series.IBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStackedColumnChart
  extends StObject
     with IBar {
  
  /** [Config Option] (String) */
  @JSName("axis")
  var axis_IStackedColumnChart: js.UndefOr[String] = js.undefined
}
object IStackedColumnChart {
  
  inline def apply(): IStackedColumnChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackedColumnChart]
  }
  
  extension [Self <: IStackedColumnChart](x: Self) {
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
  }
}
