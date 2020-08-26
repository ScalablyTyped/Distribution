package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartArgumentAxisConstantLineStyle extends dxChartCommonAxisSettingsConstantLineStyle {
  /** @name dxChart.Options.argumentAxis.constantLineStyle.label */
  @JSName("label")
  var label_dxChartArgumentAxisConstantLineStyle: js.UndefOr[dxChartArgumentAxisConstantLineStyleLabel] = js.native
}

object dxChartArgumentAxisConstantLineStyle {
  @scala.inline
  def apply(): dxChartArgumentAxisConstantLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartArgumentAxisConstantLineStyle]
  }
  @scala.inline
  implicit class dxChartArgumentAxisConstantLineStyleOps[Self <: dxChartArgumentAxisConstantLineStyle] (val x: Self) extends AnyVal {
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
    def setLabel(value: dxChartArgumentAxisConstantLineStyleLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

