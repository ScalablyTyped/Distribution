package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.CandleStickSeries.selectionStyle]
  */
@js.native
trait dxChartSeriesTypesCandleStickSeriesSelectionStyle extends dxChartSeriesTypesCommonSeriesSelectionStyle {
  
  /**
    * [descr:dxChartSeriesTypes.CandleStickSeries.selectionStyle.hatching]
    */
  @JSName("hatching")
  var hatching_dxChartSeriesTypesCandleStickSeriesSelectionStyle: js.UndefOr[dxChartSeriesTypesCandleStickSeriesSelectionStyleHatching] = js.native
}
object dxChartSeriesTypesCandleStickSeriesSelectionStyle {
  
  @scala.inline
  def apply(): dxChartSeriesTypesCandleStickSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesSelectionStyle]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesCandleStickSeriesSelectionStyleOps[Self <: dxChartSeriesTypesCandleStickSeriesSelectionStyle] (val x: Self) extends AnyVal {
    
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
    def setHatching(value: dxChartSeriesTypesCandleStickSeriesSelectionStyleHatching): Self = this.set("hatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHatching: Self = this.set("hatching", js.undefined)
  }
}
