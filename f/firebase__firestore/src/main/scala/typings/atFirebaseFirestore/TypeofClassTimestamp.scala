package typings.atFirebaseFirestore

import org.scalablytyped.runtime.Instantiable2
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Timestamp
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassTimestamp extends Instantiable2[/* seconds */ Double, /* nanoseconds */ Double, Timestamp] {
  /**
    * Creates a new timestamp from the given date.
    *
    * @param date The date to initialize the `Timestamp` from.
    * @return A new `Timestamp` representing the same point in time as the given
    *     date.
    */
  def fromDate(date: Date): Timestamp = js.native
  /**
    * Creates a new timestamp from the given number of milliseconds.
    *
    * @param milliseconds Number of milliseconds since Unix epoch
    *     1970-01-01T00:00:00Z.
    * @return A new `Timestamp` representing the same point in time as the given
    *     number of milliseconds.
    */
  def fromMillis(milliseconds: Double): Timestamp = js.native
  /**
    * Creates a new timestamp with the current date, with millisecond precision.
    *
    * @return a new timestamp representing the current date.
    */
  def now(): Timestamp = js.native
}

