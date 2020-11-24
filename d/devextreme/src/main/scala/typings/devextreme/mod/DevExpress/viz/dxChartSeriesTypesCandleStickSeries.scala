package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.CandleStickSeries]
  */
@js.native
trait dxChartSeriesTypesCandleStickSeries extends dxChartSeriesTypesCommonSeries {
  
  /**
    * [descr:dxChartSeriesTypes.CandleStickSeries.aggregation]
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesCandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeriesAggregation] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CandleStickSeries.hoverMode]
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesCandleStickSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CandleStickSeries.hoverStyle]
    */
  @JSName("hoverStyle")
  var hoverStyle_dxChartSeriesTypesCandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeriesHoverStyle] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CandleStickSeries.label]
    */
  @JSName("label")
  var label_dxChartSeriesTypesCandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeriesLabel] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CandleStickSeries.selectionMode]
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesCandleStickSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CandleStickSeries.selectionStyle]
    */
  @JSName("selectionStyle")
  var selectionStyle_dxChartSeriesTypesCandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeriesSelectionStyle] = js.native
}
object dxChartSeriesTypesCandleStickSeries {
  
  @scala.inline
  def apply(): dxChartSeriesTypesCandleStickSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeries]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesCandleStickSeriesOps[Self <: dxChartSeriesTypesCandleStickSeries] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: dxChartSeriesTypesCandleStickSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    
    @scala.inline
    def setHoverMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: dxChartSeriesTypesCandleStickSeriesHoverStyle): Self = this.set("hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverStyle: Self = this.set("hoverStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: dxChartSeriesTypesCandleStickSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: dxChartSeriesTypesCandleStickSeriesSelectionStyle): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
  }
}
