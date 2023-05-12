package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/private", "QueryEndAtConstraint")
@js.native
open class QueryEndAtConstraint ()
  extends QueryConstraint
     with QueryNonFilterConstraint {
  
  /* private */ val _docOrFields: Any = js.native
  
  /* private */ val _inclusive: Any = js.native
  
  /** The type of this query constraint */
  @JSName("type")
  val type_QueryEndAtConstraint: typings.firebaseFirestore.firebaseFirestoreStrings.endBefore | typings.firebaseFirestore.firebaseFirestoreStrings.endAt = js.native
}
/* static members */
object QueryEndAtConstraint {
  
  @JSImport("@firebase/firestore/dist/private", "QueryEndAtConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* Excluded from this release type: __constructor */
  inline def _create(
    `type`: typings.firebaseFirestore.firebaseFirestoreStrings.endBefore | typings.firebaseFirestore.firebaseFirestoreStrings.endAt,
    _docOrFields: js.Array[Any | DocumentSnapshot2[Any]],
    _inclusive: Boolean
  ): QueryEndAtConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _docOrFields.asInstanceOf[js.Any], _inclusive.asInstanceOf[js.Any])).asInstanceOf[QueryEndAtConstraint]
}
