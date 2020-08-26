package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartCommonAxisSettingsStripStyleLabel extends js.Object {
  /** @name dxPolarChart.Options.commonAxisSettings.stripStyle.label.font */
  var font: js.UndefOr[Font] = js.native
}

object dxPolarChartCommonAxisSettingsStripStyleLabel {
  @scala.inline
  def apply(): dxPolarChartCommonAxisSettingsStripStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsStripStyleLabel]
  }
  @scala.inline
  implicit class dxPolarChartCommonAxisSettingsStripStyleLabelOps[Self <: dxPolarChartCommonAxisSettingsStripStyleLabel] (val x: Self) extends AnyVal {
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
  }
  
}

