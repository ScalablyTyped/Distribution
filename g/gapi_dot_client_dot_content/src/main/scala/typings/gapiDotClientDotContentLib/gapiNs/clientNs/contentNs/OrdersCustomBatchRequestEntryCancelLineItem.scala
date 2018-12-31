package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryCancelLineItem extends js.Object {
  /**
    * Amount to refund for the cancelation. Optional. If not set, Google will calculate the default based on the price and tax of the items involved. The
    * amount must not be larger than the net amount left on the order.
    */
  var amount: js.UndefOr[Price] = js.undefined
  /** The ID of the line item to cancel. */
  var lineItemId: js.UndefOr[java.lang.String] = js.undefined
  /** The quantity to cancel. */
  var quantity: js.UndefOr[scala.Double] = js.undefined
  /** The reason for the cancellation. */
  var reason: js.UndefOr[java.lang.String] = js.undefined
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[java.lang.String] = js.undefined
}

