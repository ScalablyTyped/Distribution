package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateQuerySnapshot[T /* <: AggregateSpec */] extends StObject {
  
  /**
    * Returns the results of the aggregations performed over the underlying
    * query.
    *
    * The keys of the returned object will be the same as those of the
    * `AggregateSpec` object specified to the aggregation method, and the
    * values will be the corresponding aggregation result.
    *
    * @returns The results of the aggregations performed over the underlying
    * query.
    */
  def data(): AggregateSpecData[T]
  
  /**
    * Compares this object with the given object for equality.
    *
    * Two `AggregateQuerySnapshot` instances are considered "equal" if they
    * have the same data and their underlying queries compare "equal" using
    * `AggregateQuery.isEqual()`.
    *
    * @param other The object to compare to this object for equality.
    * @return `true` if this object is "equal" to the given object, as
    * defined above, or `false` otherwise.
    */
  def isEqual(other: AggregateQuerySnapshot[T]): Boolean
  
  /** The query that was executed to produce this result. */
  val query: AggregateQuery[T]
  
  /** The time this snapshot was read. */
  val readTime: Timestamp
}
object AggregateQuerySnapshot {
  
  inline def apply[T /* <: AggregateSpec */](
    data: () => AggregateSpecData[T],
    isEqual: AggregateQuerySnapshot[T] => Boolean,
    query: AggregateQuery[T],
    readTime: Timestamp
  ): AggregateQuerySnapshot[T] = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), isEqual = js.Any.fromFunction1(isEqual), query = query.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateQuerySnapshot[T]]
  }
  
  extension [Self <: AggregateQuerySnapshot[?], T /* <: AggregateSpec */](x: Self & AggregateQuerySnapshot[T]) {
    
    inline def setData(value: () => AggregateSpecData[T]): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
    
    inline def setIsEqual(value: AggregateQuerySnapshot[T] => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setQuery(value: AggregateQuery[T]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: Timestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
  }
}
