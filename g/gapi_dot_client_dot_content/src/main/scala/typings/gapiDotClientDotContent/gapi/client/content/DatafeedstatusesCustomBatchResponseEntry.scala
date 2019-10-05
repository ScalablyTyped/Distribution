package typings.gapiDotClientDotContent.gapi.client.content

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
  def apply(batchId: Int | Double = null, datafeedStatus: DatafeedStatus = null, errors: Errors = null): DatafeedstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (datafeedStatus != null) __obj.updateDynamic("datafeedStatus")(datafeedStatus)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[DatafeedstatusesCustomBatchResponseEntry]
  }
}

