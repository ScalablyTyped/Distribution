package typings.extjs.Ext.chart

import typings.extjs.Ext.chart.series.IBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnSeries extends IBar {
  
  /** [Config Option] (String) */
  @JSName("axis")
  var axis_IColumnSeries: js.UndefOr[String] = js.native
}
object IColumnSeries {
  
  @scala.inline
  def apply(): IColumnSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnSeries]
  }
  
  @scala.inline
  implicit class IColumnSeriesOps[Self <: IColumnSeries] (val x: Self) extends AnyVal {
    
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
