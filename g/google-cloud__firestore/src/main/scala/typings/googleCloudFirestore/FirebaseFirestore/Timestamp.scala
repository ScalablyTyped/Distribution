package typings.googleCloudFirestore.FirebaseFirestore

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp extends js.Object {
  /** The non-negative fractions of a second at nanosecond resolution. */
  val nanoseconds: Double
  /**
    * The number of seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z.
    */
  val seconds: Double
  /**
    * Returns true if this `Timestamp` is equal to the provided one.
    *
    * @param other The `Timestamp` to compare against.
    * @return 'true' if this `Timestamp` is equal to the provided one.
    */
  def isEqual(other: Timestamp): Boolean
  /**
    * Returns a new `Date` corresponding to this timestamp. This may lose
    * precision.
    *
    * @return JavaScript `Date` object representing the same point in time as
    * this `Timestamp`, with millisecond precision.
    */
  def toDate(): Date
  /**
    * Returns the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    *
    * @return The point in time corresponding to this timestamp, represented as
    * the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    */
  def toMillis(): Double
}

object Timestamp {
  @scala.inline
  def apply(
    isEqual: Timestamp => Boolean,
    nanoseconds: Double,
    seconds: Double,
    toDate: () => Date,
    toMillis: () => Double
  ): Timestamp = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], toDate = js.Any.fromFunction0(toDate), toMillis = js.Any.fromFunction0(toMillis))
    __obj.asInstanceOf[Timestamp]
  }
}

