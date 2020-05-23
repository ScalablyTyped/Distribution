package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsCustomBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.undefined
  var datafeed: js.UndefOr[Datafeed] = js.undefined
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

