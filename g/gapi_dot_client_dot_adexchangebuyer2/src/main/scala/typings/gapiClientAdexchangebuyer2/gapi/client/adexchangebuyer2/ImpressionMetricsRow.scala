package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImpressionMetricsRow extends js.Object {
  /**
    * The number of impressions available to the buyer on Ad Exchange.
    * In some cases this value may be unavailable.
    */
  var availableImpressions: js.UndefOr[MetricValue] = js.native
  /**
    * The number of impressions for which Ad Exchange sent the buyer a bid
    * request.
    */
  var bidRequests: js.UndefOr[MetricValue] = js.native
  /** The number of impressions that match the buyer's inventory pretargeting. */
  var inventoryMatches: js.UndefOr[MetricValue] = js.native
  /**
    * The number of impressions for which Ad Exchange received a response from
    * the buyer that contained at least one applicable bid.
    */
  var responsesWithBids: js.UndefOr[MetricValue] = js.native
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
  /**
    * The number of impressions for which the buyer successfully sent a response
    * to Ad Exchange.
    */
  var successfulResponses: js.UndefOr[MetricValue] = js.native
}

object ImpressionMetricsRow {
  @scala.inline
  def apply(): ImpressionMetricsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImpressionMetricsRow]
  }
  @scala.inline
  implicit class ImpressionMetricsRowOps[Self <: ImpressionMetricsRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailableImpressions(value: MetricValue): Self = this.set("availableImpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableImpressions: Self = this.set("availableImpressions", js.undefined)
    @scala.inline
    def setBidRequests(value: MetricValue): Self = this.set("bidRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBidRequests: Self = this.set("bidRequests", js.undefined)
    @scala.inline
    def setInventoryMatches(value: MetricValue): Self = this.set("inventoryMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventoryMatches: Self = this.set("inventoryMatches", js.undefined)
    @scala.inline
    def setResponsesWithBids(value: MetricValue): Self = this.set("responsesWithBids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsesWithBids: Self = this.set("responsesWithBids", js.undefined)
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = this.set("rowDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDimensions: Self = this.set("rowDimensions", js.undefined)
    @scala.inline
    def setSuccessfulResponses(value: MetricValue): Self = this.set("successfulResponses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessfulResponses: Self = this.set("successfulResponses", js.undefined)
  }
  
}

