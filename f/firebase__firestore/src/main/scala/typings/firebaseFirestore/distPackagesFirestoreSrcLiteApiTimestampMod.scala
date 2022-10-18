package typings.firebaseFirestore

import typings.firebaseFirestore.anon.Nanoseconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLiteApiTimestampMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/timestamp", "Timestamp")
  @js.native
  open class Timestamp protected () extends StObject {
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
    
    def _compareTo(other: Timestamp): Double = js.native
    
    /**
      * Returns true if this `Timestamp` is equal to the provided one.
      *
      * @param other - The `Timestamp` to compare against.
      * @returns true if this `Timestamp` is equal to the provided one.
      */
    def isEqual(other: Timestamp): Boolean = js.native
    
    /**
      * The fractions of a second at nanosecond resolution.*
      */
    val nanoseconds: Double = js.native
    
    /**
      * The number of seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z.
      */
    val seconds: Double = js.native
    
    /**
      * Converts a `Timestamp` to a JavaScript `Date` object. This conversion
      * causes a loss of precision since `Date` objects only support millisecond
      * precision.
      *
      * @returns JavaScript `Date` object representing the same point in time as
      *     this `Timestamp`, with millisecond precision.
      */
    def toDate(): js.Date = js.native
    
    /** Returns a JSON-serializable representation of this `Timestamp`. */
    def toJSON(): Nanoseconds = js.native
    
    /**
      * Converts a `Timestamp` to a numeric timestamp (in milliseconds since
      * epoch). This operation causes a loss of precision.
      *
      * @returns The point in time corresponding to this timestamp, represented as
      *     the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
      */
    def toMillis(): Double = js.native
  }
  /* static members */
  object Timestamp {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/timestamp", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date - The date to initialize the `Timestamp` from.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     date.
      */
    inline def fromDate(date: js.Date): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds - Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @returns a new timestamp representing the current date.
      */
    inline def now(): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Timestamp]
  }
}
