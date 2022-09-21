package typings.firebaseFirestore.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/private", "QueryConstraint")
@js.native
abstract class QueryConstraint () extends StObject {
  
  /**
    * Takes the provided {@link Query} and returns a copy of the {@link Query} with this
    * {@link QueryConstraint} applied.
    */
  def _apply[T](query: Query_[T]): Query_[T] = js.native
  
  /** The type of this query constraints */
  val `type`: QueryConstraintType = js.native
}
