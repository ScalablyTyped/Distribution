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

