package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A version of a document in Firestore. This corresponds to the version
  * timestamp, such as update_time or read_time.
  */
trait SnapshotVersion extends StObject {
  
  def compareTo(other: SnapshotVersion): Double
  
  def isEqual(other: SnapshotVersion): Boolean
  
  /* private */ var timestamp: Any
  
  /** Returns a number representation of the version for use in spec tests. */
  def toMicroseconds(): Double
  
  def toTimestamp(): Timestamp
}
object SnapshotVersion {
  
  inline def apply(
    compareTo: SnapshotVersion => Double,
    isEqual: SnapshotVersion => Boolean,
    timestamp: Any,
    toMicroseconds: () => Double,
    toTimestamp: () => Timestamp
  ): SnapshotVersion = {
    val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo), isEqual = js.Any.fromFunction1(isEqual), timestamp = timestamp.asInstanceOf[js.Any], toMicroseconds = js.Any.fromFunction0(toMicroseconds), toTimestamp = js.Any.fromFunction0(toTimestamp))
    __obj.asInstanceOf[SnapshotVersion]
  }
  
  extension [Self <: SnapshotVersion](x: Self) {
    
    inline def setCompareTo(value: SnapshotVersion => Double): Self = StObject.set(x, "compareTo", js.Any.fromFunction1(value))
    
    inline def setIsEqual(value: SnapshotVersion => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setTimestamp(value: Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setToMicroseconds(value: () => Double): Self = StObject.set(x, "toMicroseconds", js.Any.fromFunction0(value))
    
    inline def setToTimestamp(value: () => Timestamp): Self = StObject.set(x, "toTimestamp", js.Any.fromFunction0(value))
  }
}
