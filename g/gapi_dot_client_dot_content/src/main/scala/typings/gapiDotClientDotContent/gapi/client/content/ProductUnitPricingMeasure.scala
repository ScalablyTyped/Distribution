package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductUnitPricingMeasure extends js.Object {
  /** The unit of the measure. */
  var unit: js.UndefOr[String] = js.undefined
  /** The measure of an item. */
  var value: js.UndefOr[Double] = js.undefined
}

object ProductUnitPricingMeasure {
  @scala.inline
  def apply(unit: String = null, value: Int | Double = null): ProductUnitPricingMeasure = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductUnitPricingMeasure]
  }
}

