package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BidMetricsRow extends js.Object {
  /** The number of bids that Ad Exchange received from the buyer. */
  var bids: js.UndefOr[MetricValue] = js.native
  /** The number of bids that were permitted to compete in the auction. */
  var bidsInAuction: js.UndefOr[MetricValue] = js.native
  /** The number of bids for which the buyer was billed. */
  var billedImpressions: js.UndefOr[MetricValue] = js.native
  /** The number of bids that won an impression. */
  var impressionsWon: js.UndefOr[MetricValue] = js.native
  /**
    * The number of bids for which the corresponding impression was measurable
    * for viewability (as defined by Active View).
    */
  var measurableImpressions: js.UndefOr[MetricValue] = js.native
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
  /**
    * The number of bids for which the corresponding impression was viewable (as
    * defined by Active View).
    */
  var viewableImpressions: js.UndefOr[MetricValue] = js.native
}

object BidMetricsRow {
  @scala.inline
  def apply(): BidMetricsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BidMetricsRow]
  }
  @scala.inline
  implicit class BidMetricsRowOps[Self <: BidMetricsRow] (val x: Self) extends AnyVal {
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
    def setBids(value: MetricValue): Self = this.set("bids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBids: Self = this.set("bids", js.undefined)
    @scala.inline
    def setBidsInAuction(value: MetricValue): Self = this.set("bidsInAuction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBidsInAuction: Self = this.set("bidsInAuction", js.undefined)
    @scala.inline
    def setBilledImpressions(value: MetricValue): Self = this.set("billedImpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilledImpressions: Self = this.set("billedImpressions", js.undefined)
    @scala.inline
    def setImpressionsWon(value: MetricValue): Self = this.set("impressionsWon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressionsWon: Self = this.set("impressionsWon", js.undefined)
    @scala.inline
    def setMeasurableImpressions(value: MetricValue): Self = this.set("measurableImpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasurableImpressions: Self = this.set("measurableImpressions", js.undefined)
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = this.set("rowDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDimensions: Self = this.set("rowDimensions", js.undefined)
    @scala.inline
    def setViewableImpressions(value: MetricValue): Self = this.set("viewableImpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewableImpressions: Self = this.set("viewableImpressions", js.undefined)
  }
  
}

