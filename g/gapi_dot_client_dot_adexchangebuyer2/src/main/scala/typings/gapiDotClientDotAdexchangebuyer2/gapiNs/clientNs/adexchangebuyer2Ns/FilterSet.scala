package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSet extends js.Object {
  /**
    * An absolute date range, defined by a start date and an end date.
    * Interpreted relative to Pacific time zone.
    */
  var absoluteDateRange: js.UndefOr[AbsoluteDateRange] = js.undefined
  /** The ID of the buyer account on which to filter; optional. */
  var buyerAccountId: js.UndefOr[String] = js.undefined
  /** The ID of the creative on which to filter; optional. */
  var creativeId: js.UndefOr[String] = js.undefined
  /** The ID of the deal on which to filter; optional. */
  var dealId: js.UndefOr[String] = js.undefined
  /** The environment on which to filter; optional. */
  var environment: js.UndefOr[String] = js.undefined
  /**
    * The ID of the filter set; unique within the account of the filter set
    * owner.
    * The value of this field is ignored in create operations.
    */
  var filterSetId: js.UndefOr[String] = js.undefined
  /** The format on which to filter; optional. */
  var format: js.UndefOr[String] = js.undefined
  /**
    * The account ID of the buyer who owns this filter set.
    * The value of this field is ignored in create operations.
    */
  var ownerAccountId: js.UndefOr[String] = js.undefined
  /**
    * The list of platforms on which to filter; may be empty. The filters
    * represented by multiple platforms are ORed together (i.e. if non-empty,
    * results must match any one of the platforms).
    */
  var platforms: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An open-ended realtime time range, defined by the aggregation start
    * timestamp.
    */
  var realtimeTimeRange: js.UndefOr[RealtimeTimeRange] = js.undefined
  /**
    * A relative date range, defined by an offset from today and a duration.
    * Interpreted relative to Pacific time zone.
    */
  var relativeDateRange: js.UndefOr[RelativeDateRange] = js.undefined
  /**
    * The list of IDs of the seller (publisher) networks on which to filter;
    * may be empty. The filters represented by multiple seller network IDs are
    * ORed together (i.e. if non-empty, results must match any one of the
    * publisher networks).
    * See [seller-network-ids](https://developers.google.com/ad-exchange/rtb/downloads/seller-network-ids)
    * file for the set of existing seller network IDs.
    */
  var sellerNetworkIds: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The granularity of time intervals if a time series breakdown is desired;
    * optional.
    */
  var timeSeriesGranularity: js.UndefOr[String] = js.undefined
}

object FilterSet {
  @scala.inline
  def apply(
    absoluteDateRange: AbsoluteDateRange = null,
    buyerAccountId: String = null,
    creativeId: String = null,
    dealId: String = null,
    environment: String = null,
    filterSetId: String = null,
    format: String = null,
    ownerAccountId: String = null,
    platforms: js.Array[String] = null,
    realtimeTimeRange: RealtimeTimeRange = null,
    relativeDateRange: RelativeDateRange = null,
    sellerNetworkIds: js.Array[Double] = null,
    timeSeriesGranularity: String = null
  ): FilterSet = {
    val __obj = js.Dynamic.literal()
    if (absoluteDateRange != null) __obj.updateDynamic("absoluteDateRange")(absoluteDateRange)
    if (buyerAccountId != null) __obj.updateDynamic("buyerAccountId")(buyerAccountId)
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId)
    if (dealId != null) __obj.updateDynamic("dealId")(dealId)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (filterSetId != null) __obj.updateDynamic("filterSetId")(filterSetId)
    if (format != null) __obj.updateDynamic("format")(format)
    if (ownerAccountId != null) __obj.updateDynamic("ownerAccountId")(ownerAccountId)
    if (platforms != null) __obj.updateDynamic("platforms")(platforms)
    if (realtimeTimeRange != null) __obj.updateDynamic("realtimeTimeRange")(realtimeTimeRange)
    if (relativeDateRange != null) __obj.updateDynamic("relativeDateRange")(relativeDateRange)
    if (sellerNetworkIds != null) __obj.updateDynamic("sellerNetworkIds")(sellerNetworkIds)
    if (timeSeriesGranularity != null) __obj.updateDynamic("timeSeriesGranularity")(timeSeriesGranularity)
    __obj.asInstanceOf[FilterSet]
  }
}

