package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CommonSeries.hoverStyle.border */
@js.native
trait dxChartSeriesTypesCommonSeriesHoverStyleBorder extends js.Object {
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.border.color */
  var color: js.UndefOr[String] = js.native
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.border.dashStyle */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.border.visible */
  var visible: js.UndefOr[Boolean] = js.native
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle.border.width */
  var width: js.UndefOr[Double] = js.native
}

object dxChartSeriesTypesCommonSeriesHoverStyleBorder {
  @scala.inline
  def apply(): dxChartSeriesTypesCommonSeriesHoverStyleBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesHoverStyleBorder]
  }
  @scala.inline
  implicit class dxChartSeriesTypesCommonSeriesHoverStyleBorderOps[Self <: dxChartSeriesTypesCommonSeriesHoverStyleBorder] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDashStyle(value: dash | dot | longDash | solid): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

