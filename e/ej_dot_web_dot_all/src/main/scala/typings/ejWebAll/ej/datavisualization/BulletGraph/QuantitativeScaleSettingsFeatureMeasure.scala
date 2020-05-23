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
  def apply(
    category: String = null,
    comparativeMeasureValue: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): QuantitativeScaleSettingsFeatureMeasure = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (!js.isUndefined(comparativeMeasureValue)) __obj.updateDynamic("comparativeMeasureValue")(comparativeMeasureValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsFeatureMeasure]
  }
}

