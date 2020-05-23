package typings.gapiClientContent.gapi.client.content

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
    batchId: js.UndefOr[Double] = js.undefined,
    country: String = null,
    datafeedId: String = null,
    language: String = null,
    merchantId: String = null,
    method: String = null
  ): DatafeedstatusesCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (datafeedId != null) __obj.updateDynamic("datafeedId")(datafeedId.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedstatusesCustomBatchRequestEntry]
  }
}

