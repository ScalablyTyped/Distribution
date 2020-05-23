package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesCustomBatchResponseEntry extends js.Object {
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** The requested data feed status. Defined if and only if the request was successful. */
  var datafeedStatus: js.UndefOr[DatafeedStatus] = js.undefined
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
}

object DatafeedstatusesCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: js.UndefOr[Double] = js.undefined,
    datafeedStatus: DatafeedStatus = null,
    errors: Errors = null
  ): DatafeedstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (datafeedStatus != null) __obj.updateDynamic("datafeedStatus")(datafeedStatus.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedstatusesCustomBatchResponseEntry]
  }
}

