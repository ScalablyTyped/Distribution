package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

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
  def apply(batchId: Int | Double = null, datafeed: Datafeed = null, errors: Errors = null): DatafeedsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (datafeed != null) __obj.updateDynamic("datafeed")(datafeed)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[DatafeedsCustomBatchResponseEntry]
  }
}

