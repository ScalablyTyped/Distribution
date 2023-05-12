package typings.firebaseFirestore.distLiteFirestoreSrcIndexDotnodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/index.node", "Timestamp")
@js.native
open class Timestamp protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcApiMod.Timestamp {
  /**
    * Creates a new timestamp.
    *
    * @param seconds - The number of seconds of UTC time since Unix epoch
    *     1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
    *     9999-12-31T23:59:59Z inclusive.
    * @param nanoseconds - The non-negative fractions of a second at nanosecond
    *     resolution. Negative second values with fractions must still have
    *     non-negative nanoseconds values that count forward in time. Must be
    *     from 0 to 999,999,999 inclusive.
    */
  def this(
    /**
    * The number of seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z.
    */
  seconds: Double,
    /**
    * The fractions of a second at nanosecond resolution.*
    */
  nanoseconds: Double
  ) = this()
}
/* static members */
object Timestamp {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/index.node", "Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new timestamp from the given date.
    *
    * @param date - The date to initialize the `Timestamp` from.
    * @returns A new `Timestamp` representing the same point in time as the given
    *     date.
    */
  inline def fromDate(date: js.Date): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp]
  
  /**
    * Creates a new timestamp from the given number of milliseconds.
    *
    * @param milliseconds - Number of milliseconds since Unix epoch
    *     1970-01-01T00:00:00Z.
    * @returns A new `Timestamp` representing the same point in time as the given
    *     number of milliseconds.
    */
  inline def fromMillis(milliseconds: Double): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp]
  
  /**
    * Creates a new timestamp with the current date, with millisecond precision.
    *
    * @returns a new timestamp representing the current date.
    */
  inline def now(): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp]
}
