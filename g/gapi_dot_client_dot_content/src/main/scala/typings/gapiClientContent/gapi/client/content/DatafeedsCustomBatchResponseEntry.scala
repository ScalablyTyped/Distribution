package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsCustomBatchResponseEntry extends js.Object {
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** The requested data feed. Defined if and only if the request was successful. */
  var datafeed: js.UndefOr[Datafeed] = js.undefined
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
}

object DatafeedsCustomBatchResponseEntry {
  @scala.inline
  def apply(batchId: js.UndefOr[Double] = js.undefined, datafeed: Datafeed = null, errors: Errors = null): DatafeedsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (datafeed != null) __obj.updateDynamic("datafeed")(datafeed.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedsCustomBatchResponseEntry]
  }
}

