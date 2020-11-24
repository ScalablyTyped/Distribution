package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.ScatterSeries]
  */
@js.native
trait dxChartSeriesTypesScatterSeries extends dxChartSeriesTypesCommonSeries {
  
  /**
    * [descr:dxChartSeriesTypes.ScatterSeries.aggregation]
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesScatterSeries: js.UndefOr[dxChartSeriesTypesScatterSeriesAggregation] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.ScatterSeries.label]
    */
  @JSName("label")
  var label_dxChartSeriesTypesScatterSeries: js.UndefOr[dxChartSeriesTypesScatterSeriesLabel] = js.native
}
object dxChartSeriesTypesScatterSeries {
  
  @scala.inline
  def apply(): dxChartSeriesTypesScatterSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesScatterSeries]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesScatterSeriesOps[Self <: dxChartSeriesTypesScatterSeries] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: dxChartSeriesTypesScatterSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    
    @scala.inline
    def setLabel(value: dxChartSeriesTypesScatterSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
