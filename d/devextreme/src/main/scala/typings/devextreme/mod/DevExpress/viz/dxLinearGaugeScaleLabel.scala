package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxLinearGaugeScaleLabel extends BaseGaugeScaleLabel {
  /** @name dxLinearGauge.Options.scale.label.indentFromTick */
  var indentFromTick: js.UndefOr[Double] = js.native
}

object dxLinearGaugeScaleLabel {
  @scala.inline
  def apply(): dxLinearGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeScaleLabel]
  }
  @scala.inline
  implicit class dxLinearGaugeScaleLabelOps[Self <: dxLinearGaugeScaleLabel] (val x: Self) extends AnyVal {
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
    def setIndentFromTick(value: Double): Self = this.set("indentFromTick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentFromTick: Self = this.set("indentFromTick", js.undefined)
  }
  
}

