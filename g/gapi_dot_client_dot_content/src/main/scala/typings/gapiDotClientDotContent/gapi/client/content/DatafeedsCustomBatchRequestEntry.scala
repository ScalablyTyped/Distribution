package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsCustomBatchRequestEntry extends js.Object {
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** The data feed to insert. */
  var datafeed: js.UndefOr[Datafeed] = js.undefined
  /** The ID of the data feed to get or delete. */
  var datafeedId: js.UndefOr[String] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
}

object DatafeedsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    datafeed: Datafeed = null,
    datafeedId: String = null,
    merchantId: String = null,
    method: String = null
  ): DatafeedsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (datafeed != null) __obj.updateDynamic("datafeed")(datafeed)
    if (datafeedId != null) __obj.updateDynamic("datafeedId")(datafeedId)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[DatafeedsCustomBatchRequestEntry]
  }
}

