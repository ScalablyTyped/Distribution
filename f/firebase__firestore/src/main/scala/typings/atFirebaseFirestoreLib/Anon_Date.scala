package typings
package atFirebaseFirestoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Date
  extends org.scalablytyped.runtime.Instantiable2[
      /* seconds */ scala.Double, 
      /* nanoseconds */ scala.Double, 
      atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.Timestamp
    ] {
  /**
    * Creates a new timestamp from the given date.
    *
    * @param date The date to initialize the `Timestamp` from.
    * @return A new `Timestamp` representing the same point in time as the given
    *     date.
    */
  def fromDate(date: stdLib.Date): atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.Timestamp = js.native
  /**
    * Creates a new timestamp from the given number of milliseconds.
    *
    * @param milliseconds Number of milliseconds since Unix epoch
    *     1970-01-01T00:00:00Z.
    * @return A new `Timestamp` representing the same point in time as the given
    *     number of milliseconds.
    */
  def fromMillis(milliseconds: scala.Double): atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.Timestamp = js.native
  /**
    * Creates a new timestamp with the current date, with millisecond precision.
    *
    * @return a new timestamp representing the current date.
    */
  def now(): atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.Timestamp = js.native
}

