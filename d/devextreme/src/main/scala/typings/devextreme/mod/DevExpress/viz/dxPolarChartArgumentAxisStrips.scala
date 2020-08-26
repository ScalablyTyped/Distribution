package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartArgumentAxisStrips extends dxPolarChartCommonAxisSettingsStripStyle {
  /** @name dxPolarChart.Options.argumentAxis.strips.color */
  var color: js.UndefOr[String] = js.native
  /** @name dxPolarChart.Options.argumentAxis.strips.endValue */
  var endValue: js.UndefOr[Double | Date | String] = js.native
  /** @name dxPolarChart.Options.argumentAxis.strips.label */
  @JSName("label")
  var label_dxPolarChartArgumentAxisStrips: js.UndefOr[dxPolarChartArgumentAxisStripsLabel] = js.native
  /** @name dxPolarChart.Options.argumentAxis.strips.startValue */
  var startValue: js.UndefOr[Double | Date | String] = js.native
}

object dxPolarChartArgumentAxisStrips {
  @scala.inline
  def apply(): dxPolarChartArgumentAxisStrips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartArgumentAxisStrips]
  }
  @scala.inline
  implicit class dxPolarChartArgumentAxisStripsOps[Self <: dxPolarChartArgumentAxisStrips] (val x: Self) extends AnyVal {
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
    def setEndValue(value: Double | Date | String): Self = this.set("endValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    @scala.inline
    def setLabel(value: dxPolarChartArgumentAxisStripsLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setStartValue(value: Double | Date | String): Self = this.set("startValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
  }
  
}

