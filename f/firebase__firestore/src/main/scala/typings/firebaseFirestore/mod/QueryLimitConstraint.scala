package typings.firebaseFirestore.mod

import typings.firebaseFirestore.firebaseFirestoreStrings.limitToLast_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore", "QueryLimitConstraint")
@js.native
open class QueryLimitConstraint ()
  extends QueryConstraint
     with QueryNonFilterConstraint {
  
  /** The type of this query constraint */
  @JSName("type")
  val type_QueryLimitConstraint: typings.firebaseFirestore.firebaseFirestoreStrings.limit | limitToLast_ = js.native
}
