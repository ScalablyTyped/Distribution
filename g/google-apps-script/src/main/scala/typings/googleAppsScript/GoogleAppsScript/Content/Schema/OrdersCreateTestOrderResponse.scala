package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCreateTestOrderResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var orderId: js.UndefOr[String] = js.undefined
}

object OrdersCreateTestOrderResponse {
  @scala.inline
  def apply(kind: String = null, orderId: String = null): OrdersCreateTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersCreateTestOrderResponse]
  }
}

