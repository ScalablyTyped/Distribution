package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@firebase/firestore/dist/lite/internal", "QueryConstraint")
@js.native
open class QueryConstraint () extends StObject {
  
  /**
    * Takes the provided {@link Query} and returns a copy of the {@link Query} with this
    * {@link QueryConstraint} applied.
    */
  def _apply[T](query: Query_[T]): Query_[T] = js.native
  
  /** The type of this query constraints */
  val `type`: QueryConstraintType = js.native
}
