package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/private", "QueryStartAtConstraint")
@js.native
open class QueryStartAtConstraint ()
  extends QueryConstraint
     with QueryNonFilterConstraint {
  
  /* private */ val _docOrFields: Any = js.native
  
  /* private */ val _inclusive: Any = js.native
  
  /** The type of this query constraint */
  @JSName("type")
  val type_QueryStartAtConstraint: typings.firebaseFirestore.firebaseFirestoreStrings.startAt | typings.firebaseFirestore.firebaseFirestoreStrings.startAfter = js.native
}
/* static members */
object QueryStartAtConstraint {
  
  @JSImport("@firebase/firestore/dist/private", "QueryStartAtConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* Excluded from this release type: __constructor */
  inline def _create(
    `type`: typings.firebaseFirestore.firebaseFirestoreStrings.startAt | typings.firebaseFirestore.firebaseFirestoreStrings.startAfter,
    _docOrFields: js.Array[Any | DocumentSnapshot2[Any]],
    _inclusive: Boolean
  ): QueryStartAtConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _docOrFields.asInstanceOf[js.Any], _inclusive.asInstanceOf[js.Any])).asInstanceOf[QueryStartAtConstraint]
}
