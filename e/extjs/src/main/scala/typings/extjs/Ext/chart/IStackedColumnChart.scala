package typings.extjs.Ext.chart

import typings.extjs.Ext.chart.series.IBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStackedColumnChart extends IBar {
  
  /** [Config Option] (String) */
  @JSName("axis")
  var axis_IStackedColumnChart: js.UndefOr[String] = js.native
}
object IStackedColumnChart {
  
  @scala.inline
  def apply(): IStackedColumnChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackedColumnChart]
  }
  
  @scala.inline
  implicit class IStackedColumnChartOps[Self <: IStackedColumnChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
  }
}
