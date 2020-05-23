package typings.gematriya.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var order: js.UndefOr[Boolean] = js.undefined
}

object Order {
  @scala.inline
  def apply(order: js.UndefOr[Boolean] = js.undefined): Order = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}

