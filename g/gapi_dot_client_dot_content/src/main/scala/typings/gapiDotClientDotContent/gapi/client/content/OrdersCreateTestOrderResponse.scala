package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCreateTestOrderResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersCreateTestOrderResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The ID of the newly created test order. */
  var orderId: js.UndefOr[String] = js.undefined
}

object OrdersCreateTestOrderResponse {
  @scala.inline
  def apply(kind: String = null, orderId: String = null): OrdersCreateTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    __obj.asInstanceOf[OrdersCreateTestOrderResponse]
  }
}

