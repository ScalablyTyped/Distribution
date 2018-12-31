package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntry extends js.Object {
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** Required for cancel method. */
  var cancel: js.UndefOr[OrdersCustomBatchRequestEntryCancel] = js.undefined
  /** Required for cancelLineItem method. */
  var cancelLineItem: js.UndefOr[OrdersCustomBatchRequestEntryCancelLineItem] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  /** The merchant order id. Required for updateMerchantOrderId and getByMerchantOrderId methods. */
  var merchantOrderId: js.UndefOr[java.lang.String] = js.undefined
  /** The method to apply. */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the operation. Unique across all operations for a given order. Required for all methods beside get and getByMerchantOrderId. */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the order. Required for all methods beside getByMerchantOrderId. */
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  /** Required for refund method. */
  var refund: js.UndefOr[OrdersCustomBatchRequestEntryRefund] = js.undefined
  /** Required for returnLineItem method. */
  var returnLineItem: js.UndefOr[OrdersCustomBatchRequestEntryReturnLineItem] = js.undefined
  /** Required for shipLineItems method. */
  var shipLineItems: js.UndefOr[OrdersCustomBatchRequestEntryShipLineItems] = js.undefined
  /** Required for updateShipment method. */
  var updateShipment: js.UndefOr[OrdersCustomBatchRequestEntryUpdateShipment] = js.undefined
}

