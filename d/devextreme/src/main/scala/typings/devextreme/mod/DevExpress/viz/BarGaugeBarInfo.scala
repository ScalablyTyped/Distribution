package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarGaugeBarInfo extends js.Object {
  /** @name BarGaugeBarInfo.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name BarGaugeBarInfo.index */
  var index: js.UndefOr[Double] = js.undefined
  /** @name BarGaugeBarInfo.value */
  var value: js.UndefOr[Double] = js.undefined
}

object BarGaugeBarInfo {
  @scala.inline
  def apply(
    color: String = null,
    index: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): BarGaugeBarInfo = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarGaugeBarInfo]
  }
}

