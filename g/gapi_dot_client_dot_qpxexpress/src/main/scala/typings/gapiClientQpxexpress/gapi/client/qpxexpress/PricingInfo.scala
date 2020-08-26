package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricingInfo extends js.Object {
  /**
    * The total fare in the base fare currency (the currency of the country of origin). This element is only present when the sales currency and the currency
    * of the country of commencement are different.
    */
  var baseFareTotal: js.UndefOr[String] = js.native
  /** The fare used to price one or more segments. */
  var fare: js.UndefOr[js.Array[FareInfo]] = js.native
  /** The horizontal fare calculation. This is a field on a ticket that displays all of the relevant items that go into the calculation of the fare. */
  var fareCalculation: js.UndefOr[String] = js.native
  /** Identifies this as a pricing object, representing the price of one or more travel segments. Value: the fixed string qpxexpress#pricingInfo. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The latest ticketing time for this pricing assuming the reservation occurs at ticketing time and there is no change in fares/rules. The time is local
    * to the point of sale (POS).
    */
  var latestTicketingTime: js.UndefOr[String] = js.native
  /** The number of passengers to which this price applies. */
  var passengers: js.UndefOr[PassengerCounts] = js.native
  /**
    * The passenger type code for this pricing. An alphanumeric code used by a carrier to restrict fares to certain categories of passenger. For instance, a
    * fare might be valid only for senior citizens.
    */
  var ptc: js.UndefOr[String] = js.native
  /** Whether the fares on this pricing are refundable. */
  var refundable: js.UndefOr[Boolean] = js.native
  /** The total fare in the sale or equivalent currency. */
  var saleFareTotal: js.UndefOr[String] = js.native
  /** The taxes in the sale or equivalent currency. */
  var saleTaxTotal: js.UndefOr[String] = js.native
  /** Total per-passenger price (fare and tax) in the sale or equivalent currency. */
  var saleTotal: js.UndefOr[String] = js.native
  /** The per-segment price and baggage information. */
  var segmentPricing: js.UndefOr[js.Array[SegmentPricing]] = js.native
  /** The taxes used to calculate the tax total per ticket. */
  var tax: js.UndefOr[js.Array[TaxInfo]] = js.native
}

object PricingInfo {
  @scala.inline
  def apply(): PricingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingInfo]
  }
  @scala.inline
  implicit class PricingInfoOps[Self <: PricingInfo] (val x: Self) extends AnyVal {
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
    def setBaseFareTotal(value: String): Self = this.set("baseFareTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseFareTotal: Self = this.set("baseFareTotal", js.undefined)
    @scala.inline
    def setFareVarargs(value: FareInfo*): Self = this.set("fare", js.Array(value :_*))
    @scala.inline
    def setFare(value: js.Array[FareInfo]): Self = this.set("fare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFare: Self = this.set("fare", js.undefined)
    @scala.inline
    def setFareCalculation(value: String): Self = this.set("fareCalculation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFareCalculation: Self = this.set("fareCalculation", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLatestTicketingTime(value: String): Self = this.set("latestTicketingTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestTicketingTime: Self = this.set("latestTicketingTime", js.undefined)
    @scala.inline
    def setPassengers(value: PassengerCounts): Self = this.set("passengers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassengers: Self = this.set("passengers", js.undefined)
    @scala.inline
    def setPtc(value: String): Self = this.set("ptc", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePtc: Self = this.set("ptc", js.undefined)
    @scala.inline
    def setRefundable(value: Boolean): Self = this.set("refundable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefundable: Self = this.set("refundable", js.undefined)
    @scala.inline
    def setSaleFareTotal(value: String): Self = this.set("saleFareTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaleFareTotal: Self = this.set("saleFareTotal", js.undefined)
    @scala.inline
    def setSaleTaxTotal(value: String): Self = this.set("saleTaxTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaleTaxTotal: Self = this.set("saleTaxTotal", js.undefined)
    @scala.inline
    def setSaleTotal(value: String): Self = this.set("saleTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaleTotal: Self = this.set("saleTotal", js.undefined)
    @scala.inline
    def setSegmentPricingVarargs(value: SegmentPricing*): Self = this.set("segmentPricing", js.Array(value :_*))
    @scala.inline
    def setSegmentPricing(value: js.Array[SegmentPricing]): Self = this.set("segmentPricing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentPricing: Self = this.set("segmentPricing", js.undefined)
    @scala.inline
    def setTaxVarargs(value: TaxInfo*): Self = this.set("tax", js.Array(value :_*))
    @scala.inline
    def setTax(value: js.Array[TaxInfo]): Self = this.set("tax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax: Self = this.set("tax", js.undefined)
  }
  
}

