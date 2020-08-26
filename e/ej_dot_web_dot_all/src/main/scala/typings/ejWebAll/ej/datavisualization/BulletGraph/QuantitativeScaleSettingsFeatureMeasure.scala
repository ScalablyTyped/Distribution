package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantitativeScaleSettingsFeatureMeasure extends js.Object {
  /** Specifies the category of feature measure.
    * @Default {null}
    */
  var category: js.UndefOr[String] = js.native
  /** Comparative measure render till the specified value.
    * @Default {null}
    */
  var comparativeMeasureValue: js.UndefOr[Double] = js.native
  /** Feature measure render till the specified value.
    * @Default {null}
    */
  var value: js.UndefOr[Double] = js.native
}

object QuantitativeScaleSettingsFeatureMeasure {
  @scala.inline
  def apply(): QuantitativeScaleSettingsFeatureMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuantitativeScaleSettingsFeatureMeasure]
  }
  @scala.inline
  implicit class QuantitativeScaleSettingsFeatureMeasureOps[Self <: QuantitativeScaleSettingsFeatureMeasure] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setComparativeMeasureValue(value: Double): Self = this.set("comparativeMeasureValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparativeMeasureValue: Self = this.set("comparativeMeasureValue", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

