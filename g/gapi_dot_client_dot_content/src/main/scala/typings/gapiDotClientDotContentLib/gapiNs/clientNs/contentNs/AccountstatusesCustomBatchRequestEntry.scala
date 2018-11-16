package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AccountstatusesCustomBatchRequestEntry extends js.Object {
  /** The ID of the (sub-)account whose status to get. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  /** The method (get). */
  var method: js.UndefOr[java.lang.String] = js.undefined
}

