package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductUnitPricingBaseMeasure extends js.Object {
  /** The unit of the denominator. */
  var unit: js.UndefOr[String] = js.undefined
  /** The denominator of the unit price. */
  var value: js.UndefOr[String] = js.undefined
}

object ProductUnitPricingBaseMeasure {
  @scala.inline
  def apply(unit: String = null, value: String = null): ProductUnitPricingBaseMeasure = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ProductUnitPricingBaseMeasure]
  }
}

