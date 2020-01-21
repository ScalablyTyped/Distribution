package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripOption extends js.Object {
  /** Identifier uniquely identifying this trip in a response. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies this as a trip information object. Value: the fixed string qpxexpress#tripOption. */
  var kind: js.UndefOr[String] = js.undefined
  /** Per passenger pricing information. */
  var pricing: js.UndefOr[js.Array[PricingInfo]] = js.undefined
  /** The total price for all passengers on the trip, in the form of a currency followed by an amount, e.g. USD253.35. */
  var saleTotal: js.UndefOr[String] = js.undefined
  /** The slices that make up this trip's itinerary. */
  var slice: js.UndefOr[js.Array[SliceInfo]] = js.undefined
}

object TripOption {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    pricing: js.Array[PricingInfo] = null,
    saleTotal: String = null,
    slice: js.Array[SliceInfo] = null
  ): TripOption = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pricing != null) __obj.updateDynamic("pricing")(pricing.asInstanceOf[js.Any])
    if (saleTotal != null) __obj.updateDynamic("saleTotal")(saleTotal.asInstanceOf[js.Any])
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripOption]
  }
}

