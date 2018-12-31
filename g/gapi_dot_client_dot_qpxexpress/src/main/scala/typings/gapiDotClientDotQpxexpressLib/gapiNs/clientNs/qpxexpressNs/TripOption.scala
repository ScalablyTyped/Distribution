package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripOption extends js.Object {
  /** Identifier uniquely identifying this trip in a response. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this as a trip information object. Value: the fixed string qpxexpress#tripOption. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Per passenger pricing information. */
  var pricing: js.UndefOr[js.Array[PricingInfo]] = js.undefined
  /** The total price for all passengers on the trip, in the form of a currency followed by an amount, e.g. USD253.35. */
  var saleTotal: js.UndefOr[java.lang.String] = js.undefined
  /** The slices that make up this trip's itinerary. */
  var slice: js.UndefOr[js.Array[SliceInfo]] = js.undefined
}

