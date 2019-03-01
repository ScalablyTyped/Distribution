package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderShipmentLineItemShipment extends js.Object {
  /** The id of the line item that is shipped. */
  var lineItemId: js.UndefOr[java.lang.String] = js.undefined
  /** The quantity that is shipped. */
  var quantity: js.UndefOr[scala.Double] = js.undefined
}

object OrderShipmentLineItemShipment {
  @scala.inline
  def apply(lineItemId: java.lang.String = null, quantity: scala.Int | scala.Double = null): OrderShipmentLineItemShipment = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderShipmentLineItemShipment]
  }
}

