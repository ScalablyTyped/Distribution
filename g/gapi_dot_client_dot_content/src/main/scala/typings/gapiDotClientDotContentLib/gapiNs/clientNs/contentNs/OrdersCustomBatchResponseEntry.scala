package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OrdersCustomBatchResponseEntry extends js.Object {
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  /** The status of the execution. Only defined if the method is not get or getByMerchantOrderId and if the request was successful. */
  var executionStatus: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersCustomBatchResponseEntry". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The retrieved order. Only defined if the method is get and if the request was successful. */
  var order: js.UndefOr[Order] = js.undefined
}

