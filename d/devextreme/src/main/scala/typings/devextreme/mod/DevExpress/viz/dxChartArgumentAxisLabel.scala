package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ValueValueText
import typings.devextreme.mod.DevExpress.ui.format
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartArgumentAxisLabel extends dxChartCommonAxisSettingsLabel {
  /** @name dxChart.Options.argumentAxis.label.customizeHint */
  var customizeHint: js.UndefOr[js.Function1[/* argument */ ValueValueText, String]] = js.native
  /** @name dxChart.Options.argumentAxis.label.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* argument */ ValueValueText, String]] = js.native
  /** @name dxChart.Options.argumentAxis.label.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
}

object dxChartArgumentAxisLabel {
  @scala.inline
  def apply(): dxChartArgumentAxisLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartArgumentAxisLabel]
  }
  @scala.inline
  implicit class dxChartArgumentAxisLabelOps[Self <: dxChartArgumentAxisLabel] (val x: Self) extends AnyVal {
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
    def setCustomizeHint(value: /* argument */ ValueValueText => String): Self = this.set("customizeHint", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeHint: Self = this.set("customizeHint", js.undefined)
    @scala.inline
    def setCustomizeText(value: /* argument */ ValueValueText => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

