package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarGaugeBarInfo extends js.Object {
  /** The bar's hexadecimal color code. */
  var color: js.UndefOr[String] = js.undefined
  /** The bar's zero-based index. Bars closest to the gauge's center have higher indexes. */
  var index: js.UndefOr[Double] = js.undefined
  /** The bar's value. */
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

