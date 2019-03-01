package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductUnitPricingMeasure extends js.Object {
  /** The unit of the measure. */
  var unit: js.UndefOr[java.lang.String] = js.undefined
  /** The measure of an item. */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ProductUnitPricingMeasure {
  @scala.inline
  def apply(unit: java.lang.String = null, value: scala.Int | scala.Double = null): ProductUnitPricingMeasure = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductUnitPricingMeasure]
  }
}

