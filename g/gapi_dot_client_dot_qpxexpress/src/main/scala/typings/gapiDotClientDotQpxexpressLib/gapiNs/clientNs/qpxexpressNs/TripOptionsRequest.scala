package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TripOptionsRequest extends js.Object {
  /**
               * Do not return solutions that cost more than this price. The alphabetical part of the price is in ISO 4217. The format, in regex, is [A-Z]{3}\d+(\.\d+)?
               * Example: $102.07
               */
  var maxPrice: js.UndefOr[java.lang.String] = js.undefined
  /** Counts for each passenger type in the request. */
  var passengers: js.UndefOr[PassengerCounts] = js.undefined
  /** Return only solutions with refundable fares. */
  var refundable: js.UndefOr[scala.Boolean] = js.undefined
  /** IATA country code representing the point of sale. This determines the "equivalent amount paid" currency for the ticket. */
  var saleCountry: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The slices that make up the itinerary of this trip. A slice represents a traveler's intent, the portion of a low-fare search corresponding to a
               * traveler's request to get between two points. One-way journeys are generally expressed using one slice, round-trips using two. An example of a one
               * slice trip with three segments might be BOS-SYD, SYD-LAX, LAX-BOS if the traveler only stopped in SYD and LAX just long enough to change planes.
               */
  var slice: js.UndefOr[js.Array[SliceInput]] = js.undefined
  /** The number of solutions to return, maximum 500. */
  var solutions: js.UndefOr[scala.Double] = js.undefined
  /** IATA country code representing the point of ticketing. */
  var ticketingCountry: js.UndefOr[java.lang.String] = js.undefined
}

