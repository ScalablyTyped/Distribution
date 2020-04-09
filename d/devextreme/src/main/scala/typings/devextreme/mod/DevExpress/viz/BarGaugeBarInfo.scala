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
  def apply(color: String = null, index: Int | Double = null, value: Int | Double = null): BarGaugeBarInfo = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarGaugeBarInfo]
  }
}

