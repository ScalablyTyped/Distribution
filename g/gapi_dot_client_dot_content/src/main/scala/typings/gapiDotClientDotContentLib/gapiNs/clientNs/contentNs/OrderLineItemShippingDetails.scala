package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemShippingDetails extends js.Object {
  /** The delivery by date, in ISO 8601 format. */
  var deliverByDate: js.UndefOr[java.lang.String] = js.undefined
  /** Details of the shipping method. */
  var method: js.UndefOr[OrderLineItemShippingDetailsMethod] = js.undefined
  /** The ship by date, in ISO 8601 format. */
  var shipByDate: js.UndefOr[java.lang.String] = js.undefined
}

object OrderLineItemShippingDetails {
  @scala.inline
  def apply(
    deliverByDate: java.lang.String = null,
    method: OrderLineItemShippingDetailsMethod = null,
    shipByDate: java.lang.String = null
  ): OrderLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    if (deliverByDate != null) __obj.updateDynamic("deliverByDate")(deliverByDate)
    if (method != null) __obj.updateDynamic("method")(method)
    if (shipByDate != null) __obj.updateDynamic("shipByDate")(shipByDate)
    __obj.asInstanceOf[OrderLineItemShippingDetails]
  }
}

