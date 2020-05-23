package typings.gapiClientContent.gapi.client.content

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
  def apply(unit: String = null, value: js.UndefOr[Double] = js.undefined): ProductShippingWeight = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductShippingWeight]
  }
}

