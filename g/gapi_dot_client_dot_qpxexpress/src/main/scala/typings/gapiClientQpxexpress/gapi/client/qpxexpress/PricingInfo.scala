package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingInfo extends js.Object {
  /**
    * The total fare in the base fare currency (the currency of the country of origin). This element is only present when the sales currency and the currency
    * of the country of commencement are different.
    */
  var baseFareTotal: js.UndefOr[String] = js.undefined
  /** The fare used to price one or more segments. */
  var fare: js.UndefOr[js.Array[FareInfo]] = js.undefined
  /** The horizontal fare calculation. This is a field on a ticket that displays all of the relevant items that go into the calculation of the fare. */
  var fareCalculation: js.UndefOr[String] = js.undefined
  /** Identifies this as a pricing object, representing the price of one or more travel segments. Value: the fixed string qpxexpress#pricingInfo. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The latest ticketing time for this pricing assuming the reservation occurs at ticketing time and there is no change in fares/rules. The time is local
    * to the point of sale (POS).
    */
  var latestTicketingTime: js.UndefOr[String] = js.undefined
  /** The number of passengers to which this price applies. */
  var passengers: js.UndefOr[PassengerCounts] = js.undefined
  /**
    * The passenger type code for this pricing. An alphanumeric code used by a carrier to restrict fares to certain categories of passenger. For instance, a
    * fare might be valid only for senior citizens.
    */
  var ptc: js.UndefOr[String] = js.undefined
  /** Whether the fares on this pricing are refundable. */
  var refundable: js.UndefOr[Boolean] = js.undefined
  /** The total fare in the sale or equivalent currency. */
  var saleFareTotal: js.UndefOr[String] = js.undefined
  /** The taxes in the sale or equivalent currency. */
  var saleTaxTotal: js.UndefOr[String] = js.undefined
  /** Total per-passenger price (fare and tax) in the sale or equivalent currency. */
  var saleTotal: js.UndefOr[String] = js.undefined
  /** The per-segment price and baggage information. */
  var segmentPricing: js.UndefOr[js.Array[SegmentPricing]] = js.undefined
  /** The taxes used to calculate the tax total per ticket. */
  var tax: js.UndefOr[js.Array[TaxInfo]] = js.undefined
}

object PricingInfo {
  @scala.inline
  def apply(
    baseFareTotal: String = null,
    fare: js.Array[FareInfo] = null,
    fareCalculation: String = null,
    kind: String = null,
    latestTicketingTime: String = null,
    passengers: PassengerCounts = null,
    ptc: String = null,
    refundable: js.UndefOr[Boolean] = js.undefined,
    saleFareTotal: String = null,
    saleTaxTotal: String = null,
    saleTotal: String = null,
    segmentPricing: js.Array[SegmentPricing] = null,
    tax: js.Array[TaxInfo] = null
  ): PricingInfo = {
    val __obj = js.Dynamic.literal()
    if (baseFareTotal != null) __obj.updateDynamic("baseFareTotal")(baseFareTotal.asInstanceOf[js.Any])
    if (fare != null) __obj.updateDynamic("fare")(fare.asInstanceOf[js.Any])
    if (fareCalculation != null) __obj.updateDynamic("fareCalculation")(fareCalculation.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (latestTicketingTime != null) __obj.updateDynamic("latestTicketingTime")(latestTicketingTime.asInstanceOf[js.Any])
    if (passengers != null) __obj.updateDynamic("passengers")(passengers.asInstanceOf[js.Any])
    if (ptc != null) __obj.updateDynamic("ptc")(ptc.asInstanceOf[js.Any])
    if (!js.isUndefined(refundable)) __obj.updateDynamic("refundable")(refundable.asInstanceOf[js.Any])
    if (saleFareTotal != null) __obj.updateDynamic("saleFareTotal")(saleFareTotal.asInstanceOf[js.Any])
    if (saleTaxTotal != null) __obj.updateDynamic("saleTaxTotal")(saleTaxTotal.asInstanceOf[js.Any])
    if (saleTotal != null) __obj.updateDynamic("saleTotal")(saleTotal.asInstanceOf[js.Any])
    if (segmentPricing != null) __obj.updateDynamic("segmentPricing")(segmentPricing.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingInfo]
  }
}

