package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderShipmentLineItemShipment extends js.Object {
  /** The id of the line item that is shipped. */
  var lineItemId: js.UndefOr[String] = js.undefined
  /** The quantity that is shipped. */
  var quantity: js.UndefOr[Double] = js.undefined
}

object OrderShipmentLineItemShipment {
  @scala.inline
  def apply(lineItemId: String = null, quantity: Int | Double = null): OrderShipmentLineItemShipment = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderShipmentLineItemShipment]
  }
}

