package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CandleStickSeries.hoverStyle */
@js.native
trait dxChartSeriesTypesCandleStickSeriesHoverStyle extends dxChartSeriesTypesCommonSeriesHoverStyle {
  /** @name dxChartSeriesTypes.CandleStickSeries.hoverStyle.hatching */
  @JSName("hatching")
  var hatching_dxChartSeriesTypesCandleStickSeriesHoverStyle: js.UndefOr[dxChartSeriesTypesCandleStickSeriesHoverStyleHatching] = js.native
}

object dxChartSeriesTypesCandleStickSeriesHoverStyle {
  @scala.inline
  def apply(): dxChartSeriesTypesCandleStickSeriesHoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesHoverStyle]
  }
  @scala.inline
  implicit class dxChartSeriesTypesCandleStickSeriesHoverStyleOps[Self <: dxChartSeriesTypesCandleStickSeriesHoverStyle] (val x: Self) extends AnyVal {
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
    def setHatching(value: dxChartSeriesTypesCandleStickSeriesHoverStyleHatching): Self = this.set("hatching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHatching: Self = this.set("hatching", js.undefined)
  }
  
}

