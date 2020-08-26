package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxCircularGaugeRangeContainer extends BaseGaugeRangeContainer {
  /** @name dxCircularGauge.Options.rangeContainer.orientation */
  var orientation: js.UndefOr[center | inside | outside] = js.native
  /** @name dxCircularGauge.Options.rangeContainer.width */
  var width: js.UndefOr[Double] = js.native
}

object dxCircularGaugeRangeContainer {
  @scala.inline
  def apply(): dxCircularGaugeRangeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCircularGaugeRangeContainer]
  }
  @scala.inline
  implicit class dxCircularGaugeRangeContainerOps[Self <: dxCircularGaugeRangeContainer] (val x: Self) extends AnyVal {
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
    def setOrientation(value: center | inside | outside): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

