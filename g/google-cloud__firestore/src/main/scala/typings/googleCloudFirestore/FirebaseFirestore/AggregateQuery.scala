package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateQuery[T /* <: AggregateSpec */] extends StObject {
  
  /**
    * Executes this query.
    *
    * @return A promise that will be resolved with the results of the query.
    */
  def get(): js.Promise[AggregateQuerySnapshot[T]]
  
  /**
    * Compares this object with the given object for equality.
    *
    * This object is considered "equal" to the other object if and only if
    * `other` performs the same aggregations as this `AggregateQuery` and
    * the underlying Query of `other` compares equal to that of this object
    * using `Query.isEqual()`.
    *
    * @param other The object to compare to this object for equality.
    * @return `true` if this object is "equal" to the given object, as
    * defined above, or `false` otherwise.
    */
  def isEqual(other: AggregateQuery[T]): Boolean
  
  /** The query whose aggregations will be calculated by this object. */
  val query: Query[Any]
}
object AggregateQuery {
  
  inline def apply[T /* <: AggregateSpec */](
    get: () => js.Promise[AggregateQuerySnapshot[T]],
    isEqual: AggregateQuery[T] => Boolean,
    query: Query[Any]
  ): AggregateQuery[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), isEqual = js.Any.fromFunction1(isEqual), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateQuery[T]]
  }
  
  extension [Self <: AggregateQuery[?], T /* <: AggregateSpec */](x: Self & AggregateQuery[T]) {
    
    inline def setGet(value: () => js.Promise[AggregateQuerySnapshot[T]]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setIsEqual(value: AggregateQuery[T] => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setQuery(value: Query[Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
