package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartArgumentAxisMinorTick extends dxPolarChartCommonAxisSettingsMinorTick {
  /** @name dxPolarChart.Options.argumentAxis.minorTick.shift */
  var shift: js.UndefOr[Double] = js.native
}

object dxPolarChartArgumentAxisMinorTick {
  @scala.inline
  def apply(): dxPolarChartArgumentAxisMinorTick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartArgumentAxisMinorTick]
  }
  @scala.inline
  implicit class dxPolarChartArgumentAxisMinorTickOps[Self <: dxPolarChartArgumentAxisMinorTick] (val x: Self) extends AnyVal {
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
    def setShift(value: Double): Self = this.set("shift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShift: Self = this.set("shift", js.undefined)
  }
  
}

