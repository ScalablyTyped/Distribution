package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceInput extends js.Object {
  /**
    * Slices with only the carriers in this alliance should be returned; do not use this field with permittedCarrier. Allowed values are ONEWORLD, SKYTEAM,
    * and STAR.
    */
  var alliance: js.UndefOr[String] = js.undefined
  /** Departure date in YYYY-MM-DD format. */
  var date: js.UndefOr[String] = js.undefined
  /** Airport or city IATA designator of the destination. */
  var destination: js.UndefOr[String] = js.undefined
  /** Identifies this as a slice input object, representing the criteria a desired slice must satisfy. Value: the fixed string qpxexpress#sliceInput. */
  var kind: js.UndefOr[String] = js.undefined
  /** The longest connection between two legs, in minutes, you are willing to accept. */
  var maxConnectionDuration: js.UndefOr[Double] = js.undefined
  /** The maximum number of stops you are willing to accept in this slice. */
  var maxStops: js.UndefOr[Double] = js.undefined
  /** Airport or city IATA designator of the origin. */
  var origin: js.UndefOr[String] = js.undefined
  /** A list of 2-letter IATA airline designators. Slices with only these carriers should be returned. */
  var permittedCarrier: js.UndefOr[js.Array[String]] = js.undefined
  /** Slices must depart in this time of day range, local to the point of departure. */
  var permittedDepartureTime: js.UndefOr[TimeOfDayRange] = js.undefined
  /** Prefer solutions that book in this cabin for this slice. Allowed values are COACH, PREMIUM_COACH, BUSINESS, and FIRST. */
  var preferredCabin: js.UndefOr[String] = js.undefined
  /** A list of 2-letter IATA airline designators. Exclude slices that use these carriers. */
  var prohibitedCarrier: js.UndefOr[js.Array[String]] = js.undefined
}

object SliceInput {
  @scala.inline
  def apply(
    alliance: String = null,
    date: String = null,
    destination: String = null,
    kind: String = null,
    maxConnectionDuration: js.UndefOr[Double] = js.undefined,
    maxStops: js.UndefOr[Double] = js.undefined,
    origin: String = null,
    permittedCarrier: js.Array[String] = null,
    permittedDepartureTime: TimeOfDayRange = null,
    preferredCabin: String = null,
    prohibitedCarrier: js.Array[String] = null
  ): SliceInput = {
    val __obj = js.Dynamic.literal()
    if (alliance != null) __obj.updateDynamic("alliance")(alliance.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConnectionDuration)) __obj.updateDynamic("maxConnectionDuration")(maxConnectionDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxStops)) __obj.updateDynamic("maxStops")(maxStops.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (permittedCarrier != null) __obj.updateDynamic("permittedCarrier")(permittedCarrier.asInstanceOf[js.Any])
    if (permittedDepartureTime != null) __obj.updateDynamic("permittedDepartureTime")(permittedDepartureTime.asInstanceOf[js.Any])
    if (preferredCabin != null) __obj.updateDynamic("preferredCabin")(preferredCabin.asInstanceOf[js.Any])
    if (prohibitedCarrier != null) __obj.updateDynamic("prohibitedCarrier")(prohibitedCarrier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceInput]
  }
}

