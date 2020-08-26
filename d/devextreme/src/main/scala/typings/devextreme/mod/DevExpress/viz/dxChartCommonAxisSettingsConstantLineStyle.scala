package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartCommonAxisSettingsConstantLineStyle extends js.Object {
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.color */
  var color: js.UndefOr[String] = js.native
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.dashStyle */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.label */
  var label: js.UndefOr[dxChartCommonAxisSettingsConstantLineStyleLabel] = js.native
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.paddingLeftRight */
  var paddingLeftRight: js.UndefOr[Double] = js.native
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.paddingTopBottom */
  var paddingTopBottom: js.UndefOr[Double] = js.native
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.width */
  var width: js.UndefOr[Double] = js.native
}

object dxChartCommonAxisSettingsConstantLineStyle {
  @scala.inline
  def apply(): dxChartCommonAxisSettingsConstantLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsConstantLineStyle]
  }
  @scala.inline
  implicit class dxChartCommonAxisSettingsConstantLineStyleOps[Self <: dxChartCommonAxisSettingsConstantLineStyle] (val x: Self) extends AnyVal {
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
    def setLabel(value: dxChartCommonAxisSettingsConstantLineStyleLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setPaddingLeftRight(value: Double): Self = this.set("paddingLeftRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeftRight: Self = this.set("paddingLeftRight", js.undefined)
    @scala.inline
    def setPaddingTopBottom(value: Double): Self = this.set("paddingTopBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTopBottom: Self = this.set("paddingTopBottom", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

