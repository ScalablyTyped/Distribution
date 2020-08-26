package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantitativeScaleSettingsMajorTickSettings extends js.Object {
  /** Specifies the size of the major ticks.
    * @Default {13}
    */
  var size: js.UndefOr[Double] = js.native
  /** Specifies the stroke color of the major tick lines.
    * @Default {null}
    */
  var stroke: js.UndefOr[String] = js.native
  /** Specifies the width of the major tick lines.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.native
}

object QuantitativeScaleSettingsMajorTickSettings {
  @scala.inline
  def apply(): QuantitativeScaleSettingsMajorTickSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuantitativeScaleSettingsMajorTickSettings]
  }
  @scala.inline
  implicit class QuantitativeScaleSettingsMajorTickSettingsOps[Self <: QuantitativeScaleSettingsMajorTickSettings] (val x: Self) extends AnyVal {
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

