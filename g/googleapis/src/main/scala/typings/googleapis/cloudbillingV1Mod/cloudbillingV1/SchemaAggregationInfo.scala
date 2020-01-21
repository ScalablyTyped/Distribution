package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the aggregation level and interval for pricing of a single SKU.
  */
@js.native
trait SchemaAggregationInfo extends js.Object {
  /**
    * The number of intervals to aggregate over. Example: If aggregation_level
    * is &quot;DAILY&quot; and aggregation_count is 14, aggregation will be
    * over 14 days.
    */
  var aggregationCount: js.UndefOr[Double] = js.native
  var aggregationInterval: js.UndefOr[String] = js.native
  var aggregationLevel: js.UndefOr[String] = js.native
}

object SchemaAggregationInfo {
  @scala.inline
  def apply(
    aggregationCount: Int | Double = null,
    aggregationInterval: String = null,
    aggregationLevel: String = null
  ): SchemaAggregationInfo = {
    val __obj = js.Dynamic.literal()
    if (aggregationCount != null) __obj.updateDynamic("aggregationCount")(aggregationCount.asInstanceOf[js.Any])
    if (aggregationInterval != null) __obj.updateDynamic("aggregationInterval")(aggregationInterval.asInstanceOf[js.Any])
    if (aggregationLevel != null) __obj.updateDynamic("aggregationLevel")(aggregationLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAggregationInfo]
  }
}

