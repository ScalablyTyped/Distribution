package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch datafeeds request.
  */
@js.native
trait Schema$DatafeedsCustomBatchRequestEntry extends js.Object {
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * The data feed to insert.
    */
  var datafeed: js.UndefOr[Schema$Datafeed] = js.native
  /**
    * The ID of the data feed to get, delete or fetch.
    */
  var datafeedId: js.UndefOr[String] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
}

object Schema$DatafeedsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    datafeed: Schema$Datafeed = null,
    datafeedId: String = null,
    merchantId: String = null,
    method: String = null
  ): Schema$DatafeedsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (datafeed != null) __obj.updateDynamic("datafeed")(datafeed.asInstanceOf[js.Any])
    if (datafeedId != null) __obj.updateDynamic("datafeedId")(datafeedId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DatafeedsCustomBatchRequestEntry]
  }
}

