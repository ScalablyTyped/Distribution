package typings.firebaseFirestore.distFirestoreTestIntegrationUtilFirebaseExportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "QueryEndAtConstraint")
@js.native
open class QueryEndAtConstraint protected ()
  extends typings.firebaseFirestore.distFirestoreSrcMod.QueryEndAtConstraint {
  /**
    * @internal
    */
  /* protected */ def this(
    /** The type of this query constraint */
  `type`: typings.firebaseFirestore.firebaseFirestoreStrings.endBefore | typings.firebaseFirestore.firebaseFirestoreStrings.endAt,
    _docOrFields: js.Array[
        Any | typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]
      ],
    _inclusive: Boolean
  ) = this()
}
/* static members */
object QueryEndAtConstraint {
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "QueryEndAtConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    `type`: typings.firebaseFirestore.firebaseFirestoreStrings.endBefore | typings.firebaseFirestore.firebaseFirestoreStrings.endAt,
    _docOrFields: js.Array[
      Any | typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]
    ],
    _inclusive: Boolean
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(`type`.asInstanceOf[js.Any], _docOrFields.asInstanceOf[js.Any], _inclusive.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryEndAtConstraint]
}
