package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartCommonAxisSettingsLabel extends js.Object {
  /** @name dxPolarChart.Options.commonAxisSettings.label.font */
  var font: js.UndefOr[Font] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.label.indentFromAxis */
  var indentFromAxis: js.UndefOr[Double] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.label.overlappingBehavior */
  var overlappingBehavior: js.UndefOr[none | hide] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.label.visible */
  var visible: js.UndefOr[Boolean] = js.native
}

object dxPolarChartCommonAxisSettingsLabel {
  @scala.inline
  def apply(): dxPolarChartCommonAxisSettingsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsLabel]
  }
  @scala.inline
  implicit class dxPolarChartCommonAxisSettingsLabelOps[Self <: dxPolarChartCommonAxisSettingsLabel] (val x: Self) extends AnyVal {
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
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setIndentFromAxis(value: Double): Self = this.set("indentFromAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentFromAxis: Self = this.set("indentFromAxis", js.undefined)
    @scala.inline
    def setOverlappingBehavior(value: none | hide): Self = this.set("overlappingBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlappingBehavior: Self = this.set("overlappingBehavior", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

