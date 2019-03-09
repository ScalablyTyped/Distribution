package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp extends js.Object {
  val nanoseconds: scala.Double
  val seconds: scala.Double
  /**
    * Returns true if this `Timestamp` is equal to the provided one.
    *
    * @param other The `Timestamp` to compare against.
    * @return true if this `Timestamp` is equal to the provided one.
    */
  def isEqual(other: Timestamp): scala.Boolean
  /**
    * Convert a Timestamp to a JavaScript `Date` object. This conversion causes
    * a loss of precision since `Date` objects only support millisecond precision.
    *
    * @return JavaScript `Date` object representing the same point in time as
    *     this `Timestamp`, with millisecond precision.
    */
  def toDate(): coreDashJsLib.Date
  /**
    * Convert a timestamp to a numeric timestamp (in milliseconds since epoch).
    * This operation causes a loss of precision.
    *
    * @return The point in time corresponding to this timestamp, represented as
    *     the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    */
  def toMillis(): scala.Double
}

object Timestamp {
  @scala.inline
  def apply(
    isEqual: js.Function1[Timestamp, scala.Boolean],
    nanoseconds: scala.Double,
    seconds: scala.Double,
    toDate: js.Function0[coreDashJsLib.Date],
    toMillis: js.Function0[scala.Double]
  ): Timestamp = {
    val __obj = js.Dynamic.literal(isEqual = isEqual, nanoseconds = nanoseconds, seconds = seconds, toDate = toDate, toMillis = toMillis)
  
    __obj.asInstanceOf[Timestamp]
  }
}

