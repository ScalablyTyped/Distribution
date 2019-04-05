package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var datafeedId: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
}

object DatafeedstatusesCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    country: java.lang.String = null,
    datafeedId: java.lang.String = null,
    language: java.lang.String = null,
    merchantId: java.lang.String = null,
    method: java.lang.String = null
  ): DatafeedstatusesCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country)
    if (datafeedId != null) __obj.updateDynamic("datafeedId")(datafeedId)
    if (language != null) __obj.updateDynamic("language")(language)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[DatafeedstatusesCustomBatchRequestEntry]
  }
}

