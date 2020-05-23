package typings.gapiClientContent.gapi.client.content

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
  def apply(lineItemId: String = null, quantity: js.UndefOr[Double] = js.undefined): OrderShipmentLineItemShipment = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderShipmentLineItemShipment]
  }
}

