package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCreateTestOrderResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersCreateTestOrderResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the newly created test order. */
  var orderId: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCreateTestOrderResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, orderId: java.lang.String = null): OrdersCreateTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    __obj.asInstanceOf[OrdersCreateTestOrderResponse]
  }
}

