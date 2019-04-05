package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var datafeed: js.UndefOr[Datafeed] = js.undefined
  var datafeedId: js.UndefOr[java.lang.String] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
}

object DatafeedsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    datafeed: Datafeed = null,
    datafeedId: java.lang.String = null,
    merchantId: java.lang.String = null,
    method: java.lang.String = null
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

