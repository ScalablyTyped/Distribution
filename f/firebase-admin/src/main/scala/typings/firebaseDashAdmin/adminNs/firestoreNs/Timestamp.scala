package typings.firebaseDashAdmin.adminNs.firestoreNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/firestore", "Timestamp")
@js.native
class Timestamp protected ()
  extends typings.atGoogleDashCloudFirestore.FirebaseFirestoreNs.Timestamp {
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
}

/* static members */
@JSImport("@google-cloud/firestore", "Timestamp")
@js.native
object Timestamp extends js.Object {
  /**
    * Creates a new timestamp from the given date.
    *
    * @param date The date to initialize the `Timestamp` from.
    * @return A new `Timestamp` representing the same point in time as the
    * given date.
    */
  def fromDate(date: Date): typings.atGoogleDashCloudFirestore.FirebaseFirestoreNs.Timestamp = js.native
  /**
    * Creates a new timestamp from the given number of milliseconds.
    *
    * @param milliseconds Number of milliseconds since Unix epoch
    * 1970-01-01T00:00:00Z.
    * @return A new `Timestamp` representing the same point in time as the
    * given number of milliseconds.
    */
  def fromMillis(milliseconds: Double): typings.atGoogleDashCloudFirestore.FirebaseFirestoreNs.Timestamp = js.native
  /**
    * Creates a new timestamp with the current date, with millisecond precision.
    *
    * @return A new `Timestamp` representing the current date.
    */
  def now(): typings.atGoogleDashCloudFirestore.FirebaseFirestoreNs.Timestamp = js.native
}

