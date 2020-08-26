package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantitativeScaleSettingsFeaturedMeasureSettings extends js.Object {
  /** Specifies the Stroke of the featured measure in bullet graph.
    * @Default {null}
    */
  var stroke: js.UndefOr[Double] = js.native
  /** Specifies the width of the featured measure in bullet graph.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.native
}

object QuantitativeScaleSettingsFeaturedMeasureSettings {
  @scala.inline
  def apply(): QuantitativeScaleSettingsFeaturedMeasureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuantitativeScaleSettingsFeaturedMeasureSettings]
  }
  @scala.inline
  implicit class QuantitativeScaleSettingsFeaturedMeasureSettingsOps[Self <: QuantitativeScaleSettingsFeaturedMeasureSettings] (val x: Self) extends AnyVal {
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
    def setStroke(value: Double): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

