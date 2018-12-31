package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingInfo extends js.Object {
  /**
    * The total fare in the base fare currency (the currency of the country of origin). This element is only present when the sales currency and the currency
    * of the country of commencement are different.
    */
  var baseFareTotal: js.UndefOr[java.lang.String] = js.undefined
  /** The fare used to price one or more segments. */
  var fare: js.UndefOr[js.Array[FareInfo]] = js.undefined
  /** The horizontal fare calculation. This is a field on a ticket that displays all of the relevant items that go into the calculation of the fare. */
  var fareCalculation: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this as a pricing object, representing the price of one or more travel segments. Value: the fixed string qpxexpress#pricingInfo. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The latest ticketing time for this pricing assuming the reservation occurs at ticketing time and there is no change in fares/rules. The time is local
    * to the point of sale (POS).
    */
  var latestTicketingTime: js.UndefOr[java.lang.String] = js.undefined
  /** The number of passengers to which this price applies. */
  var passengers: js.UndefOr[PassengerCounts] = js.undefined
  /**
    * The passenger type code for this pricing. An alphanumeric code used by a carrier to restrict fares to certain categories of passenger. For instance, a
    * fare might be valid only for senior citizens.
    */
  var ptc: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the fares on this pricing are refundable. */
  var refundable: js.UndefOr[scala.Boolean] = js.undefined
  /** The total fare in the sale or equivalent currency. */
  var saleFareTotal: js.UndefOr[java.lang.String] = js.undefined
  /** The taxes in the sale or equivalent currency. */
  var saleTaxTotal: js.UndefOr[java.lang.String] = js.undefined
  /** Total per-passenger price (fare and tax) in the sale or equivalent currency. */
  var saleTotal: js.UndefOr[java.lang.String] = js.undefined
  /** The per-segment price and baggage information. */
  var segmentPricing: js.UndefOr[js.Array[SegmentPricing]] = js.undefined
  /** The taxes used to calculate the tax total per ticket. */
  var tax: js.UndefOr[js.Array[TaxInfo]] = js.undefined
}

