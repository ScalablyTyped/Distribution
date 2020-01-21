package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsFeatureMeasure extends js.Object {
  /** Specifies the category of feature measure.
    * @Default {null}
    */
  var category: js.UndefOr[String] = js.undefined
  /** Comparative measure render till the specified value.
    * @Default {null}
    */
  var comparativeMeasureValue: js.UndefOr[Double] = js.undefined
  /** Feature measure render till the specified value.
    * @Default {null}
    */
  var value: js.UndefOr[Double] = js.undefined
}

object QuantitativeScaleSettingsFeatureMeasure {
  @scala.inline
  def apply(category: String = null, comparativeMeasureValue: Int | Double = null, value: Int | Double = null): QuantitativeScaleSettingsFeatureMeasure = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (comparativeMeasureValue != null) __obj.updateDynamic("comparativeMeasureValue")(comparativeMeasureValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsFeatureMeasure]
  }
}

