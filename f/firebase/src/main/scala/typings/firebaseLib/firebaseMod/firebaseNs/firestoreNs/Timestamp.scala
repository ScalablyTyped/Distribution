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
    * Returns a new `Date` corresponding to this timestamp. This may lose
    * precision.
    *
    * @return JavaScript `Date` object representing the same point in time as
    *     this `Timestamp`, with millisecond precision.
    */
  def toDate(): coreDashJsLib.Date
  /**
    * Returns the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isEqual")(isEqual)
    __obj.updateDynamic("nanoseconds")(nanoseconds)
    __obj.updateDynamic("seconds")(seconds)
    __obj.updateDynamic("toDate")(toDate)
    __obj.updateDynamic("toMillis")(toMillis)
    __obj.asInstanceOf[Timestamp]
  }
}

