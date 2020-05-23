package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripOptionsRequest extends js.Object {
  /**
    * Do not return solutions that cost more than this price. The alphabetical part of the price is in ISO 4217. The format, in regex, is [A-Z]{3}\d+(\.\d+)?
    * Example: $102.07
    */
  var maxPrice: js.UndefOr[String] = js.undefined
  /** Counts for each passenger type in the request. */
  var passengers: js.UndefOr[PassengerCounts] = js.undefined
  /** Return only solutions with refundable fares. */
  var refundable: js.UndefOr[Boolean] = js.undefined
  /** IATA country code representing the point of sale. This determines the "equivalent amount paid" currency for the ticket. */
  var saleCountry: js.UndefOr[String] = js.undefined
  /**
    * The slices that make up the itinerary of this trip. A slice represents a traveler's intent, the portion of a low-fare search corresponding to a
    * traveler's request to get between two points. One-way journeys are generally expressed using one slice, round-trips using two. An example of a one
    * slice trip with three segments might be BOS-SYD, SYD-LAX, LAX-BOS if the traveler only stopped in SYD and LAX just long enough to change planes.
    */
  var slice: js.UndefOr[js.Array[SliceInput]] = js.undefined
  /** The number of solutions to return, maximum 500. */
  var solutions: js.UndefOr[Double] = js.undefined
  /** IATA country code representing the point of ticketing. */
  var ticketingCountry: js.UndefOr[String] = js.undefined
}

object TripOptionsRequest {
  @scala.inline
  def apply(
    maxPrice: String = null,
    passengers: PassengerCounts = null,
    refundable: js.UndefOr[Boolean] = js.undefined,
    saleCountry: String = null,
    slice: js.Array[SliceInput] = null,
    solutions: js.UndefOr[Double] = js.undefined,
    ticketingCountry: String = null
  ): TripOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxPrice != null) __obj.updateDynamic("maxPrice")(maxPrice.asInstanceOf[js.Any])
    if (passengers != null) __obj.updateDynamic("passengers")(passengers.asInstanceOf[js.Any])
    if (!js.isUndefined(refundable)) __obj.updateDynamic("refundable")(refundable.get.asInstanceOf[js.Any])
    if (saleCountry != null) __obj.updateDynamic("saleCountry")(saleCountry.asInstanceOf[js.Any])
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    if (!js.isUndefined(solutions)) __obj.updateDynamic("solutions")(solutions.get.asInstanceOf[js.Any])
    if (ticketingCountry != null) __obj.updateDynamic("ticketingCountry")(ticketingCountry.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripOptionsRequest]
  }
}

