package typings.firebase.compatMod.firebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timestamp extends StObject {
  
  /**
    * Returns true if this `Timestamp` is equal to the provided one.
    *
    * @param other The `Timestamp` to compare against.
    * @return true if this `Timestamp` is equal to the provided one.
    */
  def isEqual(other: Timestamp): Boolean
  
  val nanoseconds: Double
  
  val seconds: Double
  
  /**
    * Convert a Timestamp to a JavaScript `Date` object. This conversion causes
    * a loss of precision since `Date` objects only support millisecond precision.
    *
    * @return JavaScript `Date` object representing the same point in time as
    *     this `Timestamp`, with millisecond precision.
    */
  def toDate(): js.Date
  
  /**
    * Convert a timestamp to a numeric timestamp (in milliseconds since epoch).
    * This operation causes a loss of precision.
    *
    * @return The point in time corresponding to this timestamp, represented as
    *     the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
    */
  def toMillis(): Double
}
object Timestamp {
  
  inline def apply(
    isEqual: Timestamp => Boolean,
    nanoseconds: Double,
    seconds: Double,
    toDate: () => js.Date,
    toMillis: () => Double
  ): Timestamp = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], toDate = js.Any.fromFunction0(toDate), toMillis = js.Any.fromFunction0(toMillis))
    __obj.asInstanceOf[Timestamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
    
    inline def setIsEqual(value: Timestamp => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setNanoseconds(value: Double): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setToDate(value: () => js.Date): Self = StObject.set(x, "toDate", js.Any.fromFunction0(value))
    
    inline def setToMillis(value: () => Double): Self = StObject.set(x, "toMillis", js.Any.fromFunction0(value))
  }
}
