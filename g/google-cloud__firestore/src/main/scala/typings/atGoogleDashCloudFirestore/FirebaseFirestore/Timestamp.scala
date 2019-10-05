package typings.atGoogleDashCloudFirestore.FirebaseFirestore

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FirebaseFirestore.Timestamp")
@js.native
class Timestamp protected () extends js.Object {
  /**
    * Creates a new timestamp.
    *
    * @param seconds The number of seconds of UTC time since Unix epoch
    * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
    * 9999-12-31T23:59:59Z inclusive.
    * @param nanoseconds The non-negative fractions of a second at nanosecond
    * resolution. Negative second values with fractions must still have
    * non-negative nanoseconds values that count forward in time. Must be from
    * 0 to 999,999,999 inclusive.
    */
  def this(seconds: Double, nanoseconds: Double) = this()
  /** The non-negative fractions of a second at nanosecond resolution. */
  val nanoseconds: Double = js.native
  /**
    * The number of seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z.
    */
  val seconds: Double = js.native
  /**
    * Returns true if this `Timestamp` is equal to the provided one.
    *
    * @param other The `Timestamp` to compare against.
    * @return 'true' if this `Timestamp` is equal to the provided one.
    */
  def isEqual(other: Timestamp): Boolean = js.native
  /**
    * Returns a new `Date` corresponding to this timestamp. This may lose
    * precision.
    *
    * @return JavaScript `Date` object representing the same point in time as
    * this `Timestamp`, with millisecond precision.
    */
  def toDate(): Date = js.native
  /**
    * Returns the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    *
    * @return The point in time corresponding to this timestamp, represented as
    * the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    */
  def toMillis(): Double = js.native
}

/* static members */
@JSGlobal("FirebaseFirestore.Timestamp")
@js.native
object Timestamp extends js.Object {
  /**
    * Creates a new timestamp from the given date.
    *
    * @param date The date to initialize the `Timestamp` from.
    * @return A new `Timestamp` representing the same point in time as the
    * given date.
    */
  def fromDate(date: Date): Timestamp = js.native
  /**
    * Creates a new timestamp from the given number of milliseconds.
    *
    * @param milliseconds Number of milliseconds since Unix epoch
    * 1970-01-01T00:00:00Z.
    * @return A new `Timestamp` representing the same point in time as the
    * given number of milliseconds.
    */
  def fromMillis(milliseconds: Double): Timestamp = js.native
  /**
    * Creates a new timestamp with the current date, with millisecond precision.
    *
    * @return A new `Timestamp` representing the current date.
    */
  def now(): Timestamp = js.native
}

