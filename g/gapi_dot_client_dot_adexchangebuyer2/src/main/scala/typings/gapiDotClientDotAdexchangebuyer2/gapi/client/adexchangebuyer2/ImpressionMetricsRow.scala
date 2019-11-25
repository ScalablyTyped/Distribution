package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImpressionMetricsRow extends js.Object {
  /**
    * The number of impressions available to the buyer on Ad Exchange.
    * In some cases this value may be unavailable.
    */
  var availableImpressions: js.UndefOr[MetricValue] = js.undefined
  /**
    * The number of impressions for which Ad Exchange sent the buyer a bid
    * request.
    */
  var bidRequests: js.UndefOr[MetricValue] = js.undefined
  /** The number of impressions that match the buyer's inventory pretargeting. */
  var inventoryMatches: js.UndefOr[MetricValue] = js.undefined
  /**
    * The number of impressions for which Ad Exchange received a response from
    * the buyer that contained at least one applicable bid.
    */
  var responsesWithBids: js.UndefOr[MetricValue] = js.undefined
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
  /**
    * The number of impressions for which the buyer successfully sent a response
    * to Ad Exchange.
    */
  var successfulResponses: js.UndefOr[MetricValue] = js.undefined
}

object ImpressionMetricsRow {
  @scala.inline
  def apply(
    availableImpressions: MetricValue = null,
    bidRequests: MetricValue = null,
    inventoryMatches: MetricValue = null,
    responsesWithBids: MetricValue = null,
    rowDimensions: RowDimensions = null,
    successfulResponses: MetricValue = null
  ): ImpressionMetricsRow = {
    val __obj = js.Dynamic.literal()
    if (availableImpressions != null) __obj.updateDynamic("availableImpressions")(availableImpressions.asInstanceOf[js.Any])
    if (bidRequests != null) __obj.updateDynamic("bidRequests")(bidRequests.asInstanceOf[js.Any])
    if (inventoryMatches != null) __obj.updateDynamic("inventoryMatches")(inventoryMatches.asInstanceOf[js.Any])
    if (responsesWithBids != null) __obj.updateDynamic("responsesWithBids")(responsesWithBids.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    if (successfulResponses != null) __obj.updateDynamic("successfulResponses")(successfulResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpressionMetricsRow]
  }
}

