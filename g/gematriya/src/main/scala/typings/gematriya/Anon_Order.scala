package typings.gematriya

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Order extends js.Object {
  var order: js.UndefOr[Boolean] = js.undefined
}

object Anon_Order {
  @scala.inline
  def apply(order: js.UndefOr[Boolean] = js.undefined): Anon_Order = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Anon_Order]
  }
}

