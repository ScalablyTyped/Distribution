package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxCircularGaugeScale extends BaseGaugeScale {
  /** @name dxCircularGauge.Options.scale.label */
  @JSName("label")
  var label_dxCircularGaugeScale: js.UndefOr[dxCircularGaugeScaleLabel] = js.native
  /** @name dxCircularGauge.Options.scale.orientation */
  var orientation: js.UndefOr[center | inside | outside] = js.native
}

object dxCircularGaugeScale {
  @scala.inline
  def apply(): dxCircularGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCircularGaugeScale]
  }
  @scala.inline
  implicit class dxCircularGaugeScaleOps[Self <: dxCircularGaugeScale] (val x: Self) extends AnyVal {
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
    def setLabel(value: dxCircularGaugeScaleLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOrientation(value: center | inside | outside): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
  
}

