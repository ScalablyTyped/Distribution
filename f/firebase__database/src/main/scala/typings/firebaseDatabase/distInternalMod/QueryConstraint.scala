package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@firebase/database/dist/internal", "QueryConstraint")
@js.native
open class QueryConstraint () extends StObject {
  
  /**
    * Takes the provided `Query` and returns a copy of the `Query` with this
    * `QueryConstraint` applied.
    */
  def _apply[T](query: QueryImpl): QueryImpl = js.native
  
  /** The type of this query constraints */
  val `type`: QueryConstraintType = js.native
}
