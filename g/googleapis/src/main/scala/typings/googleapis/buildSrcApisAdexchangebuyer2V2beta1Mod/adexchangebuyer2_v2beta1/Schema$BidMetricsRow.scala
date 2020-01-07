package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The set of metrics that are measured in numbers of bids, representing how
  * many bids with the specified dimension values were considered eligible at
  * each stage of the bidding funnel;
  */
@js.native
trait Schema$BidMetricsRow extends js.Object {
  /**
    * The number of bids that Ad Exchange received from the buyer.
    */
  var bids: js.UndefOr[Schema$MetricValue] = js.native
  /**
    * The number of bids that were permitted to compete in the auction.
    */
  var bidsInAuction: js.UndefOr[Schema$MetricValue] = js.native
  /**
    * The number of bids for which the buyer was billed.
    */
  var billedImpressions: js.UndefOr[Schema$MetricValue] = js.native
  /**
    * The number of bids that won an impression.
    */
  var impressionsWon: js.UndefOr[Schema$MetricValue] = js.native
  /**
    * The number of bids for which the corresponding impression was measurable
    * for viewability (as defined by Active View).
    */
  var measurableImpressions: js.UndefOr[Schema$MetricValue] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[Schema$RowDimensions] = js.native
  /**
    * The number of bids for which the corresponding impression was viewable
    * (as defined by Active View).
    */
  var viewableImpressions: js.UndefOr[Schema$MetricValue] = js.native
}

object Schema$BidMetricsRow {
  @scala.inline
  def apply(
    bids: Schema$MetricValue = null,
    bidsInAuction: Schema$MetricValue = null,
    billedImpressions: Schema$MetricValue = null,
    impressionsWon: Schema$MetricValue = null,
    measurableImpressions: Schema$MetricValue = null,
    rowDimensions: Schema$RowDimensions = null,
    viewableImpressions: Schema$MetricValue = null
  ): Schema$BidMetricsRow = {
    val __obj = js.Dynamic.literal()
    if (bids != null) __obj.updateDynamic("bids")(bids.asInstanceOf[js.Any])
    if (bidsInAuction != null) __obj.updateDynamic("bidsInAuction")(bidsInAuction.asInstanceOf[js.Any])
    if (billedImpressions != null) __obj.updateDynamic("billedImpressions")(billedImpressions.asInstanceOf[js.Any])
    if (impressionsWon != null) __obj.updateDynamic("impressionsWon")(impressionsWon.asInstanceOf[js.Any])
    if (measurableImpressions != null) __obj.updateDynamic("measurableImpressions")(measurableImpressions.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    if (viewableImpressions != null) __obj.updateDynamic("viewableImpressions")(viewableImpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BidMetricsRow]
  }
}

