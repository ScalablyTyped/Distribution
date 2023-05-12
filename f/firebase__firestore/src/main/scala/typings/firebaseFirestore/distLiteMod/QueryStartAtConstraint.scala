package typings.firebaseFirestore.distLiteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite", "QueryStartAtConstraint")
@js.native
open class QueryStartAtConstraint ()
  extends QueryConstraint
     with QueryNonFilterConstraint {
  
  /** The type of this query constraint */
  @JSName("type")
  val type_QueryStartAtConstraint: typings.firebaseFirestore.firebaseFirestoreStrings.startAt | typings.firebaseFirestore.firebaseFirestoreStrings.startAfter = js.native
}
