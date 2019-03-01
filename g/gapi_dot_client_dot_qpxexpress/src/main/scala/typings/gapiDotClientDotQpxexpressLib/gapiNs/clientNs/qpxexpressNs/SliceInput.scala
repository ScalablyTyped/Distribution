package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceInput extends js.Object {
  /**
    * Slices with only the carriers in this alliance should be returned; do not use this field with permittedCarrier. Allowed values are ONEWORLD, SKYTEAM,
    * and STAR.
    */
  var alliance: js.UndefOr[java.lang.String] = js.undefined
  /** Departure date in YYYY-MM-DD format. */
  var date: js.UndefOr[java.lang.String] = js.undefined
  /** Airport or city IATA designator of the destination. */
  var destination: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this as a slice input object, representing the criteria a desired slice must satisfy. Value: the fixed string qpxexpress#sliceInput. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The longest connection between two legs, in minutes, you are willing to accept. */
  var maxConnectionDuration: js.UndefOr[scala.Double] = js.undefined
  /** The maximum number of stops you are willing to accept in this slice. */
  var maxStops: js.UndefOr[scala.Double] = js.undefined
  /** Airport or city IATA designator of the origin. */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /** A list of 2-letter IATA airline designators. Slices with only these carriers should be returned. */
  var permittedCarrier: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Slices must depart in this time of day range, local to the point of departure. */
  var permittedDepartureTime: js.UndefOr[TimeOfDayRange] = js.undefined
  /** Prefer solutions that book in this cabin for this slice. Allowed values are COACH, PREMIUM_COACH, BUSINESS, and FIRST. */
  var preferredCabin: js.UndefOr[java.lang.String] = js.undefined
  /** A list of 2-letter IATA airline designators. Exclude slices that use these carriers. */
  var prohibitedCarrier: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SliceInput {
  @scala.inline
  def apply(
    alliance: java.lang.String = null,
    date: java.lang.String = null,
    destination: java.lang.String = null,
    kind: java.lang.String = null,
    maxConnectionDuration: scala.Int | scala.Double = null,
    maxStops: scala.Int | scala.Double = null,
    origin: java.lang.String = null,
    permittedCarrier: js.Array[java.lang.String] = null,
    permittedDepartureTime: TimeOfDayRange = null,
    preferredCabin: java.lang.String = null,
    prohibitedCarrier: js.Array[java.lang.String] = null
  ): SliceInput = {
    val __obj = js.Dynamic.literal()
    if (alliance != null) __obj.updateDynamic("alliance")(alliance)
    if (date != null) __obj.updateDynamic("date")(date)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (maxConnectionDuration != null) __obj.updateDynamic("maxConnectionDuration")(maxConnectionDuration.asInstanceOf[js.Any])
    if (maxStops != null) __obj.updateDynamic("maxStops")(maxStops.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (permittedCarrier != null) __obj.updateDynamic("permittedCarrier")(permittedCarrier)
    if (permittedDepartureTime != null) __obj.updateDynamic("permittedDepartureTime")(permittedDepartureTime)
    if (preferredCabin != null) __obj.updateDynamic("preferredCabin")(preferredCabin)
    if (prohibitedCarrier != null) __obj.updateDynamic("prohibitedCarrier")(prohibitedCarrier)
    __obj.asInstanceOf[SliceInput]
  }
}

