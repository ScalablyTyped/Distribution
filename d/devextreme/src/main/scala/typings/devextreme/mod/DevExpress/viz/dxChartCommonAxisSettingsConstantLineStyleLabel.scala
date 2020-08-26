package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartCommonAxisSettingsConstantLineStyleLabel extends js.Object {
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.label.font */
  var font: js.UndefOr[Font] = js.native
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.label.position */
  var position: js.UndefOr[inside | outside] = js.native
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle.label.visible */
  var visible: js.UndefOr[Boolean] = js.native
}

object dxChartCommonAxisSettingsConstantLineStyleLabel {
  @scala.inline
  def apply(): dxChartCommonAxisSettingsConstantLineStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsConstantLineStyleLabel]
  }
  @scala.inline
  implicit class dxChartCommonAxisSettingsConstantLineStyleLabelOps[Self <: dxChartCommonAxisSettingsConstantLineStyleLabel] (val x: Self) extends AnyVal {
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
    def setPosition(value: inside | outside): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

