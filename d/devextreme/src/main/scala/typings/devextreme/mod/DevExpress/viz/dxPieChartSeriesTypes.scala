package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPieChartSeriesTypes extends js.Object {
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries]
    */
  var CommonPieChartSeries: js.UndefOr[dxPieChartSeriesTypesCommonPieChartSeries] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.DoughnutSeries]
    */
  var DoughnutSeries: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.PieSeries]
    */
  var PieSeries: js.UndefOr[js.Any] = js.native
}
object dxPieChartSeriesTypes {
  
  @scala.inline
  def apply(): dxPieChartSeriesTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartSeriesTypes]
  }
  
  @scala.inline
  implicit class dxPieChartSeriesTypesOps[Self <: dxPieChartSeriesTypes] (val x: Self) extends AnyVal {
    
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
    def setCommonPieChartSeries(value: dxPieChartSeriesTypesCommonPieChartSeries): Self = this.set("CommonPieChartSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonPieChartSeries: Self = this.set("CommonPieChartSeries", js.undefined)
    
    @scala.inline
    def setDoughnutSeries(value: js.Any): Self = this.set("DoughnutSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoughnutSeries: Self = this.set("DoughnutSeries", js.undefined)
    
    @scala.inline
    def setPieSeries(value: js.Any): Self = this.set("PieSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieSeries: Self = this.set("PieSeries", js.undefined)
  }
}
