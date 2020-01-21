package typings.gematriya

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrder extends js.Object {
  var order: js.UndefOr[Boolean] = js.undefined
}

object AnonOrder {
  @scala.inline
  def apply(order: js.UndefOr[Boolean] = js.undefined): AnonOrder = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrder]
  }
}

