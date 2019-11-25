package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductShippingWeight extends js.Object {
  /** The unit of value. */
  var unit: js.UndefOr[String] = js.undefined
  /** The weight of the product used to calculate the shipping cost of the item. */
  var value: js.UndefOr[Double] = js.undefined
}

object ProductShippingWeight {
  @scala.inline
  def apply(unit: String = null, value: Int | Double = null): ProductShippingWeight = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductShippingWeight]
  }
}

