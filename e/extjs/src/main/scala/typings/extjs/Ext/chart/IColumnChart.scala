package typings.extjs.Ext.chart

import typings.extjs.Ext.chart.series.IBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnChart extends IBar {
  
  /** [Config Option] (String) */
  @JSName("axis")
  var axis_IColumnChart: js.UndefOr[String] = js.native
}
object IColumnChart {
  
  @scala.inline
  def apply(): IColumnChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnChart]
  }
  
  @scala.inline
  implicit class IColumnChartMutableBuilder[Self <: IColumnChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
  }
}
