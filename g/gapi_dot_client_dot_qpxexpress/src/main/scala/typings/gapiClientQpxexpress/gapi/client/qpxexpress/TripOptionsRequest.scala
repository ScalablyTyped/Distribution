package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripOptionsRequest extends js.Object {
  /**
    * Do not return solutions that cost more than this price. The alphabetical part of the price is in ISO 4217. The format, in regex, is [A-Z]{3}\d+(\.\d+)?
    * Example: $102.07
    */
  var maxPrice: js.UndefOr[String] = js.native
  /** Counts for each passenger type in the request. */
  var passengers: js.UndefOr[PassengerCounts] = js.native
  /** Return only solutions with refundable fares. */
  var refundable: js.UndefOr[Boolean] = js.native
  /** IATA country code representing the point of sale. This determines the "equivalent amount paid" currency for the ticket. */
  var saleCountry: js.UndefOr[String] = js.native
  /**
    * The slices that make up the itinerary of this trip. A slice represents a traveler's intent, the portion of a low-fare search corresponding to a
    * traveler's request to get between two points. One-way journeys are generally expressed using one slice, round-trips using two. An example of a one
    * slice trip with three segments might be BOS-SYD, SYD-LAX, LAX-BOS if the traveler only stopped in SYD and LAX just long enough to change planes.
    */
  var slice: js.UndefOr[js.Array[SliceInput]] = js.native
  /** The number of solutions to return, maximum 500. */
  var solutions: js.UndefOr[Double] = js.native
  /** IATA country code representing the point of ticketing. */
  var ticketingCountry: js.UndefOr[String] = js.native
}

object TripOptionsRequest {
  @scala.inline
  def apply(): TripOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripOptionsRequest]
  }
  @scala.inline
  implicit class TripOptionsRequestOps[Self <: TripOptionsRequest] (val x: Self) extends AnyVal {
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
    def setMaxPrice(value: String): Self = this.set("maxPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPrice: Self = this.set("maxPrice", js.undefined)
    @scala.inline
    def setPassengers(value: PassengerCounts): Self = this.set("passengers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassengers: Self = this.set("passengers", js.undefined)
    @scala.inline
    def setRefundable(value: Boolean): Self = this.set("refundable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefundable: Self = this.set("refundable", js.undefined)
    @scala.inline
    def setSaleCountry(value: String): Self = this.set("saleCountry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaleCountry: Self = this.set("saleCountry", js.undefined)
    @scala.inline
    def setSliceVarargs(value: SliceInput*): Self = this.set("slice", js.Array(value :_*))
    @scala.inline
    def setSlice(value: js.Array[SliceInput]): Self = this.set("slice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlice: Self = this.set("slice", js.undefined)
    @scala.inline
    def setSolutions(value: Double): Self = this.set("solutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolutions: Self = this.set("solutions", js.undefined)
    @scala.inline
    def setTicketingCountry(value: String): Self = this.set("ticketingCountry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicketingCountry: Self = this.set("ticketingCountry", js.undefined)
  }
  
}

