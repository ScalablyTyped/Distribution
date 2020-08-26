package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CommonSeries.selectionStyle */
@js.native
trait dxChartSeriesTypesCommonSeriesSelectionStyle extends js.Object {
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.border */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyleBorder] = js.native
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.color */
  var color: js.UndefOr[String] = js.native
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.dashStyle */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.hatching */
  var hatching: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyleHatching] = js.native
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle.width */
  var width: js.UndefOr[Double] = js.native
}

object dxChartSeriesTypesCommonSeriesSelectionStyle {
  @scala.inline
  def apply(): dxChartSeriesTypesCommonSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesSelectionStyle]
  }
  @scala.inline
  implicit class dxChartSeriesTypesCommonSeriesSelectionStyleOps[Self <: dxChartSeriesTypesCommonSeriesSelectionStyle] (val x: Self) extends AnyVal {
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
    def setBorder(value: dxChartSeriesTypesCommonSeriesSelectionStyleBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDashStyle(value: dash | dot | longDash | solid): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    @scala.inline
    def setHatching(value: dxChartSeriesTypesCommonSeriesSelectionStyleHatching): Self = this.set("hatching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHatching: Self = this.set("hatching", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

