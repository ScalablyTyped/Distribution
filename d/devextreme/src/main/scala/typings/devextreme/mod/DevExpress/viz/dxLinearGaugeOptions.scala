package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.`21`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxLinearGaugeOptions extends BaseGaugeOptions[dxLinearGauge] {
  /** @name dxLinearGauge.Options.geometry */
  var geometry: js.UndefOr[`21`] = js.native
  /** @name dxLinearGauge.Options.rangeContainer */
  @JSName("rangeContainer")
  var rangeContainer_dxLinearGaugeOptions: js.UndefOr[dxLinearGaugeRangeContainer] = js.native
  /** @name dxLinearGauge.Options.scale */
  @JSName("scale")
  var scale_dxLinearGaugeOptions: js.UndefOr[dxLinearGaugeScale] = js.native
  /** @name dxLinearGauge.Options.subvalueIndicator */
  var subvalueIndicator: js.UndefOr[GaugeIndicator] = js.native
  /** @name dxLinearGauge.Options.valueIndicator */
  var valueIndicator: js.UndefOr[GaugeIndicator] = js.native
}

object dxLinearGaugeOptions {
  @scala.inline
  def apply(): dxLinearGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeOptions]
  }
  @scala.inline
  implicit class dxLinearGaugeOptionsOps[Self <: dxLinearGaugeOptions] (val x: Self) extends AnyVal {
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
    def setGeometry(value: `21`): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    @scala.inline
    def setRangeContainer(value: dxLinearGaugeRangeContainer): Self = this.set("rangeContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeContainer: Self = this.set("rangeContainer", js.undefined)
    @scala.inline
    def setScale(value: dxLinearGaugeScale): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSubvalueIndicator(value: GaugeIndicator): Self = this.set("subvalueIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubvalueIndicator: Self = this.set("subvalueIndicator", js.undefined)
    @scala.inline
    def setValueIndicator(value: GaugeIndicator): Self = this.set("valueIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueIndicator: Self = this.set("valueIndicator", js.undefined)
  }
  
}

