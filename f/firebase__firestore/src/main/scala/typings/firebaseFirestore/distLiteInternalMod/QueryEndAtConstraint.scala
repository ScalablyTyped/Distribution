package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/internal", "QueryEndAtConstraint")
@js.native
open class QueryEndAtConstraint protected ()
  extends QueryConstraint
     with QueryNonFilterConstraint {
  /**
    * @internal
    */
  /* protected */ def this(
    /** The type of this query constraint */
  `type`: typings.firebaseFirestore.firebaseFirestoreStrings.endBefore | typings.firebaseFirestore.firebaseFirestoreStrings.endAt,
    _docOrFields: js.Array[Any | DocumentSnapshot[Any]],
    _inclusive: Boolean
  ) = this()
  
  /* private */ val _docOrFields: Any = js.native
  
  /* private */ val _inclusive: Any = js.native
  
  /** The type of this query constraint */
  @JSName("type")
  val type_QueryEndAtConstraint: typings.firebaseFirestore.firebaseFirestoreStrings.endBefore | typings.firebaseFirestore.firebaseFirestoreStrings.endAt = js.native
}
/* static members */
object QueryEndAtConstraint {
  
  @JSImport("@firebase/firestore/dist/lite/internal", "QueryEndAtConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    `type`: typings.firebaseFirestore.firebaseFirestoreStrings.endBefore | typings.firebaseFirestore.firebaseFirestoreStrings.endAt,
    _docOrFields: js.Array[Any | DocumentSnapshot[Any]],
    _inclusive: Boolean
  ): QueryEndAtConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _docOrFields.asInstanceOf[js.Any], _inclusive.asInstanceOf[js.Any])).asInstanceOf[QueryEndAtConstraint]
}
