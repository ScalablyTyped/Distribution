package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesCustomBatchRequestEntry extends js.Object {
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  /**
    * The country for which to get the datafeed status. If this parameter is provided then language must also be provided. Note that for multi-target
    * datafeeds this parameter is required.
    */
  var country: js.UndefOr[String] = js.undefined
  /** The ID of the data feed to get. */
  var datafeedId: js.UndefOr[String] = js.undefined
  /**
    * The language for which to get the datafeed status. If this parameter is provided then country must also be provided. Note that for multi-target
    * datafeeds this parameter is required.
    */
  var language: js.UndefOr[String] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
}

object DatafeedstatusesCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    country: String = null,
    datafeedId: String = null,
    language: String = null,
    merchantId: String = null,
    method: String = null
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

