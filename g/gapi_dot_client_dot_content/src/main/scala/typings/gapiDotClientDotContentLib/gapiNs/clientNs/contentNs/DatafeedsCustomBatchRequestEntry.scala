package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DatafeedsCustomBatchRequestEntry extends js.Object {
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** The data feed to insert. */
  var datafeed: js.UndefOr[Datafeed] = js.undefined
  /** The ID of the data feed to get or delete. */
  var datafeedId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
}

